package com.robinhood.android.futures.eventbrackets.p141ui;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PageSize;
import androidx.compose.foundation.pager.PagerDefaults;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.theme.BentoTheme2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: Bracket.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\u001aZ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002"}, m3636d2 = {"Bracket", "", "bracketState", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketState;", "rounds", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketRoundData;", "contentBottomPadding", "Landroidx/compose/ui/unit/Dp;", "onCardClick", "Lkotlin/Function1;", "Ljava/util/UUID;", "Lkotlin/ParameterName;", "name", "cardId", "modifier", "Landroidx/compose/ui/Modifier;", "Bracket-TN_CM5M", "(Lcom/robinhood/android/futures/eventbrackets/ui/BracketState;Lkotlinx/collections/immutable/ImmutableList;FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewBracket", "(Landroidx/compose/runtime/Composer;I)V", "feature-event-brackets_externalDebug", "indexInVisibleArea", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.eventbrackets.ui.BracketKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class Bracket2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Bracket_TN_CM5M$lambda$0(BracketState bracketState, ImmutableList immutableList, float f, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m14627BracketTN_CM5M(bracketState, immutableList, f, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewBracket$lambda$1(int i, Composer composer, int i2) {
        PreviewBracket(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* renamed from: Bracket-TN_CM5M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14627BracketTN_CM5M(final BracketState bracketState, final ImmutableList<BracketRoundData> rounds, final float f, final Function1<? super UUID, Unit> onCardClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        float f2;
        int i4;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(bracketState, "bracketState");
        Intrinsics.checkNotNullParameter(rounds, "rounds");
        Intrinsics.checkNotNullParameter(onCardClick, "onCardClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-65077972);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(bracketState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(rounds) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                f2 = f;
                i3 |= composerStartRestartGroup.changed(f2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onCardClick) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-65077972, i3, -1, "com.robinhood.android.futures.eventbrackets.ui.Bracket (Bracket.kt:32)");
                    }
                    Alignment.Vertical top = Alignment.INSTANCE.getTop();
                    Modifier modifier5 = modifier4;
                    int i5 = i3 & 14;
                    PagerKt.m5301HorizontalPager8jOkeI(bracketState.getHorizontalPagerState(), ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), bracketState.getVerticalScrollState(), false, null, false, 14, null), PaddingKt.m5139PaddingValuesa9UjIt4$default(0.0f, bracketState.m14643extraTopPaddingchRvn1I(composerStartRestartGroup, i5), bracketState.m14642extraEndPaddingchRvn1I(composerStartRestartGroup, i5), f2, 1, null), new PageSize.Fixed(BracketMatchOverviewCardWithChannels.getTotalCardWidthWithChannels(), null), 0, 0.0f, top, PagerDefaults.INSTANCE.flingBehavior(bracketState.getHorizontalPagerState(), null, null, null, 0.0f, composerStartRestartGroup, PagerDefaults.$stable << 15, 30), false, false, null, null, SnapPosition.Start.INSTANCE, null, ComposableLambda3.rememberComposableLambda(-1382188021, true, new Bracket3(rounds, bracketState, onCardClick), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 24960, 12080);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return Bracket2.Bracket_TN_CM5M$lambda$0(bracketState, rounds, f, onCardClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            modifier2 = modifier;
            if ((i3 & 9363) != 9362) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Alignment.Vertical top2 = Alignment.INSTANCE.getTop();
                Modifier modifier52 = modifier4;
                int i52 = i3 & 14;
                PagerKt.m5301HorizontalPager8jOkeI(bracketState.getHorizontalPagerState(), ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), bracketState.getVerticalScrollState(), false, null, false, 14, null), PaddingKt.m5139PaddingValuesa9UjIt4$default(0.0f, bracketState.m14643extraTopPaddingchRvn1I(composerStartRestartGroup, i52), bracketState.m14642extraEndPaddingchRvn1I(composerStartRestartGroup, i52), f2, 1, null), new PageSize.Fixed(BracketMatchOverviewCardWithChannels.getTotalCardWidthWithChannels(), null), 0, 0.0f, top2, PagerDefaults.INSTANCE.flingBehavior(bracketState.getHorizontalPagerState(), null, null, null, 0.0f, composerStartRestartGroup, PagerDefaults.$stable << 15, 30), false, false, null, null, SnapPosition.Start.INSTANCE, null, ComposableLambda3.rememberComposableLambda(-1382188021, true, new Bracket3(rounds, bracketState, onCardClick), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 24960, 12080);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        f2 = f;
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void PreviewBracket(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(294492349);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(294492349, i, -1, "com.robinhood.android.futures.eventbrackets.ui.PreviewBracket (Bracket.kt:72)");
            }
            BentoTheme2.BentoTheme(Boolean.TRUE, null, null, null, null, null, null, null, Bracket4.INSTANCE.m14646getLambda$909625739$feature_event_brackets_externalDebug(), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Bracket2.PreviewBracket$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
