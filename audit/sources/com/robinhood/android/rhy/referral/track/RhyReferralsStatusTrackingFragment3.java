package com.robinhood.android.rhy.referral.track;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingViewState;
import com.robinhood.models.rhy.referral.p345db.RhyReferralAttribution;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: RhyReferralsStatusTrackingFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.rhy.referral.track.ComposableSingletons$RhyReferralsStatusTrackingFragmentKt$lambda$1988421232$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RhyReferralsStatusTrackingFragment3 implements Function2<Composer, Integer, Unit> {
    public static final RhyReferralsStatusTrackingFragment3 INSTANCE = new RhyReferralsStatusTrackingFragment3();

    RhyReferralsStatusTrackingFragment3() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1988421232, i, -1, "com.robinhood.android.rhy.referral.track.ComposableSingletons$RhyReferralsStatusTrackingFragmentKt.lambda$1988421232.<anonymous> (RhyReferralsStatusTrackingFragment.kt:105)");
        }
        RhyReferralsStatusTrackingViewState.Loaded loadedGenerate = RhyReferralsStatusTrackingViewState_LoadedMock.INSTANCE.generate();
        ImmutableList3 persistentList = extensions2.toPersistentList(loadedGenerate.getPendingInvites());
        ImmutableList3 persistentList2 = extensions2.toPersistentList(loadedGenerate.getCompletedInvites());
        boolean showRemindRequestDialog = loadedGenerate.getShowRemindRequestDialog();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.rhy.referral.track.ComposableSingletons$RhyReferralsStatusTrackingFragmentKt$lambda$1988421232$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyReferralsStatusTrackingFragment3.invoke$lambda$1$lambda$0((RhyReferralAttribution) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.rhy.referral.track.ComposableSingletons$RhyReferralsStatusTrackingFragmentKt$lambda$1988421232$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyReferralsStatusTrackingFragment3.invoke$lambda$3$lambda$2((RhyReferralAttribution) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function1 function12 = (Function1) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.rhy.referral.track.ComposableSingletons$RhyReferralsStatusTrackingFragmentKt$lambda$1988421232$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyReferralsStatusTrackingFragment3.invoke$lambda$5$lambda$4((RhyReferralsStatusInfoSheetData) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        Function1 function13 = (Function1) objRememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.rhy.referral.track.ComposableSingletons$RhyReferralsStatusTrackingFragmentKt$lambda$1988421232$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        RhyReferralsStatusTrackingComposable.RhyReferralsStatusTrackingComposable(persistentList, persistentList2, showRemindRequestDialog, function1, function12, function13, (Function0) objRememberedValue4, null, composer, 1797120, 128);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(RhyReferralAttribution it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(RhyReferralAttribution it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(RhyReferralsStatusInfoSheetData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
