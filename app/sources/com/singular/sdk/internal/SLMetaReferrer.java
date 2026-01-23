package com.singular.sdk.internal;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.room.support.AutoClosingRoomOpenHelper;
import com.singular.sdk.internal.InstallReferrer.SLInstallReferrerCompletionHandler;
import com.singular.sdk.internal.InstallReferrer.SLInstallReferrerService;
import java.util.HashMap;

/* loaded from: classes12.dex */
public class SLMetaReferrer implements SLInstallReferrerService {
    private static final String sourceName = "facebook";

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.singular.sdk.internal.InstallReferrer.SLInstallReferrerService
    public void fetchReferrer(Context context, SLInstallReferrerCompletionHandler sLInstallReferrerCompletionHandler) {
        Cursor cursorQuery;
        Uri uri;
        AutoClosingRoomOpenHelper.KeepAliveCursor keepAliveCursor = 0;
        if (context == null) {
            sLInstallReferrerCompletionHandler.onInstallReferrerReceived(null);
            return;
        }
        String str = SingularInstance.getInstance().getSingularConfig().facebookAppId;
        try {
            if (Utils.isEmptyOrNull(str)) {
                sLInstallReferrerCompletionHandler.onInstallReferrerReceived(null);
                return;
            }
            try {
                String[] strArr = {com.adjust.sdk.Constants.INSTALL_REFERRER, "is_ct", "actual_timestamp"};
                if (context.getPackageManager().resolveContentProvider(Constants.FACEBOOK_CONTENT_URI_STRING, 0) != null) {
                    uri = Uri.parse(String.format("content://%s/%s", Constants.FACEBOOK_CONTENT_URI_STRING, str));
                } else {
                    if (context.getPackageManager().resolveContentProvider(Constants.INSTAGRAM_CONTENT_URI_STRING, 0) == null) {
                        sLInstallReferrerCompletionHandler.onInstallReferrerReceived(null);
                        return;
                    }
                    uri = Uri.parse(String.format("content://%s/%s", Constants.INSTAGRAM_CONTENT_URI_STRING, str));
                }
                cursorQuery = context.getContentResolver().query(uri, strArr, null, null, null);
                try {
                    if (cursorQuery == null) {
                        sLInstallReferrerCompletionHandler.onInstallReferrerReceived(null);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                            return;
                        }
                        return;
                    }
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        sLInstallReferrerCompletionHandler.onInstallReferrerReceived(null);
                        cursorQuery.close();
                        return;
                    }
                    int columnIndex = cursorQuery.getColumnIndex(com.adjust.sdk.Constants.INSTALL_REFERRER);
                    int columnIndex2 = cursorQuery.getColumnIndex("actual_timestamp");
                    int columnIndex3 = cursorQuery.getColumnIndex("is_ct");
                    int i = -1;
                    String string2 = (columnIndex == -1 || cursorQuery.getType(columnIndex) != 3) ? null : cursorQuery.getString(columnIndex);
                    int i2 = (columnIndex2 == -1 || cursorQuery.getType(columnIndex2) != 3) ? -1 : Integer.parseInt(cursorQuery.getString(columnIndex2));
                    if (columnIndex3 != -1 && cursorQuery.getType(columnIndex3) == 3) {
                        i = Integer.parseInt(cursorQuery.getString(columnIndex3));
                    }
                    HashMap map = new HashMap();
                    map.put("facebook_install_referrer", string2);
                    map.put("facebook_actual_timestamp", Integer.valueOf(i2));
                    map.put("facebook_is_ct", Integer.valueOf(i));
                    sLInstallReferrerCompletionHandler.onInstallReferrerReceived(map);
                    cursorQuery.close();
                } catch (Exception unused) {
                    sLInstallReferrerCompletionHandler.onInstallReferrerReceived(null);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            } catch (Exception unused2) {
                cursorQuery = null;
            } catch (Throwable th) {
                th = th;
                if (keepAliveCursor != 0) {
                    keepAliveCursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            keepAliveCursor = Constants.INSTAGRAM_CONTENT_URI_STRING;
        }
    }
}
