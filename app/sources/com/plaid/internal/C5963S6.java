package com.plaid.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import androidx.core.content.FileProvider;
import androidx.view.result.contract.ActivityResultContract;
import androidx.view.result.contract.ActivityResultContracts$TakePicture;
import com.plaid.internal.C5835E6;
import com.plaid.internal.C5953R5;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* renamed from: com.plaid.internal.S6 */
/* loaded from: classes16.dex */
public final class C5963S6 extends ActivityResultContract<Unit, Uri> {

    /* renamed from: a */
    public final C6044b5 f1691a;

    /* renamed from: b */
    public final ActivityResultContracts$TakePicture f1692b;

    /* renamed from: c */
    public final AtomicReference<Uri> f1693c;

    @DebugMetadata(m3644c = "com.plaid.internal.workflow.TakePictureWithAppInternalUri$createInternalUri$file$1", m3645f = "TakePictureWithAppInternalUri.kt", m3646l = {55}, m3647m = "invokeSuspend")
    /* renamed from: com.plaid.internal.S6$a */
    public static final class a extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super File>, Object> {

        /* renamed from: a */
        public int f1694a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C5963S6.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
            return C5963S6.this.new a(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1694a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            C6044b5 c6044b5 = C5963S6.this.f1691a;
            String strValueOf = String.valueOf(UUID.randomUUID());
            this.f1694a = 1;
            c6044b5.getClass();
            Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C5997W4(c6044b5, strValueOf, null), this);
            return objWithContext == coroutine_suspended ? coroutine_suspended : objWithContext;
        }
    }

    public C5963S6(C6044b5 internalPictureStorage) {
        Intrinsics.checkNotNullParameter(internalPictureStorage, "internalPictureStorage");
        this.f1691a = internalPictureStorage;
        this.f1692b = new ActivityResultContracts$TakePicture();
        this.f1693c = new AtomicReference<>();
    }

    /* renamed from: a */
    public final Uri m1312a(Context context) {
        try {
            Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".com.plaid.link.internal.PlaidFileProvider", (File) BuildersKt__BuildersKt.runBlocking$default(null, new a(null), 1, null));
            Intrinsics.checkNotNull(uriForFile);
            return uriForFile;
        } catch (IOException e) {
            C5835E6.a.m1186a(e, "TakePictureWithAppInternalUri - Unable to create file");
            Uri uri = Uri.EMPTY;
            Intrinsics.checkNotNull(uri);
            return uri;
        }
    }

    @Override // androidx.view.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Unit unit) {
        Unit input = unit;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Uri uriM1312a = m1312a(context);
        if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m88m(this.f1693c, null, uriM1312a)) {
            Intrinsics.checkNotNullParameter("TakePictureWithAppInternalUri - Result URI was already set", "message");
            C5953R5.a.m1304b(C5953R5.f1671a, "TakePictureWithAppInternalUri - Result URI was already set");
            C5825D5 c5825d5 = C5835E6.f1339a;
            if (c5825d5 != null) {
                c5825d5.m1175a("TakePictureWithAppInternalUri - Result URI was already set");
            }
        }
        Intent intentCreateIntent = this.f1692b.createIntent(context, uriM1312a);
        intentCreateIntent.addFlags(2);
        return intentCreateIntent;
    }

    @Override // androidx.view.result.contract.ActivityResultContract
    public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, Unit unit) {
        Unit input = unit;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return null;
    }

    @Override // androidx.view.result.contract.ActivityResultContract
    public final Uri parseResult(int i, Intent intent) {
        if (i != -1) {
            Uri EMPTY = Uri.EMPTY;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            return EMPTY;
        }
        Uri andSet = this.f1693c.getAndSet(null);
        if (andSet != null) {
            return andSet;
        }
        Intrinsics.checkNotNullParameter("TakePictureWithAppInternalUri - Result URI should not be null", "message");
        C5953R5.a.m1304b(C5953R5.f1671a, "TakePictureWithAppInternalUri - Result URI should not be null");
        C5825D5 c5825d5 = C5835E6.f1339a;
        if (c5825d5 != null) {
            c5825d5.m1175a("TakePictureWithAppInternalUri - Result URI should not be null");
        }
        Uri uri = Uri.EMPTY;
        Intrinsics.checkNotNull(uri);
        return uri;
    }
}
