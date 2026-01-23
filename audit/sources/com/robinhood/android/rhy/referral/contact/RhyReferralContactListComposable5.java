package com.robinhood.android.rhy.referral.contact;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.rhy.referral.C27406R;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RhyReferralContactListComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.rhy.referral.contact.RhyReferralContactListComposableKt$RhyReferralContactListComposable$4$1$3, reason: use source file name */
/* loaded from: classes5.dex */
final class RhyReferralContactListComposable5 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ Function0<Unit> $onSearchCancel;
    final /* synthetic */ SnapshotState<String> $searchValue$delegate;
    final /* synthetic */ Row5 $this_Row;

    RhyReferralContactListComposable5(CoroutineScope coroutineScope, LazyListState lazyListState, FocusManager focusManager, Function0<Unit> function0, Row5 row5, SnapshotState<String> snapshotState) {
        this.$coroutineScope = coroutineScope;
        this.$lazyListState = lazyListState;
        this.$focusManager = focusManager;
        this.$onSearchCancel = function0;
        this.$this_Row = row5;
        this.$searchValue$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1329438437, i, -1, "com.robinhood.android.rhy.referral.contact.RhyReferralContactListComposable.<anonymous>.<anonymous>.<anonymous> (RhyReferralContactListComposable.kt:160)");
        }
        composer.startReplaceGroup(-1224400529);
        boolean zChangedInstance = composer.changedInstance(this.$coroutineScope) | composer.changed(this.$lazyListState) | composer.changedInstance(this.$focusManager) | composer.changed(this.$onSearchCancel);
        final CoroutineScope coroutineScope = this.$coroutineScope;
        final FocusManager focusManager = this.$focusManager;
        final Function0<Unit> function0 = this.$onSearchCancel;
        final LazyListState lazyListState = this.$lazyListState;
        final SnapshotState<String> snapshotState = this.$searchValue$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.rhy.referral.contact.RhyReferralContactListComposableKt$RhyReferralContactListComposable$4$1$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RhyReferralContactListComposable5.invoke$lambda$1$lambda$0(coroutineScope, focusManager, function0, lazyListState, snapshotState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, StringResources_androidKt.stringResource(C27406R.string.rhy_referral_contact_list_search_cancel, composer, 0), TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(Row5.weight$default(this.$this_Row, Modifier.INSTANCE, 1.0f, false, 2, null), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), C2002Dp.m7995constructorimpl(10), 0.0f, 0.0f, 12, null), RhyReferralContactListComposable3.RhyReferralContactListTextInputCancel), null, null, false, null, composer, 0, 120);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(CoroutineScope coroutineScope, FocusManager focusManager, Function0 function0, LazyListState lazyListState, SnapshotState snapshotState) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new RhyReferralContactListComposable6(lazyListState, null), 3, null);
        snapshotState.setValue("");
        FocusManager.clearFocus$default(focusManager, false, 1, null);
        function0.invoke();
        return Unit.INSTANCE;
    }
}
