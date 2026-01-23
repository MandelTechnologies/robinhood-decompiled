package com.robinhood.android.equities.taxlots.table;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColors2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.PlatformTextStyle;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.input.ImeAction;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.text.style.LineHeightStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.equities.taxlots.table.TaxLotsShareCell;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: TaxLotsShareCell.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001as\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"TaxLotsSharesComposable", "", "originalShareValue", "Ljava/math/BigDecimal;", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "enabled", "", "focused", "invalidNumberOfShares", "displayAlert", "onValueChange", "Lkotlin/Function1;", "stickyColumn", "rowIndex", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/math/BigDecimal;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZZZZLkotlin/jvm/functions/Function1;ZILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "lib-tax-lots_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.taxlots.table.TaxLotsShareCellKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class TaxLotsShareCell {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsSharesComposable$lambda$0(BigDecimal bigDecimal, TextFieldValue textFieldValue, InteractionSource3 interactionSource3, boolean z, boolean z2, boolean z3, boolean z4, Function1 function1, boolean z5, int i, Modifier modifier, int i2, int i3, int i4, Composer composer, int i5) {
        TaxLotsSharesComposable(bigDecimal, textFieldValue, interactionSource3, z, z2, z3, z4, function1, z5, i, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TaxLotsSharesComposable(final BigDecimal originalShareValue, final TextFieldValue value, final InteractionSource3 interactionSource, final boolean z, final boolean z2, final boolean z3, final boolean z4, final Function1<? super TextFieldValue, Unit> onValueChange, final boolean z5, final int i, Modifier modifier, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        int i6;
        int i7;
        Modifier modifier2;
        int i8;
        int i9;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(originalShareValue, "originalShareValue");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(919798813);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerStartRestartGroup.changedInstance(originalShareValue) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(value) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else if ((i2 & 384) == 0) {
            i5 |= composerStartRestartGroup.changed(interactionSource) ? 256 : 128;
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                z6 = z;
                i5 |= composerStartRestartGroup.changed(z6) ? 2048 : 1024;
            }
            if ((i4 & 16) == 0) {
                i5 |= 24576;
                z7 = z2;
            } else {
                z7 = z2;
                if ((i2 & 24576) == 0) {
                    i5 |= composerStartRestartGroup.changed(z7) ? 16384 : 8192;
                }
            }
            if ((i4 & 32) == 0) {
                i5 |= 196608;
            } else {
                if ((i2 & 196608) == 0) {
                    z8 = z3;
                    i5 |= composerStartRestartGroup.changed(z8) ? 131072 : 65536;
                }
                if ((i4 & 64) != 0) {
                    i5 |= 1572864;
                } else {
                    if ((i2 & 1572864) == 0) {
                        z9 = z4;
                        i5 |= composerStartRestartGroup.changed(z9) ? 1048576 : 524288;
                    }
                    if ((i4 & 128) == 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i5 |= composerStartRestartGroup.changedInstance(onValueChange) ? 8388608 : 4194304;
                    }
                    if ((i4 & 256) == 0) {
                        i5 |= 100663296;
                    } else {
                        if ((i2 & 100663296) == 0) {
                            z10 = z5;
                            i5 |= composerStartRestartGroup.changed(z10) ? 67108864 : 33554432;
                        }
                        if ((i4 & 512) == 0) {
                            if ((i2 & 805306368) == 0) {
                                i6 = i;
                                i5 |= composerStartRestartGroup.changed(i6) ? 536870912 : 268435456;
                            }
                            i7 = i4 & 1024;
                            if (i7 == 0) {
                                modifier2 = modifier;
                                i8 = i7;
                                i9 = i3 | 6;
                            } else {
                                modifier2 = modifier;
                                if ((i3 & 6) == 0) {
                                    i8 = i7;
                                    i9 = i3 | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
                                } else {
                                    i8 = i7;
                                    i9 = i3;
                                }
                            }
                            if ((i5 & 306783379) == 306783378 || (i9 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
                                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(919798813, i5, i9, "com.robinhood.android.equities.taxlots.table.TaxLotsSharesComposable (TaxLotsShareCell.kt:46)");
                                }
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i10 = BentoTheme.$stable;
                                CompositionLocal3.CompositionLocalProvider(TextSelectionColors2.getLocalTextSelectionColors().provides(new SelectionColors(bentoTheme.getColors(composerStartRestartGroup, i10).m21368getAccent0d7_KjU(), Color.m6705copywmQWz5c$default(bentoTheme.getColors(composerStartRestartGroup, i10).m21368getAccent0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null)), ComposableLambda3.rememberComposableLambda(-1668425891, true, new C149681(modifier4, value, z9, z8, z6, originalShareValue, onValueChange, interactionSource, i6, z10, z7), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsShareCellKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return TaxLotsShareCell.TaxLotsSharesComposable$lambda$0(originalShareValue, value, interactionSource, z, z2, z3, z4, onValueChange, z5, i, modifier3, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= 805306368;
                        i6 = i;
                        i7 = i4 & 1024;
                        if (i7 == 0) {
                        }
                        if ((i5 & 306783379) == 306783378) {
                            if (i8 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i102 = BentoTheme.$stable;
                            CompositionLocal3.CompositionLocalProvider(TextSelectionColors2.getLocalTextSelectionColors().provides(new SelectionColors(bentoTheme2.getColors(composerStartRestartGroup, i102).m21368getAccent0d7_KjU(), Color.m6705copywmQWz5c$default(bentoTheme2.getColors(composerStartRestartGroup, i102).m21368getAccent0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null)), ComposableLambda3.rememberComposableLambda(-1668425891, true, new C149681(modifier4, value, z9, z8, z6, originalShareValue, onValueChange, interactionSource, i6, z10, z7), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier4;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    z10 = z5;
                    if ((i4 & 512) == 0) {
                    }
                    i6 = i;
                    i7 = i4 & 1024;
                    if (i7 == 0) {
                    }
                    if ((i5 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                z9 = z4;
                if ((i4 & 128) == 0) {
                }
                if ((i4 & 256) == 0) {
                }
                z10 = z5;
                if ((i4 & 512) == 0) {
                }
                i6 = i;
                i7 = i4 & 1024;
                if (i7 == 0) {
                }
                if ((i5 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z8 = z3;
            if ((i4 & 64) != 0) {
            }
            z9 = z4;
            if ((i4 & 128) == 0) {
            }
            if ((i4 & 256) == 0) {
            }
            z10 = z5;
            if ((i4 & 512) == 0) {
            }
            i6 = i;
            i7 = i4 & 1024;
            if (i7 == 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        z6 = z;
        if ((i4 & 16) == 0) {
        }
        if ((i4 & 32) == 0) {
        }
        z8 = z3;
        if ((i4 & 64) != 0) {
        }
        z9 = z4;
        if ((i4 & 128) == 0) {
        }
        if ((i4 & 256) == 0) {
        }
        z10 = z5;
        if ((i4 & 512) == 0) {
        }
        i6 = i;
        i7 = i4 & 1024;
        if (i7 == 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: TaxLotsShareCell.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equities.taxlots.table.TaxLotsShareCellKt$TaxLotsSharesComposable$1 */
    static final class C149681 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ boolean $displayAlert;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ boolean $focused;
        final /* synthetic */ InteractionSource3 $interactionSource;
        final /* synthetic */ boolean $invalidNumberOfShares;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<TextFieldValue, Unit> $onValueChange;
        final /* synthetic */ BigDecimal $originalShareValue;
        final /* synthetic */ int $rowIndex;
        final /* synthetic */ boolean $stickyColumn;
        final /* synthetic */ TextFieldValue $value;

        /* JADX WARN: Multi-variable type inference failed */
        C149681(Modifier modifier, TextFieldValue textFieldValue, boolean z, boolean z2, boolean z3, BigDecimal bigDecimal, Function1<? super TextFieldValue, Unit> function1, InteractionSource3 interactionSource3, int i, boolean z4, boolean z5) {
            this.$modifier = modifier;
            this.$value = textFieldValue;
            this.$displayAlert = z;
            this.$invalidNumberOfShares = z2;
            this.$enabled = z3;
            this.$originalShareValue = bigDecimal;
            this.$onValueChange = function1;
            this.$interactionSource = interactionSource3;
            this.$rowIndex = i;
            this.$stickyColumn = z4;
            this.$focused = z5;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            long jM21425getFg0d7_KjU;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1668425891, i, -1, "com.robinhood.android.equities.taxlots.table.TaxLotsSharesComposable.<anonymous> (TaxLotsShareCell.kt:53)");
            }
            composer.startReplaceGroup(-1334477699);
            Modifier modifierSemantics$default = this.$modifier;
            boolean zIsBlank = StringsKt.isBlank(this.$value.getText());
            final int i2 = this.$rowIndex;
            final boolean z = this.$stickyColumn;
            if (!zIsBlank) {
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(i2) | composer.changed(z);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsShareCellKt$TaxLotsSharesComposable$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TaxLotsShareCell.C149681.invoke$lambda$3$lambda$2$lambda$1(i2, z, (SemanticsPropertyReceiver) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                modifierSemantics$default = SemanticsModifier6.semantics$default(modifierSemantics$default, false, (Function1) objRememberedValue, 1, null);
            }
            Modifier modifier = modifierSemantics$default;
            composer.endReplaceGroup();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            SolidColor solidColor = new SolidColor(bentoTheme.getColors(composer, i3).m21368getAccent0d7_KjU(), null);
            boolean z2 = !this.$displayAlert;
            KeyboardOptions keyboardOptionsM5353copyINvB4aQ$default = KeyboardOptions.m5353copyINvB4aQ$default(KeyboardOptions.INSTANCE.getDefault(), 0, null, 0, ImeAction.INSTANCE.m7749getNexteUduSuo(), null, null, null, 119, null);
            TextStyle textS = bentoTheme.getTypography(composer, i3).getTextS();
            int iM7920getEnde0LSkKk = TextAlign.INSTANCE.m7920getEnde0LSkKk();
            if (this.$invalidNumberOfShares) {
                composer.startReplaceGroup(-1334396379);
                jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i3).m21452getNegative0d7_KjU();
                composer.endReplaceGroup();
            } else if (this.$enabled || !Intrinsics.areEqual(this.$value.getText(), this.$originalShareValue.toString())) {
                composer.startReplaceGroup(-1334392961);
                jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1334391392);
                jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i3).m21427getFg30d7_KjU();
                composer.endReplaceGroup();
            }
            TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(textS, jM21425getFg0d7_KjU, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, iM7920getEnde0LSkKk, 0, 0L, null, new PlatformTextStyle(false), new LineHeightStyle(LineHeightStyle.Alignment.INSTANCE.m7890getProportionalPIaL0Z0(), LineHeightStyle.Trim.INSTANCE.m7911getNoneEVpEnUU(), (DefaultConstructorMarker) null), 0, 0, null, 15171582, null);
            TextFieldValue textFieldValue = this.$value;
            BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) this.$onValueChange, modifier, z2, false, textStyleM7655copyp1EtxEg$default, keyboardOptionsM5353copyINvB4aQ$default, (KeyboardActions) null, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, this.$interactionSource, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambda3.rememberComposableLambda(361715456, true, new AnonymousClass2(this.$invalidNumberOfShares, this.$focused, textFieldValue, this.$rowIndex, this.$stickyColumn, this.$originalShareValue), composer, 54), composer, 100663296, 196608, 7824);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2$lambda$1(int i, boolean z, SemanticsPropertyReceiver semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
            String str = "tax_lot_shares_" + (i + 1);
            if (z) {
                str = str + "_sticky";
            }
            SemanticsPropertiesKt.setTestTag(semantics, str);
            return Unit.INSTANCE;
        }

        /* compiled from: TaxLotsShareCell.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equities.taxlots.table.TaxLotsShareCellKt$TaxLotsSharesComposable$1$2, reason: invalid class name */
        static final class AnonymousClass2 implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
            final /* synthetic */ boolean $focused;
            final /* synthetic */ boolean $invalidNumberOfShares;
            final /* synthetic */ BigDecimal $originalShareValue;
            final /* synthetic */ int $rowIndex;
            final /* synthetic */ boolean $stickyColumn;
            final /* synthetic */ TextFieldValue $value;

            AnonymousClass2(boolean z, boolean z2, TextFieldValue textFieldValue, int i, boolean z3, BigDecimal bigDecimal) {
                this.$invalidNumberOfShares = z;
                this.$focused = z2;
                this.$value = textFieldValue;
                this.$rowIndex = i;
                this.$stickyColumn = z3;
                this.$originalShareValue = bigDecimal;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
                invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer, int i) {
                int i2;
                long jM21427getFg30d7_KjU;
                int i3;
                Composer composer2 = composer;
                Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                if ((i & 6) == 0) {
                    i2 = i | (composer2.changedInstance(innerTextField) ? 4 : 2);
                } else {
                    i2 = i;
                }
                if ((i2 & 19) == 18 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(361715456, i2, -1, "com.robinhood.android.equities.taxlots.table.TaxLotsSharesComposable.<anonymous>.<anonymous> (TaxLotsShareCell.kt:63)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
                if (this.$invalidNumberOfShares) {
                    composer2.startReplaceGroup(-283788984);
                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21452getNegative0d7_KjU();
                    composer2.endReplaceGroup();
                } else if (this.$focused) {
                    composer2.startReplaceGroup(-283786750);
                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU();
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-283784797);
                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21427getFg30d7_KjU();
                    composer2.endReplaceGroup();
                }
                Modifier modifierM4876borderxT4_qwU = BorderKt.m4876borderxT4_qwU(companion, fM7995constructorimpl, jM21427getFg30d7_KjU, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(4)));
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i4 = BentoTheme.$stable;
                Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierM4876borderxT4_qwU, bentoTheme.getSpacing(composer2, i4).m21595getXsmallD9Ej5fM(), bentoTheme.getSpacing(composer2, i4).m21593getSmallD9Ej5fM());
                Alignment centerEnd = Alignment.INSTANCE.getCenterEnd();
                TextFieldValue textFieldValue = this.$value;
                final int i5 = this.$rowIndex;
                final boolean z = this.$stickyColumn;
                BigDecimal bigDecimal = this.$originalShareValue;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerEnd, false);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5143paddingVpY3zN4);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composer2.startReplaceGroup(-542016964);
                if (StringsKt.isBlank(textFieldValue.getText())) {
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChanged = composer2.changed(i5) | composer2.changed(z);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsShareCellKt$TaxLotsSharesComposable$1$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TaxLotsShareCell.C149681.AnonymousClass2.invoke$lambda$3$lambda$2$lambda$1(i5, z, (SemanticsPropertyReceiver) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(companion, false, (Function1) objRememberedValue, 1, null);
                    String string2 = bigDecimal.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    i3 = i2;
                    BentoText2.m20747BentoText38GnDrw(string2, modifierSemantics$default, Color.m6701boximpl(bentoTheme.getColors(composer2, i4).m21427getFg30d7_KjU()), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer2, i4).getTextS(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7920getEnde0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), composer, 817889280, 0, 7544);
                    composer2 = composer;
                } else {
                    i3 = i2;
                }
                composer2.endReplaceGroup();
                innerTextField.invoke(composer2, Integer.valueOf(i3 & 14));
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$3$lambda$2$lambda$1(int i, boolean z, SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
                String str = "tax_lot_shares_" + (i + 1);
                if (z) {
                    str = str + "_sticky";
                }
                SemanticsPropertiesKt.setTestTag(semantics, str);
                return Unit.INSTANCE;
            }
        }
    }
}
