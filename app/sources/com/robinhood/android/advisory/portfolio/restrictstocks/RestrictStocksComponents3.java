package com.robinhood.android.advisory.portfolio.restrictstocks;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.SwipeToDismissBoxKt;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.material3.SwipeToDismissBoxValue;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.focus.FocusChangedModifier2;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.advisory.portfolio.C9151R;
import com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksComponents3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoProgressIndicator3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RestrictStocksComponents.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\u000b\u001aO\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00032\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0012\u001aW\u0010\u0013\u001a\u00020\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00072\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\u001b\u001a\u001f\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u001f¨\u0006 ²\u0006\n\u0010!\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010\"\u001a\u00020\u0007X\u008a\u008e\u0002"}, m3636d2 = {"CustomSnackBar", "", "message", "", "modifier", "Landroidx/compose/ui/Modifier;", "showLeadingCheckmark", "", "actionLabel", "onActionClick", "Lkotlin/Function0;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SearchBar", "query", "onQueryChange", "Lkotlin/Function1;", "onFocusChange", "enabled", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RestrictStocksSwipeableRow", "enableAction", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/SwipeAction;", "onAction", "rowData", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksRowData;", "isMetaClickable", "onMetaClick", "(Lcom/robinhood/android/advisory/portfolio/restrictstocks/SwipeAction;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksRowData;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SwipeBackground", "dismissState", "Landroidx/compose/material3/SwipeToDismissBoxState;", "(Landroidx/compose/material3/SwipeToDismissBoxState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-advisory-portfolio_externalDebug", "localQuery", "isFocused"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksComponentsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class RestrictStocksComponents3 {

    /* compiled from: RestrictStocksComponents.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksComponentsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SwipeToDismissBoxValue.values().length];
            try {
                iArr[SwipeToDismissBoxValue.EndToStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SwipeToDismissBoxValue.StartToEnd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomSnackBar$lambda$5(String str, Modifier modifier, boolean z, String str2, Function0 function0, int i, int i2, Composer composer, int i3) {
        CustomSnackBar(str, modifier, z, str2, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float RestrictStocksSwipeableRow$lambda$23$lambda$22(float f) {
        return f * 0.3f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RestrictStocksSwipeableRow$lambda$25(RestrictStocksComponents5 restrictStocksComponents5, Function1 function1, RestrictStocksViewState3 restrictStocksViewState3, Modifier modifier, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        RestrictStocksSwipeableRow(restrictStocksComponents5, function1, restrictStocksViewState3, modifier, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchBar$lambda$17(String str, Function1 function1, Function1 function12, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SearchBar(str, function1, function12, z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipeBackground$lambda$27(SwipeToDismissBoxState swipeToDismissBoxState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SwipeBackground(swipeToDismissBoxState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CustomSnackBar(final String message, Modifier modifier, boolean z, String str, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        String str2;
        int i6;
        Function0<Unit> function02;
        int i7;
        boolean z3;
        String str3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i8;
        Function0<Unit> function03;
        boolean z4;
        boolean z5;
        final String str4;
        final Function0<Unit> function04;
        final Function0<Unit> function05;
        final boolean z6;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(message, "message");
        Composer composerStartRestartGroup = composer.startRestartGroup(-695887704);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(message) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        str2 = str;
                        i3 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 != 0) {
                        if ((i & 24576) == 0) {
                            function02 = function0;
                            i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                        }
                        i7 = i3;
                        if ((i7 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier4 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                            z3 = i4 == 0 ? false : z2;
                            str3 = i5 == 0 ? "" : str2;
                            if (i6 != 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksComponentsKt$$ExternalSyntheticLambda8
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function02 = (Function0) objRememberedValue;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-695887704, i7, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.CustomSnackBar (RestrictStocksComponents.kt:61)");
                            }
                            Modifier modifierClip = Clip.clip(modifier4, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8)));
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i10 = BentoTheme.$stable;
                            float f = 12;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(Background3.m4872backgroundbw27NRU$default(modifierClip, bentoTheme.getColors(composerStartRestartGroup, i10).m21372getBg20d7_KjU(), null, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i10).m21590getDefaultD9Ej5fM(), C2002Dp.m7995constructorimpl(f)), 0.0f, 1, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(-1442308505);
                            if (z3) {
                                i8 = i10;
                                function03 = function02;
                                z4 = false;
                                z5 = true;
                            } else {
                                function03 = function02;
                                i8 = i10;
                                z4 = false;
                                z5 = true;
                                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.CHECKMARK_24), "", bentoTheme.getColors(composerStartRestartGroup, i10).m21425getFg0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(f), 0.0f, 11, null), null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 3120, 48);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifier5 = modifier4;
                            int i11 = i8;
                            BentoText2.m20747BentoText38GnDrw(message, Row5.weight$default(row6, Modifier.INSTANCE, 1.0f, false, 2, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i8).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i8).getTextM(), composerStartRestartGroup, i7 & 14, 0, 8184);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.startReplaceGroup(-1442293005);
                            if (str3.length() <= 0) {
                                long jM21456getPositive0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i11).m21456getPositive0d7_KjU();
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                boolean z7 = (i7 & 57344) == 16384 ? z5 : z4;
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (z7 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    function04 = function03;
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksComponentsKt$$ExternalSyntheticLambda9
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return RestrictStocksComponents3.CustomSnackBar$lambda$4$lambda$3$lambda$2(function04);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    function04 = function03;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                str4 = str3;
                                BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue2, str4, null, null, null, false, Color.m6701boximpl(jM21456getPositive0d7_KjU), composerStartRestartGroup, (i7 >> 6) & 112, 60);
                            } else {
                                str4 = str3;
                                function04 = function03;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function05 = function04;
                            z6 = z3;
                            modifier3 = modifier5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            z6 = z2;
                            str4 = str2;
                            function05 = function02;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksComponentsKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return RestrictStocksComponents3.CustomSnackBar$lambda$5(message, modifier3, z6, str4, function05, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 24576;
                    function02 = function0;
                    i7 = i3;
                    if ((i7 & 9363) != 9362) {
                        if (i9 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Modifier modifierClip2 = Clip.clip(modifier4, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8)));
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i102 = BentoTheme.$stable;
                        float f2 = 12;
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(Background3.m4872backgroundbw27NRU$default(modifierClip2, bentoTheme2.getColors(composerStartRestartGroup, i102).m21372getBg20d7_KjU(), null, 2, null), bentoTheme2.getSpacing(composerStartRestartGroup, i102).m21590getDefaultD9Ej5fM(), C2002Dp.m7995constructorimpl(f2)), 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                            Row6 row62 = Row6.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(-1442308505);
                            if (z3) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifier52 = modifier4;
                            int i112 = i8;
                            BentoText2.m20747BentoText38GnDrw(message, Row5.weight$default(row62, Modifier.INSTANCE, 1.0f, false, 2, null), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i8).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i8).getTextM(), composerStartRestartGroup, i7 & 14, 0, 8184);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.startReplaceGroup(-1442293005);
                            if (str3.length() <= 0) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function05 = function04;
                            z6 = z3;
                            modifier3 = modifier52;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                str2 = str;
                i6 = i2 & 16;
                if (i6 != 0) {
                }
                function02 = function0;
                i7 = i3;
                if ((i7 & 9363) != 9362) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            str2 = str;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            function02 = function0;
            i7 = i3;
            if ((i7 & 9363) != 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        str2 = str;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        function02 = function0;
        i7 = i3;
        if ((i7 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SearchBar$lambda$11(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final String SearchBar$lambda$7(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomSnackBar$lambda$4$lambda$3$lambda$2(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* compiled from: RestrictStocksComponents.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksComponentsKt$SearchBar$3 */
    static final class C91793 implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
        final /* synthetic */ long $foregroundColor;
        final /* synthetic */ SnapshotState<Boolean> $isFocused$delegate;
        final /* synthetic */ SnapshotState<String> $localQuery$delegate;
        final /* synthetic */ Function1<Boolean, Unit> $onFocusChange;
        final /* synthetic */ Function1<String, Unit> $onQueryChange;
        final /* synthetic */ String $query;

        /* JADX WARN: Multi-variable type inference failed */
        C91793(long j, String str, Function1<? super String, Unit> function1, Function1<? super Boolean, Unit> function12, SnapshotState<Boolean> snapshotState, SnapshotState<String> snapshotState2) {
            this.$foregroundColor = j;
            this.$query = str;
            this.$onQueryChange = function1;
            this.$onFocusChange = function12;
            this.$isFocused$delegate = snapshotState;
            this.$localQuery$delegate = snapshotState2;
        }

        public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer, int i) {
            int i2;
            Composer composer2;
            float f;
            Modifier.Companion companion;
            Function1<Boolean, Unit> function1;
            SnapshotState<String> snapshotState;
            Function1<String, Unit> function12;
            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
            if ((i & 6) == 0) {
                i2 = i | (composer.changedInstance(innerTextField) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-665502921, i2, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.SearchBar.<anonymous> (RestrictStocksComponents.kt:142)");
            }
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            long j = this.$foregroundColor;
            String str = this.$query;
            Function1<String, Unit> function13 = this.$onQueryChange;
            int i3 = i2;
            Function1<Boolean, Unit> function14 = this.$onFocusChange;
            SnapshotState<Boolean> snapshotState2 = this.$isFocused$delegate;
            SnapshotState<String> snapshotState3 = this.$localQuery$delegate;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, centerVertically, composer, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.SEARCH_16);
            int i4 = BentoIcon4.Size16.$stable;
            BentoIcon2.m20644BentoIconFU0evQE(size16, null, j, null, null, false, composer, i4 | 48, 56);
            float f2 = 10;
            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion3, C2002Dp.m7995constructorimpl(f2)), composer, 6);
            Modifier modifierM5155defaultMinSizeVpY3zN4$default = SizeKt.m5155defaultMinSizeVpY3zN4$default(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), 0.0f, C2002Dp.m7995constructorimpl(24), 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM5155defaultMinSizeVpY3zN4$default);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            innerTextField.invoke(composer, Integer.valueOf(i3 & 14));
            composer.startReplaceGroup(461427453);
            if (str.length() != 0 || RestrictStocksComponents3.SearchBar$lambda$11(snapshotState2)) {
                composer2 = composer;
                f = f2;
                companion = companion3;
                function1 = function14;
                snapshotState = snapshotState3;
                function12 = function13;
            } else {
                f = f2;
                companion = companion3;
                composer2 = composer;
                snapshotState = snapshotState3;
                function1 = function14;
                function12 = function13;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C9151R.string.search_placeholder, composer, 0), null, Color.m6701boximpl(j), null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM(), composer2, 0, 0, 8186);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(f)), composer2, 6);
            composer2.startReplaceGroup(1742137547);
            if (str.length() > 0) {
                BentoIcon4.Size16 size162 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.BUBBLE_REMOVE_FILLED_16);
                composer2.startReplaceGroup(-1746271574);
                final Function1<String, Unit> function15 = function12;
                final Function1<Boolean, Unit> function16 = function1;
                boolean zChanged = composer2.changed(function15) | composer2.changed(function16);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final SnapshotState<String> snapshotState4 = snapshotState;
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksComponentsKt$SearchBar$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RestrictStocksComponents3.C91793.invoke$lambda$3$lambda$2$lambda$1(function15, function16, snapshotState4);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                BentoIcon2.m20644BentoIconFU0evQE(size162, "clear search bar", j, ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null), null, false, composer2, i4 | 48, 48);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2$lambda$1(Function1 function1, Function1 function12, SnapshotState snapshotState) {
            function1.invoke("");
            function12.invoke(Boolean.FALSE);
            RestrictStocksComponents3.SearchBar$lambda$8(snapshotState, "");
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SearchBar(final String query, final Function1<? super String, Unit> onQueryChange, final Function1<? super Boolean, Unit> onFocusChange, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        long jM21427getFg30d7_KjU;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        Object objRememberedValue3;
        final SnapshotState snapshotState2;
        boolean z2;
        Object objRememberedValue4;
        boolean z3;
        Object objRememberedValue5;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(onQueryChange, "onQueryChange");
        Intrinsics.checkNotNullParameter(onFocusChange, "onFocusChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(1740152058);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(query) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onQueryChange) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onFocusChange) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i3;
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                if (i5 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1740152058, i4, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.SearchBar (RestrictStocksComponents.kt:108)");
                }
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(614960195);
                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(614917539);
                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(query, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = InteractionSource2.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                snapshotState2 = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                String strSearchBar$lambda$7 = SearchBar$lambda$7(snapshotState);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM(), bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                long j = jM21427getFg30d7_KjU;
                SolidColor solidColor = new SolidColor(bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), null);
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Clip.clip(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8))), bentoTheme.getColors(composerStartRestartGroup, i6).m21372getBg20d7_KjU(), null, 2, null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                z2 = (i4 & 896) != 256;
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!z2 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksComponentsKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return RestrictStocksComponents3.SearchBar$lambda$14$lambda$13(onFocusChange, snapshotState2, (FocusState) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(FocusChangedModifier2.onFocusChanged(modifierM4872backgroundbw27NRU$default, (Function1) objRememberedValue4), C2002Dp.m7995constructorimpl(12), C2002Dp.m7995constructorimpl(6));
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                z3 = (i4 & 112) == 32;
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!z3 || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksComponentsKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return RestrictStocksComponents3.SearchBar$lambda$16$lambda$15(onQueryChange, snapshotState, (String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                Modifier modifier4 = modifier2;
                BasicTextFieldKt.BasicTextField(strSearchBar$lambda$7, (Function1<? super String, Unit>) objRememberedValue5, modifierM5143paddingVpY3zN4, z, false, textStyleM7655copyp1EtxEg$default, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, interactionSource3, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambda3.rememberComposableLambda(-665502921, true, new C91793(j, query, onQueryChange, onFocusChange, snapshotState2, snapshotState), composerStartRestartGroup, 54), composer2, (i4 & 7168) | 100663296, 199680, 7888);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksComponentsKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RestrictStocksComponents3.SearchBar$lambda$17(query, onQueryChange, onFocusChange, z, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 9363) == 9362) {
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (z) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            snapshotState2 = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            String strSearchBar$lambda$72 = SearchBar$lambda$7(snapshotState);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            TextStyle textStyleM7655copyp1EtxEg$default2 = TextStyle.m7655copyp1EtxEg$default(bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextM(), bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            long j2 = jM21427getFg30d7_KjU;
            SolidColor solidColor2 = new SolidColor(bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU(), null);
            Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(Clip.clip(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8))), bentoTheme2.getColors(composerStartRestartGroup, i62).m21372getBg20d7_KjU(), null, 2, null);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            if ((i4 & 896) != 256) {
            }
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (!z2) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksComponentsKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RestrictStocksComponents3.SearchBar$lambda$14$lambda$13(onFocusChange, snapshotState2, (FocusState) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(FocusChangedModifier2.onFocusChanged(modifierM4872backgroundbw27NRU$default2, (Function1) objRememberedValue4), C2002Dp.m7995constructorimpl(12), C2002Dp.m7995constructorimpl(6));
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                if ((i4 & 112) == 32) {
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!z3) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksComponentsKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return RestrictStocksComponents3.SearchBar$lambda$16$lambda$15(onQueryChange, snapshotState, (String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier42 = modifier2;
                    BasicTextFieldKt.BasicTextField(strSearchBar$lambda$72, (Function1<? super String, Unit>) objRememberedValue5, modifierM5143paddingVpY3zN42, z, false, textStyleM7655copyp1EtxEg$default2, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, interactionSource32, (Brush) solidColor2, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambda3.rememberComposableLambda(-665502921, true, new C91793(j2, query, onQueryChange, onFocusChange, snapshotState2, snapshotState), composerStartRestartGroup, 54), composer2, (i4 & 7168) | 100663296, 199680, 7888);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier42;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SearchBar$lambda$8(SnapshotState<String> snapshotState, String str) {
        snapshotState.setValue(str);
    }

    private static final void SearchBar$lambda$12(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchBar$lambda$16$lambda$15(Function1 function1, SnapshotState snapshotState, String newQuery) {
        Intrinsics.checkNotNullParameter(newQuery, "newQuery");
        function1.invoke(newQuery);
        snapshotState.setValue(newQuery);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchBar$lambda$14$lambda$13(Function1 function1, SnapshotState snapshotState, FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SearchBar$lambda$12(snapshotState, it.isFocused());
        function1.invoke(Boolean.valueOf(it.isFocused()));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RestrictStocksSwipeableRow(final RestrictStocksComponents5 restrictStocksComponents5, final Function1<? super RestrictStocksComponents5, Unit> onAction, final RestrictStocksViewState3 rowData, Modifier modifier, boolean z, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        Function0<Unit> function02;
        final EventLogger current;
        final boolean z3;
        final boolean z4;
        final UserInteractionEventDescriptor userInteractionEventDescriptorUpdateWith;
        boolean zChanged;
        Object objRememberedValue;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final boolean z5;
        final Function0<Unit> function03;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(rowData, "rowData");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1898705293);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(restrictStocksComponents5 == null ? -1 : restrictStocksComponents5.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAction) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(rowData) : composerStartRestartGroup.changedInstance(rowData) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        function02 = function0;
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
                    }
                    if ((74899 & i3) != 74898 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z5 = z2;
                        function03 = function02;
                    } else {
                        Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if (i5 != 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksComponentsKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function02 = (Function0) objRememberedValue3;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1898705293, i3, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksSwipeableRow (RestrictStocksComponents.kt:205)");
                        }
                        current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                        z3 = restrictStocksComponents5 != RestrictStocksComponents5.ALLOW;
                        z4 = restrictStocksComponents5 != RestrictStocksComponents5.RESTRICT;
                        boolean z6 = restrictStocksComponents5 == null && !rowData.isUpdating();
                        userInteractionEventDescriptorUpdateWith = UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.ROW, rowData.getAssetId(), null, 4, null), null, 47, null));
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChanged = ((i3 & 112) != 32) | composerStartRestartGroup.changed(z4) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptorUpdateWith) | composerStartRestartGroup.changed(z3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            Function1 function1 = new Function1() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksComponentsKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return Boolean.valueOf(RestrictStocksComponents3.RestrictStocksSwipeableRow$lambda$21$lambda$20(z4, onAction, current, userInteractionEventDescriptorUpdateWith, z3, (SwipeToDismissBoxValue) obj));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function1);
                            objRememberedValue = function1;
                        }
                        Function1 function12 = (Function1) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksComponentsKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return Float.valueOf(RestrictStocksComponents3.RestrictStocksSwipeableRow$lambda$23$lambda$22(((Float) obj).floatValue()));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        final Function0<Unit> function04 = function02;
                        final boolean z7 = z2;
                        SwipeToDismissBoxState swipeToDismissBoxStateRememberSwipeToDismissBoxState = SwipeToDismissBoxKt.rememberSwipeToDismissBoxState(null, function12, (Function1) objRememberedValue2, composerStartRestartGroup, 384, 1);
                        Modifier modifier5 = modifier4;
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier5, userInteractionEventDescriptorUpdateWith, true, false, false, false, false, null, 108, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Modifier modifierMatchParentSize = BoxScopeInstance.INSTANCE.matchParentSize(Modifier.INSTANCE);
                        int i7 = SwipeToDismissBoxState.$stable;
                        SwipeBackground(swipeToDismissBoxStateRememberSwipeToDismissBoxState, modifierMatchParentSize, composerStartRestartGroup, i7, 0);
                        SwipeToDismissBoxKt.SwipeToDismissBox(swipeToDismissBoxStateRememberSwipeToDismissBoxState, RestrictStocksComponents.INSTANCE.m11161getLambda$1733193317$feature_advisory_portfolio_externalDebug(), null, z3, z4, z6, ComposableLambda3.rememberComposableLambda(156049846, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksComponentsKt$RestrictStocksSwipeableRow$2$1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                                invoke(row5, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Row5 SwipeToDismissBox, Composer composer2, int i8) {
                                Intrinsics.checkNotNullParameter(SwipeToDismissBox, "$this$SwipeToDismissBox");
                                if ((i8 & 17) == 16 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(156049846, i8, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksSwipeableRow.<anonymous>.<anonymous> (RestrictStocksComponents.kt:276)");
                                }
                                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
                                final RestrictStocksViewState3 restrictStocksViewState3 = rowData;
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-912240845, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksComponentsKt$RestrictStocksSwipeableRow$2$1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i9) {
                                        if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-912240845, i9, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksSwipeableRow.<anonymous>.<anonymous>.<anonymous> (RestrictStocksComponents.kt:280)");
                                        }
                                        String assetName = restrictStocksViewState3.getAssetName();
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i10 = BentoTheme.$stable;
                                        BentoText2.m20747BentoText38GnDrw(assetName, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i10).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i10).getTextM(), composer3, 0, 0, 8186);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54);
                                final RestrictStocksViewState3 restrictStocksViewState32 = rowData;
                                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(720656884, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksComponentsKt$RestrictStocksSwipeableRow$2$1.2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i9) {
                                        if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(720656884, i9, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksSwipeableRow.<anonymous>.<anonymous>.<anonymous> (RestrictStocksComponents.kt:287)");
                                        }
                                        String assetSymbol = restrictStocksViewState32.getAssetSymbol();
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i10 = BentoTheme.$stable;
                                        BentoText2.m20747BentoText38GnDrw(assetSymbol, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i10).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i10).getTextM(), composer3, 0, 0, 8186);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54);
                                final RestrictStocksViewState3 restrictStocksViewState33 = rowData;
                                final boolean z8 = z7;
                                final Function0<Unit> function05 = function04;
                                BentoBaseRowLayout.BentoBaseRowLayout(modifierM4872backgroundbw27NRU$default, null, null, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, ComposableLambda3.rememberComposableLambda(-1941412683, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksComponentsKt$RestrictStocksSwipeableRow$2$1.3
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i9) {
                                        if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1941412683, i9, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksSwipeableRow.<anonymous>.<anonymous>.<anonymous> (RestrictStocksComponents.kt:294)");
                                        }
                                        if (restrictStocksViewState33.isUpdating()) {
                                            composer3.startReplaceGroup(-595575515);
                                            BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(null, BentoProgressIndicator3.f5151S, 0L, composer3, 48, 5);
                                            composer3.endReplaceGroup();
                                        } else {
                                            composer3.startReplaceGroup(-595353679);
                                            Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(Modifier.INSTANCE, z8, null, null, function05, 6, null);
                                            String string2 = StringResource2.getString(restrictStocksViewState33.getMetaText(), composer3, StringResource.$stable);
                                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                            int i10 = BentoTheme.$stable;
                                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i10).m21425getFg0d7_KjU();
                                            BentoText2.m20747BentoText38GnDrw(string2, modifierM4893clickableXHw0xAI$default, Color.m6701boximpl(jM21425getFg0d7_KjU), null, z8 ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getNormal(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i10).getTextM(), composer3, 0, 0, 8168);
                                            composer3.endReplaceGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), null, true, false, false, null, composer2, 12807168, 0, 1862);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, i7 | 1572912, 4);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z7;
                        function03 = function04;
                        modifier3 = modifier5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksComponentsKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return RestrictStocksComponents3.RestrictStocksSwipeableRow$lambda$25(restrictStocksComponents5, onAction, rowData, modifier3, z5, function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                function02 = function0;
                if ((74899 & i3) != 74898) {
                    if (i6 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                    if (restrictStocksComponents5 != RestrictStocksComponents5.ALLOW) {
                    }
                    if (restrictStocksComponents5 != RestrictStocksComponents5.RESTRICT) {
                    }
                    if (restrictStocksComponents5 == null) {
                        userInteractionEventDescriptorUpdateWith = UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.ROW, rowData.getAssetId(), null, 4, null), null, 47, null));
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChanged = ((i3 & 112) != 32) | composerStartRestartGroup.changed(z4) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptorUpdateWith) | composerStartRestartGroup.changed(z3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            Function1 function13 = new Function1() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksComponentsKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return Boolean.valueOf(RestrictStocksComponents3.RestrictStocksSwipeableRow$lambda$21$lambda$20(z4, onAction, current, userInteractionEventDescriptorUpdateWith, z3, (SwipeToDismissBoxValue) obj));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function13);
                            objRememberedValue = function13;
                            Function1 function122 = (Function1) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            final Function0<Unit> function042 = function02;
                            final boolean z72 = z2;
                            SwipeToDismissBoxState swipeToDismissBoxStateRememberSwipeToDismissBoxState2 = SwipeToDismissBoxKt.rememberSwipeToDismissBoxState(null, function122, (Function1) objRememberedValue2, composerStartRestartGroup, 384, 1);
                            Modifier modifier52 = modifier4;
                            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifier52, userInteractionEventDescriptorUpdateWith, true, false, false, false, false, null, 108, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default2);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                                Modifier modifierMatchParentSize2 = BoxScopeInstance.INSTANCE.matchParentSize(Modifier.INSTANCE);
                                int i72 = SwipeToDismissBoxState.$stable;
                                SwipeBackground(swipeToDismissBoxStateRememberSwipeToDismissBoxState2, modifierMatchParentSize2, composerStartRestartGroup, i72, 0);
                                SwipeToDismissBoxKt.SwipeToDismissBox(swipeToDismissBoxStateRememberSwipeToDismissBoxState2, RestrictStocksComponents.INSTANCE.m11161getLambda$1733193317$feature_advisory_portfolio_externalDebug(), null, z3, z4, z6, ComposableLambda3.rememberComposableLambda(156049846, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksComponentsKt$RestrictStocksSwipeableRow$2$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                                        invoke(row5, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Row5 SwipeToDismissBox, Composer composer2, int i8) {
                                        Intrinsics.checkNotNullParameter(SwipeToDismissBox, "$this$SwipeToDismissBox");
                                        if ((i8 & 17) == 16 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(156049846, i8, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksSwipeableRow.<anonymous>.<anonymous> (RestrictStocksComponents.kt:276)");
                                        }
                                        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
                                        final RestrictStocksViewState3 restrictStocksViewState3 = rowData;
                                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-912240845, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksComponentsKt$RestrictStocksSwipeableRow$2$1.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer3, int i9) {
                                                if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-912240845, i9, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksSwipeableRow.<anonymous>.<anonymous>.<anonymous> (RestrictStocksComponents.kt:280)");
                                                }
                                                String assetName = restrictStocksViewState3.getAssetName();
                                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                int i10 = BentoTheme.$stable;
                                                BentoText2.m20747BentoText38GnDrw(assetName, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i10).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i10).getTextM(), composer3, 0, 0, 8186);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer2, 54);
                                        final RestrictStocksViewState3 restrictStocksViewState32 = rowData;
                                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(720656884, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksComponentsKt$RestrictStocksSwipeableRow$2$1.2
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer3, int i9) {
                                                if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(720656884, i9, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksSwipeableRow.<anonymous>.<anonymous>.<anonymous> (RestrictStocksComponents.kt:287)");
                                                }
                                                String assetSymbol = restrictStocksViewState32.getAssetSymbol();
                                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                int i10 = BentoTheme.$stable;
                                                BentoText2.m20747BentoText38GnDrw(assetSymbol, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i10).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i10).getTextM(), composer3, 0, 0, 8186);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer2, 54);
                                        final RestrictStocksViewState3 restrictStocksViewState33 = rowData;
                                        final boolean z8 = z72;
                                        final Function0<Unit> function05 = function042;
                                        BentoBaseRowLayout.BentoBaseRowLayout(modifierM4872backgroundbw27NRU$default, null, null, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, ComposableLambda3.rememberComposableLambda(-1941412683, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksComponentsKt$RestrictStocksSwipeableRow$2$1.3
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer3, int i9) {
                                                if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1941412683, i9, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksSwipeableRow.<anonymous>.<anonymous>.<anonymous> (RestrictStocksComponents.kt:294)");
                                                }
                                                if (restrictStocksViewState33.isUpdating()) {
                                                    composer3.startReplaceGroup(-595575515);
                                                    BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(null, BentoProgressIndicator3.f5151S, 0L, composer3, 48, 5);
                                                    composer3.endReplaceGroup();
                                                } else {
                                                    composer3.startReplaceGroup(-595353679);
                                                    Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(Modifier.INSTANCE, z8, null, null, function05, 6, null);
                                                    String string2 = StringResource2.getString(restrictStocksViewState33.getMetaText(), composer3, StringResource.$stable);
                                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                    int i10 = BentoTheme.$stable;
                                                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i10).m21425getFg0d7_KjU();
                                                    BentoText2.m20747BentoText38GnDrw(string2, modifierM4893clickableXHw0xAI$default, Color.m6701boximpl(jM21425getFg0d7_KjU), null, z8 ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getNormal(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i10).getTextM(), composer3, 0, 0, 8168);
                                                    composer3.endReplaceGroup();
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer2, 54), null, true, false, false, null, composer2, 12807168, 0, 1862);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), composerStartRestartGroup, i72 | 1572912, 4);
                                composerStartRestartGroup = composerStartRestartGroup;
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                z5 = z72;
                                function03 = function042;
                                modifier3 = modifier52;
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            function02 = function0;
            if ((74899 & i3) != 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        function02 = function0;
        if ((74899 & i3) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RestrictStocksSwipeableRow$lambda$21$lambda$20(boolean z, Function1 function1, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, boolean z2, SwipeToDismissBoxValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i = WhenMappings.$EnumSwitchMapping$0[it.ordinal()];
        if (i == 1) {
            if (!z) {
                return false;
            }
            function1.invoke(RestrictStocksComponents5.RESTRICT);
            EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.TOGGLE_OFF, null, null, null, 59, null)), UserInteractionEventData.EventType.EVENT_TYPE_UNSPECIFIED), false, false, 6, null);
            return false;
        }
        if (i != 2 || !z2) {
            return false;
        }
        function1.invoke(RestrictStocksComponents5.ALLOW);
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.TOGGLE_ON, null, null, null, 59, null)), UserInteractionEventData.EventType.EVENT_TYPE_UNSPECIFIED), false, false, 6, null);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void SwipeBackground(final SwipeToDismissBoxState swipeToDismissBoxState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        long jM21452getNegative0d7_KjU;
        int i5;
        Alignment centerEnd;
        int i6;
        String strStringResource;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1080369571);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(swipeToDismissBoxState) : composerStartRestartGroup.changedInstance(swipeToDismissBoxState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1080369571, i3, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.SwipeBackground (RestrictStocksComponents.kt:326)");
                }
                SwipeToDismissBoxValue dismissDirection = swipeToDismissBoxState.getDismissDirection();
                int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                i4 = iArr[dismissDirection.ordinal()];
                if (i4 != 1) {
                    composerStartRestartGroup.startReplaceGroup(-1146917909);
                    jM21452getNegative0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21452getNegative0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else if (i4 == 2) {
                    composerStartRestartGroup.startReplaceGroup(-1146920213);
                    jM21452getNegative0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21456getPositive0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1146916914);
                    composerStartRestartGroup.endReplaceGroup();
                    jM21452getNegative0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
                }
                long j = jM21452getNegative0d7_KjU;
                i5 = iArr[swipeToDismissBoxState.getDismissDirection().ordinal()];
                if (i5 != 1) {
                    centerEnd = Alignment.INSTANCE.getCenterEnd();
                } else if (i5 == 2) {
                    centerEnd = Alignment.INSTANCE.getCenterStart();
                } else {
                    centerEnd = Alignment.INSTANCE.getCenter();
                }
                i6 = iArr[swipeToDismissBoxState.getDismissDirection().ordinal()];
                if (i6 != 1) {
                    composerStartRestartGroup.startReplaceGroup(-1146902597);
                    strStringResource = StringResources_androidKt.stringResource(C9151R.string.restrict_stocks_restrict_button, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (i6 == 2) {
                    composerStartRestartGroup.startReplaceGroup(-1146905768);
                    strStringResource = StringResources_androidKt.stringResource(C9151R.string.restrict_stocks_allow_button, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1194171397);
                    composerStartRestartGroup.endReplaceGroup();
                    strStringResource = "";
                }
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), j, null, 2, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i8 = BentoTheme.$stable;
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierM4872backgroundbw27NRU$default, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerEnd, false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i8).getTextM();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier4;
                BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i8).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textM, composer2, 24576, 0, 8170);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksComponentsKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RestrictStocksComponents3.SwipeBackground$lambda$27(swipeToDismissBoxState, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) != 18) {
            if (i7 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            SwipeToDismissBoxValue dismissDirection2 = swipeToDismissBoxState.getDismissDirection();
            int[] iArr2 = WhenMappings.$EnumSwitchMapping$0;
            i4 = iArr2[dismissDirection2.ordinal()];
            if (i4 != 1) {
            }
            long j2 = jM21452getNegative0d7_KjU;
            i5 = iArr2[swipeToDismissBoxState.getDismissDirection().ordinal()];
            if (i5 != 1) {
            }
            i6 = iArr2[swipeToDismissBoxState.getDismissDirection().ordinal()];
            if (i6 != 1) {
            }
            Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), j2, null, 2, null);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i82 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(modifierM4872backgroundbw27NRU$default2, bentoTheme2.getSpacing(composerStartRestartGroup, i82).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(centerEnd, false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                TextStyle textM2 = bentoTheme2.getTypography(composerStartRestartGroup, i82).getTextM();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier4;
                BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i82).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textM2, composer2, 24576, 0, 8170);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
