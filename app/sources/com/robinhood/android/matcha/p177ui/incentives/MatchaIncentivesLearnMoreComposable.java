package com.robinhood.android.matcha.p177ui.incentives;

import androidx.compose.animation.Crossfade;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.p177ui.incentives.MatchaIncentivesLearnMoreViewState;
import com.robinhood.android.social.contracts.matcha.MatchaIncentiveLearnMoreFragmentKey;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MatchaIncentivesLearnMoreComposable.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aW\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\u000b\u001aW\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\u000f\u001aM\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"MatchaIncentivesLearnMoreComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "viewState", "Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreViewState;", "fullTermsClick", "Lkotlin/Function0;", "onGotIt", "onPayClick", "onRequestClick", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "MatchaIncentivesLearnMore", "state", "Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreViewState$Loaded;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreViewState$Loaded;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "IncentivesLearnMoreFooter", "footerContext", "Lcom/robinhood/android/social/contracts/matcha/MatchaIncentiveLearnMoreFragmentKey$FooterContext;", "(Lcom/robinhood/android/social/contracts/matcha/MatchaIncentiveLearnMoreFragmentKey$FooterContext;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-p2p_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMoreComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MatchaIncentivesLearnMoreComposable {

    /* compiled from: MatchaIncentivesLearnMoreComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMoreComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MatchaIncentiveLearnMoreFragmentKey.FooterContext.values().length];
            try {
                iArr[MatchaIncentiveLearnMoreFragmentKey.FooterContext.DISMISS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MatchaIncentiveLearnMoreFragmentKey.FooterContext.PAY_AND_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IncentivesLearnMoreFooter$lambda$4(MatchaIncentiveLearnMoreFragmentKey.FooterContext footerContext, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i, Composer composer, int i2) {
        IncentivesLearnMoreFooter(footerContext, function0, function02, function03, function04, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchaIncentivesLearnMore$lambda$1(Modifier modifier, MatchaIncentivesLearnMoreViewState.Loaded loaded, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i, int i2, Composer composer, int i3) {
        MatchaIncentivesLearnMore(modifier, loaded, function0, function02, function03, function04, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchaIncentivesLearnMoreComposable$lambda$0(Modifier modifier, MatchaIncentivesLearnMoreViewState matchaIncentivesLearnMoreViewState, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i, int i2, Composer composer, int i3) {
        MatchaIncentivesLearnMoreComposable(modifier, matchaIncentivesLearnMoreViewState, function0, function02, function03, function04, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void MatchaIncentivesLearnMoreComposable(Modifier modifier, final MatchaIncentivesLearnMoreViewState viewState, final Function0<Unit> fullTermsClick, final Function0<Unit> onGotIt, final Function0<Unit> onPayClick, final Function0<Unit> onRequestClick, Composer composer, final int i, final int i2) {
        int i3;
        Composer composer2;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(fullTermsClick, "fullTermsClick");
        Intrinsics.checkNotNullParameter(onGotIt, "onGotIt");
        Intrinsics.checkNotNullParameter(onPayClick, "onPayClick");
        Intrinsics.checkNotNullParameter(onRequestClick, "onRequestClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-235035450);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(fullTermsClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onGotIt) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPayClick) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onRequestClick) ? 131072 : 65536;
        }
        if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
            final Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-235035450, i3, -1, "com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMoreComposable (MatchaIncentivesLearnMoreComposable.kt:44)");
            }
            Modifier modifier4 = modifier3;
            composer2 = composerStartRestartGroup;
            Crossfade.Crossfade(viewState, (Modifier) null, (FiniteAnimationSpec<Float>) null, (String) null, ComposableLambda3.rememberComposableLambda(707268746, true, new Function3<MatchaIncentivesLearnMoreViewState, Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMoreComposableKt.MatchaIncentivesLearnMoreComposable.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(MatchaIncentivesLearnMoreViewState matchaIncentivesLearnMoreViewState, Composer composer3, Integer num) {
                    invoke(matchaIncentivesLearnMoreViewState, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(MatchaIncentivesLearnMoreViewState state, Composer composer3, int i5) {
                    int i6;
                    Intrinsics.checkNotNullParameter(state, "state");
                    if ((i5 & 6) == 0) {
                        i6 = ((i5 & 8) == 0 ? composer3.changed(state) : composer3.changedInstance(state) ? 4 : 2) | i5;
                    } else {
                        i6 = i5;
                    }
                    if ((i6 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(707268746, i6, -1, "com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMoreComposable.<anonymous> (MatchaIncentivesLearnMoreComposable.kt:46)");
                    }
                    if (state instanceof MatchaIncentivesLearnMoreViewState.Loading) {
                        composer3.startReplaceGroup(1080436102);
                        LocalShowPlaceholder.Loadable(true, modifier3, null, ComposableLambda3.rememberComposableLambda(-97421694, true, new AnonymousClass1(state), composer3, 54), composer3, 3078, 4);
                        composer3.endReplaceGroup();
                    } else {
                        if (!(state instanceof MatchaIncentivesLearnMoreViewState.Loaded)) {
                            composer3.startReplaceGroup(1080433648);
                            composer3.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer3.startReplaceGroup(1080451680);
                        MatchaIncentivesLearnMoreComposable.MatchaIncentivesLearnMore(modifier3, (MatchaIncentivesLearnMoreViewState.Loaded) state, fullTermsClick, onGotIt, onPayClick, onRequestClick, composer3, 0, 0);
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: MatchaIncentivesLearnMoreComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMoreComposableKt$MatchaIncentivesLearnMoreComposable$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ MatchaIncentivesLearnMoreViewState $state;

                    AnonymousClass1(MatchaIncentivesLearnMoreViewState matchaIncentivesLearnMoreViewState) {
                        this.$state = matchaIncentivesLearnMoreViewState;
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
                            ComposerKt.traceEventStart(-97421694, i, -1, "com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMoreComposable.<anonymous>.<anonymous> (MatchaIncentivesLearnMoreComposable.kt:52)");
                        }
                        MatchaIncentivesLearnMoreViewState.Loaded mock = ((MatchaIncentivesLearnMoreViewState.Loading) this.$state).getMock();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMoreComposableKt$MatchaIncentivesLearnMoreComposable$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function0 = (Function0) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMoreComposableKt$MatchaIncentivesLearnMoreComposable$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        Function0 function02 = (Function0) objRememberedValue2;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMoreComposableKt$MatchaIncentivesLearnMoreComposable$1$1$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        Function0 function03 = (Function0) objRememberedValue3;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue4 = composer.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMoreComposableKt$MatchaIncentivesLearnMoreComposable$1$1$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue4);
                        }
                        composer.endReplaceGroup();
                        MatchaIncentivesLearnMoreComposable.MatchaIncentivesLearnMore(null, mock, function0, function02, function03, (Function0) objRememberedValue4, composer, 224640, 1);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }
            }, composerStartRestartGroup, 54), composer2, ((i3 >> 3) & 14) | 24576, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMoreComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaIncentivesLearnMoreComposable.MatchaIncentivesLearnMoreComposable$lambda$0(modifier2, viewState, fullTermsClick, onGotIt, onPayClick, onRequestClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MatchaIncentivesLearnMore(Modifier modifier, final MatchaIncentivesLearnMoreViewState.Loaded loaded, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, final Function0<Unit> function04, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Function0<Unit> function05;
        Function0<Unit> function06;
        Function0<Unit> function07;
        Function0<Unit> function08;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1584924729);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(loaded) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                function05 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function05) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    function06 = function02;
                    i3 |= composerStartRestartGroup.changedInstance(function06) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        function07 = function03;
                        i3 |= composerStartRestartGroup.changedInstance(function07) ? 16384 : 8192;
                    }
                    if ((i2 & 32) != 0) {
                        if ((i & 196608) == 0) {
                            function08 = function04;
                            i3 |= composerStartRestartGroup.changedInstance(function08) ? 131072 : 65536;
                        }
                        if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
                            modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1584924729, i3, -1, "com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMore (MatchaIncentivesLearnMoreComposable.kt:82)");
                            }
                            final Function0<Unit> function09 = function05;
                            final Function0<Unit> function010 = function06;
                            final Function0<Unit> function011 = function07;
                            final Function0<Unit> function012 = function08;
                            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), false, ComposableLambda3.rememberComposableLambda(988452722, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMoreComposableKt.MatchaIncentivesLearnMore.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                                    invoke(bentoButtonBar3, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i5) {
                                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                    if ((i5 & 17) == 16 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(988452722, i5, -1, "com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMore.<anonymous> (MatchaIncentivesLearnMoreComposable.kt:113)");
                                    }
                                    MatchaIncentivesLearnMoreComposable.IncentivesLearnMoreFooter(loaded.getFooterContext(), function09, function010, function011, function012, composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-741834785, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMoreComposableKt.MatchaIncentivesLearnMore.2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                                    invoke(boxScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer2, int i5) {
                                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                    if ((i5 & 17) == 16 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-741834785, i5, -1, "com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMore.<anonymous> (MatchaIncentivesLearnMoreComposable.kt:88)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                    MatchaIncentivesLearnMoreViewState.Loaded loaded2 = loaded;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    if (composer2.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i6 = BentoTheme.$stable;
                                    ImageKt.Image(PainterResources_androidKt.painterResource(C21284R.drawable.svg_incentives_learn_more, composer2, 0), (String) null, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer2, i6).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, 120);
                                    Composer composer3 = composer2;
                                    BentoText2.m20747BentoText38GnDrw(loaded2.getTitle(composer2, 0), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), composer2, 6, 0), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getDisplayCapsuleLarge(), composer3, 0, 0, 8188);
                                    composer3.startReplaceGroup(-579634402);
                                    for (MatchaIncentivesLearnMoreViewState.Loaded.Bullet bullet : loaded2.getBullets()) {
                                        int i7 = StringResource.$stable;
                                        BentoValuePropRow3.BentoValuePropRow(bullet.getTitle(composer3, i7), bullet.getDescription(composer3, i7), new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.SPARKLE_BULLET_24, null, 2, null), BentoValuePropRow.Top, (Modifier) null, composer3, (BentoValuePropRow2.Icon.$stable << 6) | 3072, 16);
                                        composer3 = composer2;
                                    }
                                    composer2.endReplaceGroup();
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier4 = modifier3;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMoreComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return MatchaIncentivesLearnMoreComposable.MatchaIncentivesLearnMore$lambda$1(modifier4, loaded, function0, function02, function03, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 196608;
                    function08 = function04;
                    if ((74899 & i3) != 74898) {
                        if (i4 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final Function0<Unit> function092 = function05;
                        final Function0<Unit> function0102 = function06;
                        final Function0<Unit> function0112 = function07;
                        final Function0<Unit> function0122 = function08;
                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), false, ComposableLambda3.rememberComposableLambda(988452722, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMoreComposableKt.MatchaIncentivesLearnMore.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                                invoke(bentoButtonBar3, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i5) {
                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                if ((i5 & 17) == 16 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(988452722, i5, -1, "com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMore.<anonymous> (MatchaIncentivesLearnMoreComposable.kt:113)");
                                }
                                MatchaIncentivesLearnMoreComposable.IncentivesLearnMoreFooter(loaded.getFooterContext(), function092, function0102, function0112, function0122, composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-741834785, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMoreComposableKt.MatchaIncentivesLearnMore.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                                invoke(boxScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer2, int i5) {
                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                if ((i5 & 17) == 16 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-741834785, i5, -1, "com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMore.<anonymous> (MatchaIncentivesLearnMoreComposable.kt:88)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                MatchaIncentivesLearnMoreViewState.Loaded loaded2 = loaded;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                if (composer2.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i6 = BentoTheme.$stable;
                                ImageKt.Image(PainterResources_androidKt.painterResource(C21284R.drawable.svg_incentives_learn_more, composer2, 0), (String) null, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer2, i6).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, 120);
                                Composer composer3 = composer2;
                                BentoText2.m20747BentoText38GnDrw(loaded2.getTitle(composer2, 0), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), composer2, 6, 0), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getDisplayCapsuleLarge(), composer3, 0, 0, 8188);
                                composer3.startReplaceGroup(-579634402);
                                for (MatchaIncentivesLearnMoreViewState.Loaded.Bullet bullet : loaded2.getBullets()) {
                                    int i7 = StringResource.$stable;
                                    BentoValuePropRow3.BentoValuePropRow(bullet.getTitle(composer3, i7), bullet.getDescription(composer3, i7), new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.SPARKLE_BULLET_24, null, 2, null), BentoValuePropRow.Top, (Modifier) null, composer3, (BentoValuePropRow2.Icon.$stable << 6) | 3072, 16);
                                    composer3 = composer2;
                                }
                                composer2.endReplaceGroup();
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 2);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function07 = function03;
                if ((i2 & 32) != 0) {
                }
                function08 = function04;
                if ((74899 & i3) != 74898) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function06 = function02;
            if ((i2 & 16) != 0) {
            }
            function07 = function03;
            if ((i2 & 32) != 0) {
            }
            function08 = function04;
            if ((74899 & i3) != 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function05 = function0;
        if ((i2 & 8) == 0) {
        }
        function06 = function02;
        if ((i2 & 16) != 0) {
        }
        function07 = function03;
        if ((i2 & 32) != 0) {
        }
        function08 = function04;
        if ((74899 & i3) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final void IncentivesLearnMoreFooter(final MatchaIncentiveLearnMoreFragmentKey.FooterContext footerContext, final Function0<Unit> fullTermsClick, final Function0<Unit> onGotIt, final Function0<Unit> onPayClick, final Function0<Unit> onRequestClick, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(footerContext, "footerContext");
        Intrinsics.checkNotNullParameter(fullTermsClick, "fullTermsClick");
        Intrinsics.checkNotNullParameter(onGotIt, "onGotIt");
        Intrinsics.checkNotNullParameter(onPayClick, "onPayClick");
        Intrinsics.checkNotNullParameter(onRequestClick, "onRequestClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1903961320);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(footerContext.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(fullTermsClick) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onGotIt) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onPayClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onRequestClick) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1903961320, i2, -1, "com.robinhood.android.matcha.ui.incentives.IncentivesLearnMoreFooter (MatchaIncentivesLearnMoreComposable.kt:131)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            int i4 = i2;
            BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(StringResources_androidKt.stringResource(C21284R.string.matcha_incentives_learn_more_limitations_apply, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C21284R.string.matcha_incentives_learn_more_see_full_terms, composerStartRestartGroup, 0), fullTermsClick, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 6, 0), bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU(), 0L, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS(), 0, composerStartRestartGroup, (i2 << 3) & 896, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
            int i5 = WhenMappings.$EnumSwitchMapping$0[footerContext.ordinal()];
            if (i5 == 1) {
                composerStartRestartGroup.startReplaceGroup(-2069316770);
                BentoButtonBar2.BentoButtonBar(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composerStartRestartGroup, 6, 1), null, null, false, null, null, onGotIt, StringResources_androidKt.stringResource(C11048R.string.general_label_got_it, composerStartRestartGroup, 0), false, null, false, null, null, false, null, false, composerStartRestartGroup, (i4 << 12) & 3670016, 0, 65342);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
                Unit unit = Unit.INSTANCE;
            } else {
                if (i5 != 2) {
                    composerStartRestartGroup.startReplaceGroup(2011455908);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-2068937423);
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 6, 0);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, 0);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Modifier modifierWeight$default = Row5.weight$default(row6, companion2, 1.0f, false, 2, null);
                String strStringResource = StringResources_androidKt.stringResource(C21284R.string.matcha_transfer_pay, composerStartRestartGroup, 0);
                BentoButtons.Icon.Size16 size16 = new BentoButtons.Icon.Size16(ServerToBentoAssetMapper2.WITHDRAW_24, null, 2, null);
                int i6 = BentoButtons.Icon.Size16.$stable;
                BentoButtonKt.m20586BentoButtonEikTQX8(onPayClick, strStringResource, modifierWeight$default, size16, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, ((i4 >> 9) & 14) | (i6 << 9), 0, 8176);
                Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                BentoButtonKt.m20586BentoButtonEikTQX8(onRequestClick, StringResources_androidKt.stringResource(C21284R.string.matcha_transfer_request, composerStartRestartGroup, 0), Row5.weight$default(row6, companion2, 1.0f, false, 2, null), new BentoButtons.Icon.Size16(ServerToBentoAssetMapper2.DEPOSIT_24, null, 2, null), null, false, false, null, null, null, null, false, null, composerStartRestartGroup, ((i4 >> 12) & 14) | (i6 << 9), 0, 8176);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMoreComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaIncentivesLearnMoreComposable.IncentivesLearnMoreFooter$lambda$4(footerContext, fullTermsClick, onGotIt, onPayClick, onRequestClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
