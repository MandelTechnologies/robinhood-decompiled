package com.plaid.internal;

import android.net.Network;
import com.plaid.internal.AbstractC6056c7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.I */
/* loaded from: classes16.dex */
public final class C5864I {
    /* renamed from: a */
    public final C6033a4 m1214a(String urlText, Network network) throws AbstractC6056c7.c, AbstractC6056c7.d, IOException {
        Intrinsics.checkNotNullParameter(urlText, "urlText");
        Intrinsics.checkNotNullParameter(network, "network");
        try {
            URLConnection uRLConnectionOpenConnection = network.openConnection(new URL(urlText));
            if (uRLConnectionOpenConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestMethod("POST");
            C6033a4 c6033a4 = new C6033a4(httpURLConnection.getResponseCode(), m1213a(httpURLConnection));
            httpURLConnection.disconnect();
            return c6033a4;
        } catch (AbstractC6056c7.d e) {
            throw e;
        } catch (Exception e2) {
            throw new AbstractC6056c7.c(e2);
        }
    }

    /* renamed from: a */
    public static String m1213a(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        String str = "";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return str;
            }
            str = str + line;
        }
    }
}
