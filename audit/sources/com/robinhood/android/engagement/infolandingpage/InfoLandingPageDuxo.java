package com.robinhood.android.engagement.infolandingpage;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.engagement.lib.infolandingpage.InfoLandingPageStore;
import com.robinhood.android.engagement.lib.infolandingpage.contracts.InfoLandingPageFragmentKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.api.rewardoffer.ApiRewardOfferDetails;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InfoLandingPageDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0013B+\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageDataState;", "Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "infoLandingPageStore", "Lcom/robinhood/android/engagement/lib/infolandingpage/InfoLandingPageStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageDataStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/engagement/lib/infolandingpage/InfoLandingPageStore;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageDataStateProvider;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-info-landing-page_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class InfoLandingPageDuxo extends BaseDuxo<InfoLandingPageDataState, InfoLandingPageViewState> implements HasSavedState {
    private final InfoLandingPageStore infoLandingPageStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ InfoLandingPageDuxo(InfoLandingPageStore infoLandingPageStore, DuxoBundle duxoBundle, InfoLandingPageDuxo2 infoLandingPageDuxo2, SavedStateHandle savedStateHandle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(infoLandingPageStore, duxoBundle, (i & 4) != 0 ? new InfoLandingPageDuxo2() : infoLandingPageDuxo2, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoLandingPageDuxo(InfoLandingPageStore infoLandingPageStore, DuxoBundle duxoBundle, InfoLandingPageDuxo2 stateProvider, SavedStateHandle savedStateHandle) {
        super(new InfoLandingPageDataState(null, null, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(infoLandingPageStore, "infoLandingPageStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.infoLandingPageStore = infoLandingPageStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: InfoLandingPageDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageDuxo;", "Lcom/robinhood/android/engagement/lib/infolandingpage/contracts/InfoLandingPageFragmentKey;", "<init>", "()V", "feature-info-landing-page_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<InfoLandingPageDuxo, InfoLandingPageFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InfoLandingPageFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (InfoLandingPageFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InfoLandingPageFragmentKey getArgs(InfoLandingPageDuxo infoLandingPageDuxo) {
            return (InfoLandingPageFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, infoLandingPageDuxo);
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C145841(null), 3, null);
    }

    /* compiled from: InfoLandingPageDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.engagement.infolandingpage.InfoLandingPageDuxo$onStart$1", m3645f = "InfoLandingPageDuxo.kt", m3646l = {35}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.engagement.infolandingpage.InfoLandingPageDuxo$onStart$1 */
    static final class C145841 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C145841(Continuation<? super C145841> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C145841 c145841 = InfoLandingPageDuxo.this.new C145841(continuation);
            c145841.L$0 = obj;
            return c145841;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C145841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    InfoLandingPageDuxo infoLandingPageDuxo = InfoLandingPageDuxo.this;
                    Result.Companion companion = Result.INSTANCE;
                    InfoLandingPageStore infoLandingPageStore = infoLandingPageDuxo.infoLandingPageStore;
                    UUID pageId = ((InfoLandingPageFragmentKey) InfoLandingPageDuxo.INSTANCE.getArgs((HasSavedState) infoLandingPageDuxo)).getPageId();
                    this.label = 1;
                    obj = infoLandingPageStore.getInfoLandingPage(pageId, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl((ApiRewardOfferDetails) obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            InfoLandingPageDuxo infoLandingPageDuxo2 = InfoLandingPageDuxo.this;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl == null) {
                infoLandingPageDuxo2.applyMutation(new InfoLandingPageDuxo3((ApiRewardOfferDetails) objM28550constructorimpl, null));
            } else {
                infoLandingPageDuxo2.applyMutation(new InfoLandingPageDuxo4(thM28553exceptionOrNullimpl, null));
            }
            return Unit.INSTANCE;
        }
    }
}
