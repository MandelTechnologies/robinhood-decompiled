package com.robinhood.shared.posttransfer;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.Logger;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.onboarding.nggoldearningsindepositstep.contracts.NGGoldEarningsService;
import com.robinhood.shared.common.microgramdeeplinklaunch.RealMicrogramDeeplinkService;
import com.robinhood.shared.common.microgramuilaunch.RealMicrogramUiLaunchService2;
import com.robinhood.shared.posttransfer.TransferTimelineEvent;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.moshi.LazyMoshi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;
import microgram.service.protocol.ProtocolExceptions5;

/* compiled from: TransferTimelineDuxo.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001aB;\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0019\u001a\u00020\u0002H\u0016R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/TransferTimelineDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/shared/posttransfer/TransferTimelineEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "context", "Landroid/content/Context;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/utils/moshi/LazyMoshi;Landroid/content/Context;Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/android/microgramsdui/MicrogramManager;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "ngGoldEarningsMicrogramComponent", "Lmicrogram/android/inject/MicrogramComponent;", "ngGoldEarningsService", "Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService;", "onCreate", "Companion", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class TransferTimelineDuxo extends BaseDuxo5<Unit, TransferTimelineEvent> implements HasSavedState {
    public static final String TRANSFER_NG_GOLD_EARNINGS_ENTRYPOINT = "ng_earnings_transfer";
    private final MicrogramComponent ngGoldEarningsMicrogramComponent;
    private final NGGoldEarningsService ngGoldEarningsService;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferTimelineDuxo(DuxoBundle duxoBundle, LazyMoshi moshi, Context context, Navigator navigator, MicrogramManager microgramManager, SavedStateHandle savedStateHandle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
        MicrogramComponent componentWithUiLaunch = RealMicrogramUiLaunchService2.getComponentWithUiLaunch(microgramManager, new RemoteMicrogramApplication("app-ng-gold-earnings-in-deposit-step", null, 2, null), getLifecycleScope(), moshi, MapsKt.mapOf(RealMicrogramDeeplinkService.INSTANCE.getExtension(context, navigator)), new Function1() { // from class: com.robinhood.shared.posttransfer.TransferTimelineDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferTimelineDuxo.ngGoldEarningsMicrogramComponent$lambda$0((FragmentKey) obj);
            }
        }, new Function1() { // from class: com.robinhood.shared.posttransfer.TransferTimelineDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferTimelineDuxo.ngGoldEarningsMicrogramComponent$lambda$1(this.f$0, (DialogFragmentKey) obj);
            }
        });
        this.ngGoldEarningsMicrogramComponent = componentWithUiLaunch;
        this.ngGoldEarningsService = (NGGoldEarningsService) componentWithUiLaunch.getServiceLocator().getClient(NGGoldEarningsService.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ngGoldEarningsMicrogramComponent$lambda$0(FragmentKey it) {
        Intrinsics.checkNotNullParameter(it, "it");
        throw new IllegalStateException("ng gold earnings service doesn't launch UI.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ngGoldEarningsMicrogramComponent$lambda$1(TransferTimelineDuxo transferTimelineDuxo, DialogFragmentKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        transferTimelineDuxo.submit(new TransferTimelineEvent.LaunchNgGoldEarningsBottomSheet(key));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C395181(null), 3, null);
    }

    /* compiled from: TransferTimelineDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.posttransfer.TransferTimelineDuxo$onCreate$1", m3645f = "TransferTimelineDuxo.kt", m3646l = {59}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.posttransfer.TransferTimelineDuxo$onCreate$1 */
    static final class C395181 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C395181(Continuation<? super C395181> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TransferTimelineDuxo.this.new C395181(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C395181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    NGGoldEarningsService nGGoldEarningsService = TransferTimelineDuxo.this.ngGoldEarningsService;
                    String amount = ((UiPostTransferPage.Timeline) TransferTimelineDuxo.INSTANCE.getArgs((HasSavedState) TransferTimelineDuxo.this)).getAmount();
                    Double dBoxDouble = boxing.boxDouble(amount != null ? Double.parseDouble(amount) : 0.0d);
                    this.label = 1;
                    if (nGGoldEarningsService.showExistingUserBottomSheetIfEligible(dBoxDouble, TransferTimelineDuxo.TRANSFER_NG_GOLD_EARNINGS_ENTRYPOINT, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Throwable th) {
                Logger.INSTANCE.mo1681e("Error calling app-ng-gold-earnings-in-deposit-step showNewUserBottomSheetIfEligible:" + th + ", microgram error: " + ProtocolExceptions5.asMicrogramError(th), new Object[0]);
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: TransferTimelineDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/TransferTimelineDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/posttransfer/TransferTimelineDuxo;", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$Timeline;", "<init>", "()V", "TRANSFER_NG_GOLD_EARNINGS_ENTRYPOINT", "", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<TransferTimelineDuxo, UiPostTransferPage.Timeline> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public UiPostTransferPage.Timeline getArgs(SavedStateHandle savedStateHandle) {
            return (UiPostTransferPage.Timeline) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public UiPostTransferPage.Timeline getArgs(TransferTimelineDuxo transferTimelineDuxo) {
            return (UiPostTransferPage.Timeline) DuxoCompanion.DefaultImpls.getArgs(this, transferTimelineDuxo);
        }
    }
}
