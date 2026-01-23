package io.branch.referral;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes21.dex */
class GooglePlayStoreAttribution {
    private static IInstallReferrerEvents callback_ = null;
    static boolean erroredOut = false;
    static boolean hasBeenUsed = false;
    private static String installID_ = "bnc_no_value";

    interface IInstallReferrerEvents {
        void onInstallReferrerEventsFinished();
    }

    GooglePlayStoreAttribution() {
    }

    void captureInstallReferrer(final Context context, long j, IInstallReferrerEvents iInstallReferrerEvents) {
        hasBeenUsed = true;
        callback_ = iInstallReferrerEvents;
        try {
            final InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(context).build();
            installReferrerClientBuild.startConnection(new InstallReferrerStateListener() { // from class: io.branch.referral.GooglePlayStoreAttribution.1
                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerSetupFinished(int i) {
                    String installReferrer;
                    long referrerClickTimestampSeconds;
                    long installBeginTimestampSeconds;
                    PrefHelper.Debug("onInstallReferrerSetupFinished, responseCode = " + i);
                    if (i != -1) {
                        if (i == 0) {
                            try {
                                ReferrerDetails installReferrer2 = installReferrerClientBuild.getInstallReferrer();
                                if (installReferrer2 != null) {
                                    installReferrer = installReferrer2.getInstallReferrer();
                                    referrerClickTimestampSeconds = installReferrer2.getReferrerClickTimestampSeconds();
                                    installBeginTimestampSeconds = installReferrer2.getInstallBeginTimestampSeconds();
                                } else {
                                    installReferrer = null;
                                    referrerClickTimestampSeconds = 0;
                                    installBeginTimestampSeconds = 0;
                                }
                                GooglePlayStoreAttribution.onReferrerClientFinished(context, installReferrer, referrerClickTimestampSeconds, installBeginTimestampSeconds);
                                return;
                            } catch (RemoteException e) {
                                PrefHelper.Debug("onInstallReferrerSetupFinished() Remote Exception: " + e.getMessage());
                                GooglePlayStoreAttribution.onReferrerClientError();
                                return;
                            } catch (Exception e2) {
                                PrefHelper.Debug("onInstallReferrerSetupFinished() Exception: " + e2.getMessage());
                                GooglePlayStoreAttribution.onReferrerClientError();
                                return;
                            }
                        }
                        if (i != 1 && i != 2 && i != 3) {
                            return;
                        }
                    }
                    GooglePlayStoreAttribution.onReferrerClientError();
                }

                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerServiceDisconnected() {
                    PrefHelper.Debug("onInstallReferrerServiceDisconnected()");
                }
            });
        } catch (Throwable th) {
            PrefHelper.Debug("ReferrerClientWrapper Exception: " + th.getMessage());
        }
        new Timer().schedule(new TimerTask() { // from class: io.branch.referral.GooglePlayStoreAttribution.2
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                GooglePlayStoreAttribution.reportInstallReferrer();
            }
        }, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onReferrerClientFinished(Context context, String str, long j, long j2) throws UnsupportedEncodingException {
        PrefHelper.Debug("onReferrerClientFinished()");
        processReferrerInfo(context, str, j, j2);
        reportInstallReferrer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onReferrerClientError() {
        PrefHelper.Debug("onReferrerClientError()");
        erroredOut = true;
        reportInstallReferrer();
    }

    private static void processReferrerInfo(Context context, String str, long j, long j2) throws UnsupportedEncodingException {
        PrefHelper prefHelper = PrefHelper.getInstance(context);
        if (j > 0) {
            prefHelper.setLong("bnc_referrer_click_ts", j);
        }
        if (j2 > 0) {
            prefHelper.setLong("bnc_install_begin_ts", j2);
        }
        if (str != null) {
            try {
                String strDecode = URLDecoder.decode(str, "UTF-8");
                HashMap map = new HashMap();
                for (String str2 : strDecode.split("&")) {
                    if (!TextUtils.isEmpty(str2)) {
                        String[] strArrSplit = str2.split((str2.contains("=") || !str2.contains("-")) ? "=" : "-");
                        if (strArrSplit.length > 1) {
                            map.put(URLDecoder.decode(strArrSplit[0], "UTF-8"), URLDecoder.decode(strArrSplit[1], "UTF-8"));
                        }
                    }
                }
                Defines$Jsonkey defines$Jsonkey = Defines$Jsonkey.LinkClickID;
                if (map.containsKey(defines$Jsonkey.getKey())) {
                    String str3 = (String) map.get(defines$Jsonkey.getKey());
                    installID_ = str3;
                    prefHelper.setLinkClickIdentifier(str3);
                }
                Defines$Jsonkey defines$Jsonkey2 = Defines$Jsonkey.IsFullAppConv;
                if (map.containsKey(defines$Jsonkey2.getKey())) {
                    Defines$Jsonkey defines$Jsonkey3 = Defines$Jsonkey.ReferringLink;
                    if (map.containsKey(defines$Jsonkey3.getKey())) {
                        prefHelper.setIsFullAppConversion(Boolean.parseBoolean((String) map.get(defines$Jsonkey2.getKey())));
                        prefHelper.setAppLink((String) map.get(defines$Jsonkey3.getKey()));
                    }
                }
                Defines$Jsonkey defines$Jsonkey4 = Defines$Jsonkey.GoogleSearchInstallReferrer;
                if (map.containsKey(defines$Jsonkey4.getKey())) {
                    prefHelper.setGoogleSearchInstallIdentifier((String) map.get(defines$Jsonkey4.getKey()));
                    prefHelper.setGooglePlayReferrer(strDecode);
                }
                if (map.containsValue(Defines$Jsonkey.PlayAutoInstalls.getKey())) {
                    prefHelper.setGooglePlayReferrer(strDecode);
                    BranchPreinstall.setBranchPreInstallGoogleReferrer(context, map);
                }
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
                PrefHelper.Debug("Illegal characters in url encoded string");
            }
        }
    }

    public static String getInstallationID() {
        return installID_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void reportInstallReferrer() {
        IInstallReferrerEvents iInstallReferrerEvents = callback_;
        if (iInstallReferrerEvents != null) {
            iInstallReferrerEvents.onInstallReferrerEventsFinished();
            callback_ = null;
        }
    }
}
