package com.plaid.internal;

import android.app.Application;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.util.Base64;
import com.plaid.internal.C5953R5;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIterator2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* renamed from: com.plaid.internal.f */
/* loaded from: classes16.dex */
public final class C7071f {

    /* renamed from: a */
    public ArrayList<String> f2760a;

    /* renamed from: com.plaid.internal.f$a */
    public static final class a {
        /* renamed from: a */
        public static String m1501a(String str, String str2) throws NoSuchAlgorithmException {
            String str3 = str + PlaceholderUtils.XXShortPlaceholderText + str2;
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                Charset UTF_8 = StandardCharsets.UTF_8;
                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                byte[] bytes = str3.getBytes(UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                messageDigest.update(bytes);
                String strEncodeToString = Base64.encodeToString(Arrays.copyOfRange(messageDigest.digest(), 0, 9), 3);
                Intrinsics.checkNotNull(strEncodeToString);
                String strSubstring = strEncodeToString.substring(0, 11);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            } catch (NoSuchAlgorithmException e) {
                C5953R5.a.m1305b(C5953R5.f1671a, "hash:NoSuchAlgorithm", new Object[]{e});
                return null;
            }
        }
    }

    /* renamed from: a */
    public final String m1500a(Application application) throws NoSuchAlgorithmException {
        Signature[] apkContentsSigners;
        Intrinsics.checkNotNullParameter(application, "application");
        ArrayList<String> arrayList = null;
        if (this.f2760a == null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            try {
                String packageName = application.getPackageName();
                PackageManager packageManager = application.getPackageManager();
                if (Build.VERSION.SDK_INT < 28) {
                    apkContentsSigners = packageManager.getPackageInfo(packageName, 64).signatures;
                } else {
                    SigningInfo signingInfo = packageManager.getPackageInfo(packageName, 134217728).signingInfo;
                    apkContentsSigners = signingInfo != null ? signingInfo.getApkContentsSigners() : null;
                }
                if (apkContentsSigners != null) {
                    Iterator it = ArrayIterator2.iterator(apkContentsSigners);
                    while (it.hasNext()) {
                        Signature signature = (Signature) it.next();
                        Intrinsics.checkNotNull(packageName);
                        String charsString = signature.toCharsString();
                        Intrinsics.checkNotNullExpressionValue(charsString, "toCharsString(...)");
                        String strM1501a = a.m1501a(packageName, charsString);
                        if (strM1501a != null) {
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            String str = String.format("%s", Arrays.copyOf(new Object[]{strM1501a}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                            arrayList2.add(str);
                        }
                    }
                }
                this.f2760a = arrayList2;
            } catch (PackageManager.NameNotFoundException e) {
                Object[] args = {e};
                C5953R5.f1671a.getClass();
                Intrinsics.checkNotNullParameter(args, "args");
                C5953R5.f1672b.mo1264a("Unable to find package to obtain hash.", new Object[]{args}, true);
            }
        }
        ArrayList<String> arrayList3 = this.f2760a;
        if (arrayList3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appSignatures");
        } else {
            arrayList = arrayList3;
        }
        return (String) CollectionsKt.firstOrNull((List) arrayList);
    }
}
