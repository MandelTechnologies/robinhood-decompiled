package com.robinhood.android.equities.taxlots.table;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.state.ToggleableState;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.responsive.WindowSize;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV2;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.EquityOrderContext;
import com.robinhood.rosetta.eventlogging.TaxLotSelection;
import com.robinhood.rosetta.eventlogging.TaxLotsContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TaxLotShareAndCheckBoxCell.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aw\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0014\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00050\u0012H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a0\u0010\u0019\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\n\u0010\u001e\u001a\u00060\u001fj\u0002` 2\u0006\u0010!\u001a\u00020\"H\u0002\u001a\f\u0010#\u001a\u00020$*\u00020%H\u0002\u001a\r\u0010&\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010'\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006(²\u0006\n\u0010)\u001a\u00020\tX\u008a\u0084\u0002²\u0006\n\u0010*\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010+\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010,\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010-\u001a\u00020\tX\u008a\u0084\u0002"}, m3636d2 = {"CompactColumnWidth", "", "MediumColumnWidth", "ExpandedColumnWidth", "TaxLotsShareAndCheckBoxComposable", "", "rowIndex", "", "stickyColumn", "", "taxLotsShareAndCheckBoxCell", "Lcom/robinhood/android/equities/taxlots/table/TaxLotsShareAndCheckBoxCell;", "width", "Landroidx/compose/ui/unit/Dp;", "height", "bentoNumpadScopeV2", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadScopeV2;", "setKeyboardVisible", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "invalidNumberOfSharesCallback", "Ljava/math/BigDecimal;", "TaxLotsShareAndCheckBoxComposable-PA9ru4M", "(IZLcom/robinhood/android/equities/taxlots/table/TaxLotsShareAndCheckBoxCell;Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/unit/Dp;Lcom/robinhood/compose/bento/component/numpad/BentoNumpadScopeV2;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "logTypingEvent", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "eventDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "eventAction", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "Lcom/robinhood/rosetta/eventlogging/EventAction;", "sharesEntered", "", "toLoggable", "Lcom/robinhood/rosetta/eventlogging/TaxLotSelection$CheckBoxState;", "Landroidx/compose/ui/state/ToggleableState;", "TaxLotsShareAndCheckBoxComposablePreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-tax-lots_externalDebug", "displayAlert", "showMaxSelectedLotsAlert", "showIntraDayLotAlert", "focused", "invalidNumberOfShares"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.taxlots.table.TaxLotShareAndCheckBoxCellKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class TaxLotShareAndCheckBoxCell3 {
    public static final float CompactColumnWidth = 85.0f;
    public static final float ExpandedColumnWidth = 160.0f;
    public static final float MediumColumnWidth = 120.0f;

    /* compiled from: TaxLotShareAndCheckBoxCell.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equities.taxlots.table.TaxLotShareAndCheckBoxCellKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[WindowSize.values().length];
            try {
                iArr[WindowSize.Compact.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WindowSize.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WindowSize.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ToggleableState.values().length];
            try {
                iArr2[ToggleableState.f174On.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ToggleableState.Indeterminate.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ToggleableState.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsShareAndCheckBoxComposablePreview$lambda$6(int i, Composer composer, int i2) {
        TaxLotsShareAndCheckBoxComposablePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsShareAndCheckBoxComposable_PA9ru4M$lambda$4(int i, boolean z, TaxLotsShareAndCheckBoxCell taxLotsShareAndCheckBoxCell, C2002Dp c2002Dp, C2002Dp c2002Dp2, BentoNumpadScopeV2 bentoNumpadScopeV2, Function1 function1, Modifier modifier, Function1 function12, int i2, int i3, Composer composer, int i4) {
        m13636TaxLotsShareAndCheckBoxComposablePA9ru4M(i, z, taxLotsShareAndCheckBoxCell, c2002Dp, c2002Dp2, bentoNumpadScopeV2, function1, modifier, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0105  */
    /* renamed from: TaxLotsShareAndCheckBoxComposable-PA9ru4M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13636TaxLotsShareAndCheckBoxComposablePA9ru4M(final int i, final boolean z, final TaxLotsShareAndCheckBoxCell taxLotsShareAndCheckBoxCell, final C2002Dp c2002Dp, final C2002Dp c2002Dp2, final BentoNumpadScopeV2 bentoNumpadScopeV2, final Function1<? super Boolean, Unit> setKeyboardVisible, Modifier modifier, final Function1<? super BigDecimal, Unit> invalidNumberOfSharesCallback, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        Modifier modifier2;
        char c;
        int i7;
        float f;
        Modifier modifierClearAndSetSemantics;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(taxLotsShareAndCheckBoxCell, "taxLotsShareAndCheckBoxCell");
        Intrinsics.checkNotNullParameter(bentoNumpadScopeV2, "bentoNumpadScopeV2");
        Intrinsics.checkNotNullParameter(setKeyboardVisible, "setKeyboardVisible");
        Intrinsics.checkNotNullParameter(invalidNumberOfSharesCallback, "invalidNumberOfSharesCallback");
        Composer composerStartRestartGroup = composer.startRestartGroup(2066205495);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            i4 = i;
        } else {
            i4 = i;
            if ((i2 & 6) == 0) {
                i5 = (composerStartRestartGroup.changed(i4) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i3 & 2) == 0) {
            if ((i2 & 48) == 0) {
                i5 |= composerStartRestartGroup.changed(z) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i5 |= 384;
            } else if ((i2 & 384) == 0) {
                i5 |= composerStartRestartGroup.changedInstance(taxLotsShareAndCheckBoxCell) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= composerStartRestartGroup.changed(c2002Dp) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i5 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i5 |= composerStartRestartGroup.changed(c2002Dp2) ? 16384 : 8192;
            }
            if ((i3 & 32) == 0) {
                i5 |= 196608;
            } else if ((i2 & 196608) == 0) {
                i5 |= composerStartRestartGroup.changedInstance(bentoNumpadScopeV2) ? 131072 : 65536;
            }
            if ((i3 & 64) == 0) {
                i5 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                i5 |= composerStartRestartGroup.changedInstance(setKeyboardVisible) ? 1048576 : 524288;
            }
            i6 = i3 & 128;
            if (i6 == 0) {
                i5 |= 12582912;
                modifier2 = modifier;
                c = ' ';
            } else {
                modifier2 = modifier;
                c = ' ';
                if ((i2 & 12582912) == 0) {
                    i5 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
                }
            }
            if ((i3 & 256) == 0) {
                i5 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                i5 |= composerStartRestartGroup.changedInstance(invalidNumberOfSharesCallback) ? 67108864 : 33554432;
            }
            if ((38347923 & i5) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2066205495, i5, -1, "com.robinhood.android.equities.taxlots.table.TaxLotsShareAndCheckBoxComposable (TaxLotShareAndCheckBoxCell.kt:85)");
                }
                EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                composerStartRestartGroup.startReplaceGroup(1348606504);
                float fMo5013toDpu2uoSUM = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> c));
                composerStartRestartGroup.endReplaceGroup();
                float f2 = ((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).fontScale;
                i7 = WhenMappings.$EnumSwitchMapping$0[WindowSize.INSTANCE.getCurrentWidth(composerStartRestartGroup, 6).ordinal()];
                if (i7 != 1) {
                    f = (f2 * 85.0f) - ((85.0f / fMo5013toDpu2uoSUM) * 85.0f);
                } else if (i7 == 2) {
                    f = 120.0f;
                } else {
                    if (i7 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f = 160.0f;
                }
                composerStartRestartGroup.startReplaceGroup(1348621934);
                if (c2002Dp != null || c2002Dp2 == null) {
                    modifierClearAndSetSemantics = modifier4;
                } else {
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotShareAndCheckBoxCellKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TaxLotShareAndCheckBoxCell3.m1953x9ea311df((SemanticsPropertyReceiver) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    modifierClearAndSetSemantics = SemanticsModifier6.clearAndSetSemantics(modifier4, (Function1) objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-284657570, true, new TaxLotShareAndCheckBoxCell4(taxLotsShareAndCheckBoxCell, c2002Dp, bentoNumpadScopeV2, invalidNumberOfSharesCallback, current, userInteractionEventDescriptor, setKeyboardVisible, f, z, i4, c2002Dp2), composerStartRestartGroup, 54);
                int i8 = i5 >> 9;
                composer2 = composerStartRestartGroup;
                TaxLotsTableHelpers5.m13659TaxLotsBaseCell4xCAqhw(c2002Dp, c2002Dp2, modifierClearAndSetSemantics, null, null, composableLambdaRememberComposableLambda, composer2, (i8 & 14) | 196608 | (i8 & 112), 24);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotShareAndCheckBoxCellKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TaxLotShareAndCheckBoxCell3.TaxLotsShareAndCheckBoxComposable_PA9ru4M$lambda$4(i, z, taxLotsShareAndCheckBoxCell, c2002Dp, c2002Dp2, bentoNumpadScopeV2, setKeyboardVisible, modifier3, invalidNumberOfSharesCallback, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 48;
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        i6 = i3 & 128;
        if (i6 == 0) {
        }
        if ((i3 & 256) == 0) {
        }
        if ((38347923 & i5) == 38347922) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            composerStartRestartGroup.startReplaceGroup(1348606504);
            float fMo5013toDpu2uoSUM2 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> c));
            composerStartRestartGroup.endReplaceGroup();
            float f22 = ((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).fontScale;
            i7 = WhenMappings.$EnumSwitchMapping$0[WindowSize.INSTANCE.getCurrentWidth(composerStartRestartGroup, 6).ordinal()];
            if (i7 != 1) {
            }
            composerStartRestartGroup.startReplaceGroup(1348621934);
            if (c2002Dp != null) {
                if (c2002Dp != null || c2002Dp2 == null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-284657570, true, new TaxLotShareAndCheckBoxCell4(taxLotsShareAndCheckBoxCell, c2002Dp, bentoNumpadScopeV2, invalidNumberOfSharesCallback, current2, userInteractionEventDescriptor2, setKeyboardVisible, f, z, i4, c2002Dp2), composerStartRestartGroup, 54);
                int i82 = i5 >> 9;
                composer2 = composerStartRestartGroup;
                TaxLotsTableHelpers5.m13659TaxLotsBaseCell4xCAqhw(c2002Dp, c2002Dp2, modifierClearAndSetSemantics, null, null, composableLambdaRememberComposableLambda2, composer2, (i82 & 14) | 196608 | (i82 & 112), 24);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TaxLotsShareAndCheckBoxComposable_PA9ru4M$lambda$3$lambda$2$lambda$1 */
    public static final Unit m1953x9ea311df(SemanticsPropertyReceiver clearAndSetSemantics) {
        Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logTypingEvent(TaxLotsShareAndCheckBoxCell taxLotsShareAndCheckBoxCell, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, UserInteractionEventData.Action action, double d) {
        EquityOrderContext equityOrderContextCopy;
        EquityOrderContext equity_order_context;
        Context context = userInteractionEventDescriptor.getContext();
        if (context == null || (equity_order_context = context.getEquity_order_context()) == null) {
            equityOrderContextCopy = null;
        } else {
            equityOrderContextCopy = equity_order_context.copy((493567 & 1) != 0 ? equity_order_context.instrument_id : null, (493567 & 2) != 0 ? equity_order_context.symbol : null, (493567 & 4) != 0 ? equity_order_context.side : null, (493567 & 8) != 0 ? equity_order_context.type : null, (493567 & 16) != 0 ? equity_order_context.trigger : null, (493567 & 32) != 0 ? equity_order_context.is_dollar_based_amount : null, (493567 & 64) != 0 ? equity_order_context.is_trailing_order : null, (493567 & 128) != 0 ? equity_order_context.is_preset_percent_limit_order : null, (493567 & 256) != 0 ? equity_order_context.market_hours : null, (493567 & 512) != 0 ? equity_order_context.bid_price : null, (493567 & 1024) != 0 ? equity_order_context.ask_price : null, (493567 & 2048) != 0 ? equity_order_context.bid_ask_timestamp : null, (493567 & 4096) != 0 ? equity_order_context.quote_last_cache_timestamp : null, (493567 & 8192) != 0 ? equity_order_context.tax_lot_selections : null, (493567 & 16384) != 0 ? equity_order_context.tax_lots_context : new TaxLotsContext(null, null, new TaxLotSelection(taxLotsShareAndCheckBoxCell.getLotId(), d, taxLotsShareAndCheckBoxCell.getOriginalShareValue().doubleValue(), toLoggable(taxLotsShareAndCheckBoxCell.getToggleableState()), null, 16, null), null, 0.0d, 0.0d, 0.0d, null, null, 507, null), (493567 & 32768) != 0 ? equity_order_context.estimated_total_fees : null, (493567 & 65536) != 0 ? equity_order_context.position_effect : null, (493567 & 131072) != 0 ? equity_order_context.order_entry_point : null, (493567 & 262144) != 0 ? equity_order_context.order_input_format : null, (493567 & 524288) != 0 ? equity_order_context.unknownFields() : null);
        }
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, action, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, equityOrderContextCopy, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -536870913, -1, -1, -1, 16383, null), new Component(Component.ComponentType.TEXT_FIELD, "tax_lots.table.shares", null, 4, null), null, 35, null), UserInteractionEventData.EventType.TYPE), false, false, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaxLotSelection.CheckBoxState toLoggable(ToggleableState toggleableState) {
        int i = WhenMappings.$EnumSwitchMapping$1[toggleableState.ordinal()];
        if (i == 1) {
            return TaxLotSelection.CheckBoxState.SELECTED;
        }
        if (i == 2) {
            return TaxLotSelection.CheckBoxState.PARTIAL;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return TaxLotSelection.CheckBoxState.UNSELECTED;
    }

    public static final void TaxLotsShareAndCheckBoxComposablePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1626555694);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1626555694, i, -1, "com.robinhood.android.equities.taxlots.table.TaxLotsShareAndCheckBoxComposablePreview (TaxLotShareAndCheckBoxCell.kt:333)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, TaxLotShareAndCheckBoxCell.INSTANCE.getLambda$847676516$lib_tax_lots_externalDebug(), composerStartRestartGroup, 100663296, 255);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotShareAndCheckBoxCellKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TaxLotShareAndCheckBoxCell3.TaxLotsShareAndCheckBoxComposablePreview$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
