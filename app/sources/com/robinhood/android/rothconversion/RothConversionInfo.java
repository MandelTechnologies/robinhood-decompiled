package com.robinhood.android.rothconversion;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.retirement.contracts.RetirementLastKnownEntryPointManager;
import com.robinhood.android.rothconversion.RothConversionInfoViewState;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: RothConversionInfo.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"RothConversionInfo", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Lcom/robinhood/android/rothconversion/RothConversionInfoViewState;", "callbacks", "Lcom/robinhood/android/rothconversion/RothConversionInfoPageCallbacks;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/rothconversion/RothConversionInfoViewState;Lcom/robinhood/android/rothconversion/RothConversionInfoPageCallbacks;Landroidx/compose/runtime/Composer;II)V", "feature-roth-conversion_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rothconversion.RothConversionInfoKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RothConversionInfo {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RothConversionInfo$lambda$0(Modifier modifier, RothConversionInfoViewState rothConversionInfoViewState, RothConversionInfoPager3 rothConversionInfoPager3, int i, int i2, Composer composer, int i3) {
        RothConversionInfo(modifier, rothConversionInfoViewState, rothConversionInfoPager3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void RothConversionInfo(final Modifier modifier, final RothConversionInfoViewState state, final RothConversionInfoPager3 callbacks, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1380161955);
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
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1380161955, i3, -1, "com.robinhood.android.rothconversion.RothConversionInfo (RothConversionInfo.kt:17)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(41986994, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rothconversion.RothConversionInfoKt.RothConversionInfo.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(41986994, i5, -1, "com.robinhood.android.rothconversion.RothConversionInfo.<anonymous> (RothConversionInfo.kt:19)");
                    }
                    UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, new Screen(Screen.Name.ROTH_CONVERSION_INFO, null, null, null, 14, null), null, RetirementLastKnownEntryPointManager.INSTANCE.getLoggingContext(), null, null, 53, null);
                    final RothConversionInfoViewState rothConversionInfoViewState = state;
                    final Modifier modifier2 = modifier;
                    final RothConversionInfoPager3 rothConversionInfoPager3 = callbacks;
                    AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(-1153316569, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rothconversion.RothConversionInfoKt.RothConversionInfo.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1153316569, i6, -1, "com.robinhood.android.rothconversion.RothConversionInfo.<anonymous>.<anonymous> (RothConversionInfo.kt:25)");
                            }
                            final RothConversionInfoViewState rothConversionInfoViewState2 = rothConversionInfoViewState;
                            final Modifier modifier3 = modifier2;
                            final RothConversionInfoPager3 rothConversionInfoPager32 = rothConversionInfoPager3;
                            GenericActionHandlerKt.GenericActionHandler(null, false, null, null, ComposableLambda3.rememberComposableLambda(825044053, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rothconversion.RothConversionInfoKt.RothConversionInfo.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i7) {
                                    if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(825044053, i7, -1, "com.robinhood.android.rothconversion.RothConversionInfo.<anonymous>.<anonymous>.<anonymous> (RothConversionInfo.kt:26)");
                                    }
                                    RothConversionInfoViewState rothConversionInfoViewState3 = rothConversionInfoViewState2;
                                    if (rothConversionInfoViewState3 instanceof RothConversionInfoViewState.Loaded) {
                                        composer4.startReplaceGroup(-1701611642);
                                        RothConversionInfoPager4.RothConversionInfoPager(modifier3, (RothConversionInfoViewState.Loaded) rothConversionInfoViewState2, rothConversionInfoPager32, composer4, 0, 0);
                                        composer4.endReplaceGroup();
                                    } else if (rothConversionInfoViewState3 instanceof RothConversionInfoViewState.Loading) {
                                        composer4.startReplaceGroup(-1701604057);
                                        RothConversionInfoPlaceholder.RothConversionInfoPlaceholder(modifier3, composer4, 0);
                                        composer4.endReplaceGroup();
                                    } else {
                                        if (!(rothConversionInfoViewState3 instanceof RothConversionInfoViewState.Error)) {
                                            composer4.startReplaceGroup(-1701613697);
                                            composer4.endReplaceGroup();
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        composer4.startReplaceGroup(-1701600447);
                                        RothConversionInfoPager3 rothConversionInfoPager33 = rothConversionInfoPager32;
                                        composer4.startReplaceGroup(5004770);
                                        boolean zChangedInstance = composer4.changedInstance(rothConversionInfoPager33);
                                        Object objRememberedValue = composer4.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new RothConversionInfo2(rothConversionInfoPager33);
                                            composer4.updateRememberedValue(objRememberedValue);
                                        }
                                        composer4.endReplaceGroup();
                                        ErrorScreenComposable.ErrorScreenComposable(null, (Function0) ((KFunction) objRememberedValue), 0, null, null, null, null, false, composer4, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
                                        composer4.endReplaceGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 24576, 15);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rothconversion.RothConversionInfoKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RothConversionInfo.RothConversionInfo$lambda$0(modifier2, state, callbacks, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
