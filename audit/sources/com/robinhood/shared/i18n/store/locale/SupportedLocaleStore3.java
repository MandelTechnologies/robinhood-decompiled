package com.robinhood.shared.i18n.store.locale;

import com.robinhood.shared.i18n.models.locale.api.ApiRemoteSupportedLocale;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SupportedLocaleStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/shared/i18n/models/locale/api/ApiRemoteSupportedLocale;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.i18n.store.locale.SupportedLocaleStore$endpoint$2", m3645f = "SupportedLocaleStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.i18n.store.locale.SupportedLocaleStore$endpoint$2, reason: use source file name */
/* loaded from: classes21.dex */
final class SupportedLocaleStore3 extends ContinuationImpl7 implements Function2<ApiRemoteSupportedLocale, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SupportedLocaleStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SupportedLocaleStore3(SupportedLocaleStore supportedLocaleStore, Continuation<? super SupportedLocaleStore3> continuation) {
        super(2, continuation);
        this.this$0 = supportedLocaleStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SupportedLocaleStore3 supportedLocaleStore3 = new SupportedLocaleStore3(this.this$0, continuation);
        supportedLocaleStore3.L$0 = obj;
        return supportedLocaleStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiRemoteSupportedLocale apiRemoteSupportedLocale, Continuation<? super Unit> continuation) {
        return ((SupportedLocaleStore3) create(apiRemoteSupportedLocale, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            String androidLanguageTag = this.this$0.toAndroidLanguageTag(((ApiRemoteSupportedLocale) this.L$0).getSupportedLocale());
            this.this$0.remoteSupportedLocalePref.set(androidLanguageTag);
            CrashReporter.INSTANCE.addMetadata("Locale.supported_api", androidLanguageTag);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
