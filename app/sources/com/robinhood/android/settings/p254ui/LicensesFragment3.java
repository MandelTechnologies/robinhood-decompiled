package com.robinhood.android.settings.p254ui;

import com.robinhood.android.settings.p254ui.LicensesFragment;
import com.robinhood.utils.Okio2;
import com.squareup.moshi.JsonAdapter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlinx.coroutines.CoroutineScope;
import okio.BufferedSource;

/* compiled from: LicensesFragment.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/settings/ui/LicensesFragment$DependencyEntry;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.settings.ui.LicensesFragment$onCreate$1$dependencies$1", m3645f = "LicensesFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.settings.ui.LicensesFragment$onCreate$1$dependencies$1, reason: use source file name */
/* loaded from: classes5.dex */
final class LicensesFragment3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends LicensesFragment.DependencyEntry>>, Object> {
    int label;
    final /* synthetic */ LicensesFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LicensesFragment3(LicensesFragment licensesFragment, Continuation<? super LicensesFragment3> continuation) {
        super(2, continuation);
        this.this$0 = licensesFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LicensesFragment3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends LicensesFragment.DependencyEntry>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<LicensesFragment.DependencyEntry>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<LicensesFragment.DependencyEntry>> continuation) {
        return ((LicensesFragment3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws IOException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            InputStream inputStreamOpen = this.this$0.getResources().getAssets().open(LicensesFragment.ASSET_FILE_NAME);
            Intrinsics.checkNotNull(inputStreamOpen);
            BufferedSource bufferedSource = Okio2.bufferedSource(inputStreamOpen);
            JsonAdapter jsonAdapter = this.this$0.dependencyListJsonAdapter;
            if (jsonAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dependencyListJsonAdapter");
                jsonAdapter = null;
            }
            try {
                List list = (List) jsonAdapter.fromJson(bufferedSource);
                Closeable.closeFinally(bufferedSource, null);
                Intrinsics.checkNotNull(list);
                return list;
            } finally {
            }
        } catch (FileNotFoundException e) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("The `licenses.json` file is missing. This is expected if you're running a UI test, or if this code is running under an app other than the main app. If you need this file for a UI test, add one manually to the `androidTest/assets` folder of your test.");
            fileNotFoundException.initCause(e);
            throw fileNotFoundException;
        }
    }
}
