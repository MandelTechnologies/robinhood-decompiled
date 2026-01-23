package com.robinhood.android.retirement.p239ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GenericRetirementTabFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/GenericRetirementTabFragment;", "", "loggingIdentifier", "Lkotlin/Function0;", "", "content", "RetirementTheme", "(Lcom/robinhood/android/retirement/ui/GenericRetirementTabFragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "feature-retirement-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.ui.GenericRetirementTabFragmentKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class GenericRetirementTabFragment2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementTheme$lambda$0(GenericRetirementTabFragment genericRetirementTabFragment, String str, Function2 function2, int i, int i2, Composer composer, int i3) {
        RetirementTheme(genericRetirementTabFragment, str, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RetirementTheme(final GenericRetirementTabFragment genericRetirementTabFragment, String str, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        String str2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(genericRetirementTabFragment, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(856786817);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(genericRetirementTabFragment) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 1;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                str2 = str;
                i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
            }
            if ((i2 & 2) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                String str3 = i4 == 0 ? null : str2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(856786817, i3, -1, "com.robinhood.android.retirement.ui.RetirementTheme (GenericRetirementTabFragment.kt:30)");
                }
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(str3, Screen.copy$default(genericRetirementTabFragment.getEventScreen(), null, null, str3 != null ? genericRetirementTabFragment.getEventScreen().getIdentifier() : str3, null, 11, null), null, null, null, null, 60, null), ComposableLambda3.rememberComposableLambda(-2095910740, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.GenericRetirementTabFragmentKt.RetirementTheme.1
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
                            ComposerKt.traceEventStart(-2095910740, i5, -1, "com.robinhood.android.retirement.ui.RetirementTheme.<anonymous> (GenericRetirementTabFragment.kt:39)");
                        }
                        final GenericRetirementTabFragment genericRetirementTabFragment2 = genericRetirementTabFragment;
                        final Function2<Composer, Integer, Unit> function2 = content;
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1600357119, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.GenericRetirementTabFragmentKt.RetirementTheme.1.1
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
                                    ComposerKt.traceEventStart(-1600357119, i6, -1, "com.robinhood.android.retirement.ui.RetirementTheme.<anonymous>.<anonymous> (GenericRetirementTabFragment.kt:40)");
                                }
                                ActionHandlingFragment2.ContentWithDialog(genericRetirementTabFragment2, function2, composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str2 = str3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final String str4 = str2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.GenericRetirementTabFragmentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GenericRetirementTabFragment2.RetirementTheme$lambda$0(genericRetirementTabFragment, str4, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        str2 = str;
        if ((i2 & 2) == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(str3, Screen.copy$default(genericRetirementTabFragment.getEventScreen(), null, null, str3 != null ? genericRetirementTabFragment.getEventScreen().getIdentifier() : str3, null, 11, null), null, null, null, null, 60, null), ComposableLambda3.rememberComposableLambda(-2095910740, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.GenericRetirementTabFragmentKt.RetirementTheme.1
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
                        ComposerKt.traceEventStart(-2095910740, i5, -1, "com.robinhood.android.retirement.ui.RetirementTheme.<anonymous> (GenericRetirementTabFragment.kt:39)");
                    }
                    final GenericRetirementTabFragment genericRetirementTabFragment2 = genericRetirementTabFragment;
                    final Function2<? super Composer, ? super Integer, Unit> function2 = content;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1600357119, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.GenericRetirementTabFragmentKt.RetirementTheme.1.1
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
                                ComposerKt.traceEventStart(-1600357119, i6, -1, "com.robinhood.android.retirement.ui.RetirementTheme.<anonymous>.<anonymous> (GenericRetirementTabFragment.kt:40)");
                            }
                            ActionHandlingFragment2.ContentWithDialog(genericRetirementTabFragment2, function2, composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
            }
            str2 = str3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
