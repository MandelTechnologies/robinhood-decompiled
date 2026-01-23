package com.plaid.internal;

import android.net.Uri;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.view.result.ActivityResultLauncher;
import com.plaid.internal.C5835E6;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* renamed from: com.plaid.internal.K4 */
/* loaded from: classes16.dex */
public final class C5887K4 extends WebChromeClient {

    /* renamed from: a */
    public final ActivityResultLauncher<String> f1426a;

    /* renamed from: b */
    public final ActivityResultLauncher<Unit> f1427b;

    /* renamed from: c */
    public final C5800A7 f1428c;

    /* renamed from: d */
    public final C7235v7 f1429d;

    /* renamed from: com.plaid.internal.K4$a */
    public static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: a */
        public final /* synthetic */ PermissionRequest f1430a;

        /* renamed from: b */
        public final /* synthetic */ String[] f1431b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PermissionRequest permissionRequest, String[] strArr) {
            super(0);
            this.f1430a = permissionRequest;
            this.f1431b = strArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f1430a.grant(this.f1431b);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.plaid.internal.K4$b */
    public static final class b extends Lambda implements Function0<Unit> {

        /* renamed from: a */
        public final /* synthetic */ PermissionRequest f1432a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PermissionRequest permissionRequest) {
            super(0);
            this.f1432a = permissionRequest;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f1432a.deny();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.plaid.internal.K4$c */
    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ActivityResultLauncher<Unit> activityResultLauncher = C5887K4.this.f1427b;
            Unit unit = Unit.INSTANCE;
            activityResultLauncher.launch(unit);
            return unit;
        }
    }

    public C5887K4(ActivityResultLauncher inputFileResultContract, ActivityResultLauncher takePictureContract, C5800A7 listener, C7235v7 permissionHelper) {
        Intrinsics.checkNotNullParameter(inputFileResultContract, "inputFileResultContract");
        Intrinsics.checkNotNullParameter(takePictureContract, "takePictureContract");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(permissionHelper, "permissionHelper");
        this.f1426a = inputFileResultContract;
        this.f1427b = takePictureContract;
        this.f1428c = listener;
        this.f1429d = permissionHelper;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (permissionRequest == null) {
            return;
        }
        String[] resources = permissionRequest.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        if (ArraysKt.contains(resources, "android.webkit.resource.VIDEO_CAPTURE")) {
            String[] strArr = (String[]) CollectionsKt.listOf("android.webkit.resource.VIDEO_CAPTURE").toArray(new String[0]);
            if (this.f1429d.m1632a()) {
                permissionRequest.grant(strArr);
            } else {
                this.f1429d.m1631a(new a(permissionRequest, strArr), new b(permissionRequest));
            }
        }
        String[] resources2 = permissionRequest.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        ArrayList arrayList = new ArrayList();
        for (String str : resources2) {
            if (!Intrinsics.areEqual(str, "android.webkit.resource.VIDEO_CAPTURE")) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C5835E6.a.m1187a("WebView requesting unsupported permission - " + ((String) it.next()));
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView view, int i) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (i == 100) {
            i = 0;
        }
        super.onProgressChanged(view, i);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        String[] acceptTypes;
        if (valueCallback == null) {
            return false;
        }
        this.f1428c.f1249n = valueCallback;
        if (fileChooserParams == null || !fileChooserParams.isCaptureEnabled() || (acceptTypes = fileChooserParams.getAcceptTypes()) == null || !ArraysKt.contains(acceptTypes, "image/jpeg")) {
            this.f1426a.launch("*/*");
            return true;
        }
        if (webView == null) {
            return false;
        }
        if (this.f1429d.m1632a()) {
            this.f1427b.launch(Unit.INSTANCE);
        } else {
            C7235v7 c7235v7 = this.f1429d;
            c success = new c();
            C5842F4 failure = C5842F4.f1344a;
            c7235v7.getClass();
            Intrinsics.checkNotNullParameter(success, "success");
            Intrinsics.checkNotNullParameter(failure, "failure");
            c7235v7.f3254f = success;
            c7235v7.f3255g = failure;
            c7235v7.f3256h.launch("android.permission.CAMERA");
        }
        return true;
    }
}
