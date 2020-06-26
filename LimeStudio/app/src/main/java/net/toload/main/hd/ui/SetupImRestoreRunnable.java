/*
 *
 *  *
 *  **    Copyright 2015, The LimeIME Open Source Project
 *  **
 *  **    Project Url: http://github.com/lime-ime/limeime/
 *  **                 http://android.toload.net/
 *  **
 *  **    This program is free software: you can redistribute it and/or modify
 *  **    it under the terms of the GNU General Public License as published by
 *  **    the Free Software Foundation, either version 3 of the License, or
 *  **    (at your option) any later version.
 *  *
 *  **    This program is distributed in the hope that it will be useful,
 *  **    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  **    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  **    GNU General Public License for more details.
 *  *
 *  **    You should have received a copy of the GNU General Public License
 *  **    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *  *
 *
 */

package net.toload.main.hd.ui;

import android.os.AsyncTask;
import android.os.RemoteException;

import com.dropbox.client2.DropboxAPI;
import com.dropbox.client2.ProgressListener;
import com.dropbox.client2.android.AndroidAuthSession;
import com.dropbox.client2.exception.DropboxException;
import com.dropbox.client2.exception.DropboxServerException;
import com.dropbox.client2.exception.DropboxUnlinkedException;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpResponse;
import com.google.api.services.drive.Drive;

import net.toload.main.hd.DBServer;
import net.toload.main.hd.Lime;
import net.toload.main.hd.R;
import net.toload.main.hd.SearchServer;
import net.toload.main.hd.global.LIME;
import net.toload.main.hd.global.LIMEPreferenceManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Art Hung on 2015/4/26.
 */
public class SetupImRestoreRunnable implements Runnable {

    // Global
    private String mType;
    private SetupImFragment mFragment;
    private SearchServer SearchSrv;

    private SetupImHandler mHandler;

    public SetupImRestoreRunnable(SetupImFragment fragment, SetupImHandler handler, String type) {
        this.mHandler = handler;
        this.mType = type;
        this.mFragment = fragment;
        this.SearchSrv = new SearchServer(this.mFragment.getActivity());
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public void run() {

        // Clean the cache before restore the data
        this.SearchSrv.initialCache();

        switch (mType) {
            case Lime.LOCAL:
                try {
                    mHandler.showProgress(true, this.mFragment.getResources().getString(R.string.setup_im_restore_message));
                    DBServer.restoreDatabase();
                    mHandler.cancelProgress();
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
                break;
        }
    }
}

