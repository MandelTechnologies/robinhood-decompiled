package com.robinhood.shared.education.p377ui.onboarding.terms;

import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.education.p377ui.onboarding.terms.CryptoLearnAndEarnTermsUiEvent;
import com.robinhood.staticcontent.model.disclosure.DisclosureContent;
import com.robinhood.staticcontent.store.ContentStore;
import com.robinhood.staticcontent.store.disclosure.RealDisclosureStore;
import com.robinhood.utils.extensions.Throwables;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoLearnAndEarnTermsDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/onboarding/terms/CryptoLearnAndEarnTermsDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/shared/education/ui/onboarding/terms/CryptoLearnAndEarnTermsViewState;", "Lcom/robinhood/shared/education/ui/onboarding/terms/CryptoLearnAndEarnTermsUiEvent;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "disclosureStore", "Lcom/robinhood/staticcontent/store/disclosure/RealDisclosureStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/staticcontent/store/disclosure/RealDisclosureStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onStart", "", "Companion", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoLearnAndEarnTermsDuxo extends BaseDuxo5<CryptoLearnAndEarnTermsViewState, CryptoLearnAndEarnTermsUiEvent> {
    public static final String RHC_LEARN_AND_EARN_TERMS_ID = "57Lz2HLWoPTEz737xOdGIz";
    public static final String TRADER_LEARN_AND_EARN_TERMS_ID = "6rn6qzDmaUyQ6JFnL78AiM";
    private final AppType appType;
    private final RealDisclosureStore disclosureStore;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoLearnAndEarnTermsDuxo(AppType appType, RealDisclosureStore disclosureStore, DuxoBundle duxoBundle) {
        super(new CryptoLearnAndEarnTermsViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(disclosureStore, "disclosureStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.appType = appType;
        this.disclosureStore = disclosureStore;
    }

    /* compiled from: CryptoLearnAndEarnTermsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.education.ui.onboarding.terms.CryptoLearnAndEarnTermsDuxo$onStart$1", m3645f = "CryptoLearnAndEarnTermsDuxo.kt", m3646l = {27}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.education.ui.onboarding.terms.CryptoLearnAndEarnTermsDuxo$onStart$1 */
    static final class C389081 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: CryptoLearnAndEarnTermsDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.education.ui.onboarding.terms.CryptoLearnAndEarnTermsDuxo$onStart$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AppType.values().length];
                try {
                    iArr[AppType.RHC.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C389081(Continuation<? super C389081> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C389081 c389081 = CryptoLearnAndEarnTermsDuxo.this.new C389081(continuation);
            c389081.L$0 = obj;
            return c389081;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C389081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            C389081 c389081;
            String str;
            Throwable th;
            Object objM28550constructorimpl;
            Throwable thM28553exceptionOrNullimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoLearnAndEarnTermsDuxo cryptoLearnAndEarnTermsDuxo = CryptoLearnAndEarnTermsDuxo.this;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    RealDisclosureStore realDisclosureStore = cryptoLearnAndEarnTermsDuxo.disclosureStore;
                    if (WhenMappings.$EnumSwitchMapping$0[cryptoLearnAndEarnTermsDuxo.appType.ordinal()] == 1) {
                        str = CryptoLearnAndEarnTermsDuxo.RHC_LEARN_AND_EARN_TERMS_ID;
                    } else {
                        str = CryptoLearnAndEarnTermsDuxo.TRADER_LEARN_AND_EARN_TERMS_ID;
                    }
                    String str2 = str;
                    this.label = 1;
                    c389081 = this;
                    try {
                        obj = ContentStore.DefaultImpls.load$default(realDisclosureStore, str2, null, c389081, 2, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        Result.Companion companion2 = Result.INSTANCE;
                        objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                        CryptoLearnAndEarnTermsDuxo cryptoLearnAndEarnTermsDuxo2 = CryptoLearnAndEarnTermsDuxo.this;
                        thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                        if (thM28553exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c389081 = this;
                    th = th;
                    Result.Companion companion22 = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                    CryptoLearnAndEarnTermsDuxo cryptoLearnAndEarnTermsDuxo22 = CryptoLearnAndEarnTermsDuxo.this;
                    thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                    if (thM28553exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    ResultKt.throwOnFailure(obj);
                    c389081 = this;
                } catch (Throwable th4) {
                    th = th4;
                    c389081 = this;
                    Result.Companion companion222 = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                    CryptoLearnAndEarnTermsDuxo cryptoLearnAndEarnTermsDuxo222 = CryptoLearnAndEarnTermsDuxo.this;
                    thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                    if (thM28553exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
            }
            objM28550constructorimpl = Result.m28550constructorimpl((DisclosureContent) obj);
            CryptoLearnAndEarnTermsDuxo cryptoLearnAndEarnTermsDuxo2222 = CryptoLearnAndEarnTermsDuxo.this;
            thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
                cryptoLearnAndEarnTermsDuxo2222.applyMutation(new CryptoLearnAndEarnTermsDuxo2((DisclosureContent) objM28550constructorimpl, null));
            } else if (Throwables.isNetworkRelated(thM28553exceptionOrNullimpl)) {
                cryptoLearnAndEarnTermsDuxo2222.submit(new CryptoLearnAndEarnTermsUiEvent.ShowFailure(thM28553exceptionOrNullimpl));
            } else {
                throw thM28553exceptionOrNullimpl;
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C389081(null), 3, null);
    }
}
