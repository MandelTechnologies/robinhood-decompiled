package io.branch.referral.network;

import android.net.TrafficStats;
import android.os.Build;
import android.os.NetworkOnMainThreadException;
import com.google.android.gms.common.util.Strings;
import io.branch.referral.Branch;
import io.branch.referral.Defines$HeaderKey;
import io.branch.referral.PrefHelper;
import io.branch.referral.network.BranchRemoteInterface;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes21.dex */
public class BranchRemoteInterfaceUrlConnection extends BranchRemoteInterface {
    private final Branch branch;

    public BranchRemoteInterfaceUrlConnection(Branch branch) {
        this.branch = branch;
    }

    @Override // io.branch.referral.network.BranchRemoteInterface
    public BranchRemoteInterface.BranchResponse doRestfulGet(String str) throws BranchRemoteInterface.BranchRemoteException {
        return doRestfulGet(str, 0);
    }

    @Override // io.branch.referral.network.BranchRemoteInterface
    public BranchRemoteInterface.BranchResponse doRestfulPost(String str, JSONObject jSONObject) throws BranchRemoteInterface.BranchRemoteException {
        return doRestfulPost(str, jSONObject, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa A[Catch: all -> 0x0076, IOException -> 0x007a, SocketTimeoutException -> 0x007d, SocketException -> 0x0080, FileNotFoundException -> 0x00b8, TRY_LEAVE, TryCatch #4 {FileNotFoundException -> 0x00b8, blocks: (B:33:0x0096, B:35:0x009c, B:36:0x00aa), top: B:65:0x0096 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private BranchRemoteInterface.BranchResponse doRestfulGet(String str, int i) throws Throwable {
        int timeout;
        HttpsURLConnection httpsURLConnection;
        BranchRemoteInterface.BranchResponse branchResponse;
        PrefHelper prefHelper = PrefHelper.getInstance(this.branch.getApplicationContext());
        HttpsURLConnection httpsURLConnection2 = null;
        try {
            try {
                timeout = prefHelper.getTimeout();
                httpsURLConnection = (HttpsURLConnection) new URL(str + (str.contains("?") ? "&" : "?") + "retryNumber=" + i).openConnection();
            } catch (Throwable th) {
                th = th;
            }
        } catch (SocketException e) {
            e = e;
        } catch (SocketTimeoutException unused) {
        } catch (IOException e2) {
            e = e2;
        }
        try {
            httpsURLConnection.setConnectTimeout(timeout);
            httpsURLConnection.setReadTimeout(timeout);
            String headerField = httpsURLConnection.getHeaderField(Defines$HeaderKey.RequestId.getKey());
            maybeSetCloseRequestFlag(httpsURLConnection);
            int responseCode = httpsURLConnection.getResponseCode();
            if (responseCode >= 500 && i < prefHelper.getRetryCount()) {
                try {
                    Thread.sleep(prefHelper.getRetryInterval());
                } catch (InterruptedException e3) {
                    e3.printStackTrace();
                }
                BranchRemoteInterface.BranchResponse branchResponseDoRestfulGet = doRestfulGet(str, i + 1);
                httpsURLConnection.disconnect();
                return branchResponseDoRestfulGet;
            }
            if (responseCode != 200) {
                try {
                    branchResponse = httpsURLConnection.getErrorStream() != null ? new BranchRemoteInterface.BranchResponse(getResponseString(httpsURLConnection.getErrorStream()), responseCode) : new BranchRemoteInterface.BranchResponse(getResponseString(httpsURLConnection.getInputStream()), responseCode);
                } catch (FileNotFoundException unused2) {
                    PrefHelper.Debug("A resource conflict occurred with this request " + str);
                    branchResponse = new BranchRemoteInterface.BranchResponse(null, responseCode);
                }
            }
            branchResponse.requestId = Strings.emptyToNull(headerField);
            httpsURLConnection.disconnect();
            return branchResponse;
        } catch (SocketException e4) {
            e = e4;
            PrefHelper.Debug("Http connect exception: " + e.getMessage());
            throw new BranchRemoteInterface.BranchRemoteException(-113);
        } catch (SocketTimeoutException unused3) {
            httpsURLConnection2 = httpsURLConnection;
            if (i >= prefHelper.getRetryCount()) {
                throw new BranchRemoteInterface.BranchRemoteException(-111);
            }
            try {
                Thread.sleep(prefHelper.getRetryInterval());
            } catch (InterruptedException e5) {
                e5.printStackTrace();
            }
            BranchRemoteInterface.BranchResponse branchResponseDoRestfulGet2 = doRestfulGet(str, i + 1);
            if (httpsURLConnection2 != null) {
                httpsURLConnection2.disconnect();
            }
            return branchResponseDoRestfulGet2;
        } catch (IOException e6) {
            e = e6;
            PrefHelper.Debug("Branch connect exception: " + e.getMessage());
            throw new BranchRemoteInterface.BranchRemoteException(-113);
        } catch (Throwable th2) {
            th = th2;
            httpsURLConnection2 = httpsURLConnection;
            if (httpsURLConnection2 != null) {
                httpsURLConnection2.disconnect();
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x008e: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:22:0x008e */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0 A[Catch: all -> 0x008d, Exception -> 0x0091, IOException -> 0x0093, SocketTimeoutException -> 0x0097, FileNotFoundException -> 0x00ce, TRY_LEAVE, TryCatch #0 {FileNotFoundException -> 0x00ce, blocks: (B:35:0x00ac, B:37:0x00b2, B:38:0x00c0), top: B:71:0x00ac }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private BranchRemoteInterface.BranchResponse doRestfulPost(String str, JSONObject jSONObject, int i) throws Throwable {
        HttpsURLConnection httpsURLConnection;
        HttpsURLConnection httpsURLConnection2;
        BranchRemoteInterface.BranchResponse branchResponse;
        PrefHelper prefHelper = PrefHelper.getInstance(this.branch.getApplicationContext());
        int timeout = prefHelper.getTimeout();
        try {
            jSONObject.put("retryNumber", i);
        } catch (JSONException unused) {
        }
        HttpsURLConnection httpsURLConnection3 = null;
        try {
            try {
                try {
                    if (Build.VERSION.SDK_INT >= 26) {
                        TrafficStats.setThreadStatsTag(102);
                    }
                    httpsURLConnection2 = (HttpsURLConnection) new URL(str).openConnection();
                    try {
                        httpsURLConnection2.setConnectTimeout(timeout);
                        httpsURLConnection2.setReadTimeout(timeout);
                        httpsURLConnection2.setDoInput(true);
                        httpsURLConnection2.setDoOutput(true);
                        httpsURLConnection2.setRequestProperty("Content-Type", "application/json");
                        httpsURLConnection2.setRequestProperty("Accept", "application/json");
                        httpsURLConnection2.setRequestMethod("POST");
                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpsURLConnection2.getOutputStream());
                        outputStreamWriter.write(jSONObject.toString());
                        outputStreamWriter.flush();
                        outputStreamWriter.close();
                        String headerField = httpsURLConnection2.getHeaderField(Defines$HeaderKey.RequestId.getKey());
                        maybeSetCloseRequestFlag(httpsURLConnection2);
                        int responseCode = httpsURLConnection2.getResponseCode();
                        if (responseCode >= 500 && i < prefHelper.getRetryCount()) {
                            try {
                                Thread.sleep(prefHelper.getRetryInterval());
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            BranchRemoteInterface.BranchResponse branchResponseDoRestfulPost = doRestfulPost(str, jSONObject, i + 1);
                            httpsURLConnection2.disconnect();
                            return branchResponseDoRestfulPost;
                        }
                        if (responseCode != 200) {
                            try {
                                branchResponse = httpsURLConnection2.getErrorStream() != null ? new BranchRemoteInterface.BranchResponse(getResponseString(httpsURLConnection2.getErrorStream()), responseCode) : new BranchRemoteInterface.BranchResponse(getResponseString(httpsURLConnection2.getInputStream()), responseCode);
                            } catch (FileNotFoundException unused2) {
                                PrefHelper.Debug("A resource conflict occurred with this request " + str);
                                branchResponse = new BranchRemoteInterface.BranchResponse(null, responseCode);
                            }
                        }
                        branchResponse.requestId = headerField;
                        httpsURLConnection2.disconnect();
                        return branchResponse;
                    } catch (SocketTimeoutException unused3) {
                        httpsURLConnection3 = httpsURLConnection2;
                        if (i >= prefHelper.getRetryCount()) {
                            throw new BranchRemoteInterface.BranchRemoteException(-111);
                        }
                        try {
                            Thread.sleep(prefHelper.getRetryInterval());
                        } catch (InterruptedException e2) {
                            e2.printStackTrace();
                        }
                        BranchRemoteInterface.BranchResponse branchResponseDoRestfulPost2 = doRestfulPost(str, jSONObject, i + 1);
                        if (httpsURLConnection3 != null) {
                            httpsURLConnection3.disconnect();
                        }
                        return branchResponseDoRestfulPost2;
                    } catch (IOException e3) {
                        e = e3;
                        PrefHelper.Debug("Http connect exception: " + e.getMessage());
                        throw new BranchRemoteInterface.BranchRemoteException(-113);
                    } catch (Exception e4) {
                        e = e4;
                        PrefHelper.Debug("Exception: " + e.getMessage());
                        if (e instanceof NetworkOnMainThreadException) {
                            PrefHelper.Debug("Branch Error: Don't call our synchronous methods on the main thread!!!");
                        }
                        BranchRemoteInterface.BranchResponse branchResponse2 = new BranchRemoteInterface.BranchResponse(null, 500);
                        if (httpsURLConnection2 != null) {
                            httpsURLConnection2.disconnect();
                        }
                        return branchResponse2;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (httpsURLConnection3 != null) {
                        httpsURLConnection3.disconnect();
                    }
                    throw th;
                }
            } catch (SocketTimeoutException unused4) {
            } catch (IOException e5) {
                e = e5;
            } catch (Exception e6) {
                e = e6;
                httpsURLConnection2 = null;
            }
        } catch (Throwable th2) {
            th = th2;
            httpsURLConnection3 = httpsURLConnection;
        }
    }

    private void maybeSetCloseRequestFlag(HttpsURLConnection httpsURLConnection) {
        String headerField = httpsURLConnection.getHeaderField(Defines$HeaderKey.SendCloseRequest.getKey());
        if (headerField != null) {
            Branch branch = this.branch;
            if (branch.closeRequestNeeded) {
                return;
            }
            branch.closeRequestNeeded = Boolean.parseBoolean(headerField);
        }
    }

    private String getResponseString(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            return new BufferedReader(new InputStreamReader(inputStream)).readLine();
        } catch (IOException unused) {
            return null;
        }
    }
}
