package com.robinhood.shared.posttransfer;

import com.robinhood.Logger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow2;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow3;
import com.robinhood.onboarding.resurrectionlifetimeimprovements.contracts.ResurrectionUpsellService;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.IntPreference;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.rx2.RxAwait3;
import microgram.android.inject.MicrogramComponent;
import microgram.service.protocol.ProtocolExceptions5;

/* compiled from: PostTransfersActionImpressionCapUtil.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001a:\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"resetPostTransfersGoldUpsellImpressionCapIfNeeded", "", "Lcom/robinhood/android/common/ui/BaseActivity;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "goldDepositUpsellExposureCountPref", "Lcom/robinhood/prefs/IntPreference;", "goldDepositUpsellExposureResetPref", "Lcom/robinhood/prefs/BooleanPreference;", "checkPostTransfersGoldUpsellPageImpression", "", "action", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPagesAction$ShowGoldUpsellPage;", "resurrectionApplicationMicrogramApp", "Lmicrogram/android/inject/MicrogramComponent;", "(Lcom/robinhood/android/common/ui/BaseActivity;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/prefs/IntPreference;Lcom/robinhood/models/ui/bonfire/UiPostTransferPagesAction$ShowGoldUpsellPage;Lmicrogram/android/inject/MicrogramComponent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-post-transfer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.posttransfer.PostTransfersActionImpressionCapUtilKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class PostTransfersActionImpressionCapUtil {

    /* compiled from: PostTransfersActionImpressionCapUtil.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.posttransfer.PostTransfersActionImpressionCapUtilKt", m3645f = "PostTransfersActionImpressionCapUtil.kt", m3646l = {93, 65}, m3647m = "checkPostTransfersGoldUpsellPageImpression")
    /* renamed from: com.robinhood.shared.posttransfer.PostTransfersActionImpressionCapUtilKt$checkPostTransfersGoldUpsellPageImpression$1 */
    static final class C394951 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C394951(Continuation<? super C394951> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PostTransfersActionImpressionCapUtil.checkPostTransfersGoldUpsellPageImpression(null, null, null, null, null, null, this);
        }
    }

    public static final void resetPostTransfersGoldUpsellImpressionCapIfNeeded(BaseActivity baseActivity, ExperimentsStore experimentsStore, final EventLogger eventLogger, final IntPreference goldDepositUpsellExposureCountPref, final BooleanPreference goldDepositUpsellExposureResetPref) {
        Intrinsics.checkNotNullParameter(baseActivity, "<this>");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(goldDepositUpsellExposureCountPref, "goldDepositUpsellExposureCountPref");
        Intrinsics.checkNotNullParameter(goldDepositUpsellExposureResetPref, "goldDepositUpsellExposureResetPref");
        if (goldDepositUpsellExposureResetPref.get()) {
            return;
        }
        LifecycleHost.DefaultImpls.bind$default(baseActivity, ExperimentsProvider.DefaultImpls.streamState$default(experimentsStore, new Experiment[]{AcqResetPostDepositUpsellImpressionCap.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.posttransfer.PostTransfersActionImpressionCapUtilKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostTransfersActionImpressionCapUtil.resetPostTransfersGoldUpsellImpressionCapIfNeeded$lambda$0(goldDepositUpsellExposureCountPref, goldDepositUpsellExposureResetPref, eventLogger, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resetPostTransfersGoldUpsellImpressionCapIfNeeded$lambda$0(IntPreference intPreference, BooleanPreference booleanPreference, EventLogger eventLogger, boolean z) {
        if (z) {
            intPreference.set(0);
            booleanPreference.set(true);
            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.DELETE, new Screen(Screen.Name.GOLD_DEPOSIT_UPSELL, null, null, null, 14, null), null, null, null, false, 60, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b9, code lost:
    
        if (r0 == r2) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object checkPostTransfersGoldUpsellPageImpression(BaseActivity baseActivity, ExperimentsStore experimentsStore, EventLogger eventLogger, IntPreference intPreference, PostTransferFlow3.ShowGoldUpsellPage showGoldUpsellPage, MicrogramComponent microgramComponent, Continuation<? super Boolean> continuation) {
        C394951 c394951;
        IntPreference intPreference2;
        PostTransferFlow3.ShowGoldUpsellPage showGoldUpsellPage2;
        EventLogger eventLogger2;
        MicrogramComponent microgramComponent2;
        if (continuation instanceof C394951) {
            c394951 = (C394951) continuation;
            int i = c394951.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c394951.label = i - Integer.MIN_VALUE;
            } else {
                c394951 = new C394951(continuation);
            }
        }
        Object objAwaitFirst = c394951.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c394951.label;
        try {
        } catch (Throwable th) {
            Logger.INSTANCE.mo1681e("app-resurrection-lifetime-improvements shouldShowPostDepositUpsell: " + th + ", microgram error: " + ProtocolExceptions5.asMicrogramError(th), new Object[0]);
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, true, null, 4, null);
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitFirst);
            Observable observableOnErrorReturnItem = ExperimentsProvider.DefaultImpls.streamState$default(experimentsStore, new Experiment[]{AcqGoldPostDepositUpsellUsingMicrogram.INSTANCE}, false, null, 6, null).onErrorReturnItem(boxing.boxBoolean(false));
            Intrinsics.checkNotNullExpressionValue(observableOnErrorReturnItem, "onErrorReturnItem(...)");
            c394951.L$0 = eventLogger;
            intPreference2 = intPreference;
            c394951.L$1 = intPreference2;
            showGoldUpsellPage2 = showGoldUpsellPage;
            c394951.L$2 = showGoldUpsellPage2;
            c394951.L$3 = microgramComponent;
            c394951.label = 1;
            objAwaitFirst = RxAwait3.awaitFirst(observableOnErrorReturnItem, c394951);
            if (objAwaitFirst != coroutine_suspended) {
                eventLogger2 = eventLogger;
                microgramComponent2 = microgramComponent;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwaitFirst);
            zBooleanValue = ((Boolean) objAwaitFirst).booleanValue();
            return boxing.boxBoolean(zBooleanValue);
        }
        microgramComponent2 = (MicrogramComponent) c394951.L$3;
        PostTransferFlow3.ShowGoldUpsellPage showGoldUpsellPage3 = (PostTransferFlow3.ShowGoldUpsellPage) c394951.L$2;
        IntPreference intPreference3 = (IntPreference) c394951.L$1;
        eventLogger2 = (EventLogger) c394951.L$0;
        ResultKt.throwOnFailure(objAwaitFirst);
        showGoldUpsellPage2 = showGoldUpsellPage3;
        intPreference2 = intPreference3;
        ResurrectionUpsellService resurrectionUpsellService = (ResurrectionUpsellService) microgramComponent2.getServiceLocator().getClient(ResurrectionUpsellService.class);
        String postDepositUpsellAnalyticsString = PostTransferFlow2.toPostDepositUpsellAnalyticsString(showGoldUpsellPage2);
        if (((Boolean) objAwaitFirst).booleanValue()) {
            c394951.L$0 = null;
            c394951.L$1 = null;
            c394951.L$2 = null;
            c394951.L$3 = null;
            c394951.label = 2;
            objAwaitFirst = resurrectionUpsellService.shouldShowPostDepositUpsell(postDepositUpsellAnalyticsString, c394951);
        } else {
            int i3 = intPreference2.get();
            zBooleanValue = i3 < 3;
            if (zBooleanValue) {
                intPreference2.set(i3 + 1);
            }
            PostTransfersEventLoggerUtil.logPostTransferUpsellAction(eventLogger2, postDepositUpsellAnalyticsString, i3, zBooleanValue);
            return boxing.boxBoolean(zBooleanValue);
        }
    }
}
