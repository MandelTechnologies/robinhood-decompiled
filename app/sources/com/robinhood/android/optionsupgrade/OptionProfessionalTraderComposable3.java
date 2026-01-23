package com.robinhood.android.optionsupgrade;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionProfessionalTraderComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0099\u0001\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u00032\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u0014\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m3636d2 = {"", "title", "description", "Lkotlinx/collections/immutable/ImmutableList;", "valueProps", "disclosureMarkdown", "", "isNotProfessionalTraderButtonLoading", "isProfessionalTraderButtonLoading", "Lkotlin/Function0;", "", "onPrimaryCtaButtonClicked", "onSecondaryCtaButtonClicked", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/text/style/TextAlign;", "textAlign", "Landroidx/compose/ui/unit/Dp;", "titleTopSpacing", "topAppBar", "useBulletPoints", "OptionProfessionalTraderComposable-e3GALPE", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;IFLkotlin/jvm/functions/Function2;ZLandroidx/compose/runtime/Composer;III)V", "OptionProfessionalTraderComposable", "feature-options-upgrade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.OptionProfessionalTraderComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionProfessionalTraderComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionProfessionalTraderComposable_e3GALPE$lambda$0(String str, String str2, ImmutableList immutableList, String str3, boolean z, boolean z2, Function0 function0, Function0 function02, Modifier modifier, int i, float f, Function2 function2, boolean z3, int i2, int i3, int i4, Composer composer, int i5) {
        m17458OptionProfessionalTraderComposablee3GALPE(str, str2, immutableList, str3, z, z2, function0, function02, modifier, i, f, function2, z3, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012c  */
    /* renamed from: OptionProfessionalTraderComposable-e3GALPE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m17458OptionProfessionalTraderComposablee3GALPE(final String title, final String description, final ImmutableList<String> valueProps, final String disclosureMarkdown, final boolean z, final boolean z2, final Function0<Unit> onPrimaryCtaButtonClicked, final Function0<Unit> onSecondaryCtaButtonClicked, Modifier modifier, int i, float f, Function2<? super Composer, ? super Integer, Unit> function2, boolean z3, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        boolean z4;
        int i6;
        Modifier modifier2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int iM7919getCentere0LSkKk;
        float fM21592getMediumD9Ej5fM;
        boolean z5;
        int i12;
        Function2<? super Composer, ? super Integer, Unit> function22;
        int i13;
        float f2;
        Composer composer2;
        final float f3;
        final int i14;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(valueProps, "valueProps");
        Intrinsics.checkNotNullParameter(disclosureMarkdown, "disclosureMarkdown");
        Intrinsics.checkNotNullParameter(onPrimaryCtaButtonClicked, "onPrimaryCtaButtonClicked");
        Intrinsics.checkNotNullParameter(onSecondaryCtaButtonClicked, "onSecondaryCtaButtonClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1698460811);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(description) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else if ((i2 & 384) == 0) {
            i5 |= composerStartRestartGroup.changed(valueProps) ? 256 : 128;
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changed(disclosureMarkdown) ? 2048 : 1024;
        }
        if ((i4 & 16) == 0) {
            if ((i2 & 24576) == 0) {
                z4 = z;
                i5 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
            }
            if ((i4 & 32) == 0) {
                i5 |= 196608;
            } else if ((i2 & 196608) == 0) {
                i5 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
            }
            if ((i4 & 64) == 0) {
                i5 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                i5 |= composerStartRestartGroup.changedInstance(onPrimaryCtaButtonClicked) ? 1048576 : 524288;
            }
            if ((i4 & 128) == 0) {
                i5 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                i5 |= composerStartRestartGroup.changedInstance(onSecondaryCtaButtonClicked) ? 8388608 : 4194304;
            }
            i6 = i4 & 256;
            if (i6 == 0) {
                i5 |= 100663296;
                modifier2 = modifier;
            } else {
                modifier2 = modifier;
                if ((i2 & 100663296) == 0) {
                    i5 |= composerStartRestartGroup.changed(modifier2) ? 67108864 : 33554432;
                }
            }
            if ((i2 & 805306368) == 0) {
                i5 |= ((i4 & 512) == 0 && composerStartRestartGroup.changed(i)) ? 536870912 : 268435456;
            }
            if ((i3 & 6) != 0) {
                i7 = i3 | (((i4 & 1024) == 0 && composerStartRestartGroup.changed(f)) ? 4 : 2);
            } else {
                i7 = i3;
            }
            i8 = i4 & 2048;
            if (i8 == 0) {
                i7 |= 48;
                i9 = i8;
            } else if ((i3 & 48) == 0) {
                i9 = i8;
                i7 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
            } else {
                i9 = i8;
            }
            int i15 = i7;
            i10 = i4 & 4096;
            if (i10 == 0) {
                i11 = i15 | 384;
            } else {
                int i16 = i15;
                if ((i3 & 384) == 0) {
                    i16 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
                }
                i11 = i16;
            }
            if ((i5 & 306783379) == 306783378 || (i11 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i4 & 512) == 0) {
                        iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                        i5 &= -1879048193;
                    } else {
                        iM7919getCentere0LSkKk = i;
                    }
                    if ((i4 & 1024) == 0) {
                        fM21592getMediumD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM();
                        i11 &= -15;
                    } else {
                        fM21592getMediumD9Ej5fM = f;
                    }
                    Function2<? super Composer, ? super Integer, Unit> function2M17390getLambda$51138118$feature_options_upgrade_externalDebug = i9 == 0 ? OptionProfessionalTraderComposable.INSTANCE.m17390getLambda$51138118$feature_options_upgrade_externalDebug() : function2;
                    if (i10 == 0) {
                        i12 = iM7919getCentere0LSkKk;
                        function22 = function2M17390getLambda$51138118$feature_options_upgrade_externalDebug;
                        z5 = false;
                    } else {
                        z5 = z3;
                        i12 = iM7919getCentere0LSkKk;
                        function22 = function2M17390getLambda$51138118$feature_options_upgrade_externalDebug;
                    }
                    i13 = i11;
                    modifier2 = modifier3;
                    f2 = fM21592getMediumD9Ej5fM;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i4 & 512) != 0) {
                        i5 &= -1879048193;
                    }
                    if ((i4 & 1024) != 0) {
                        i11 &= -15;
                    }
                    i12 = i;
                    f2 = f;
                    function22 = function2;
                    z5 = z3;
                    i13 = i11;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1698460811, i5, i13, "com.robinhood.android.optionsupgrade.OptionProfessionalTraderComposable (OptionProfessionalTraderComposable.kt:41)");
                }
                final boolean z6 = z4;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(WindowInsetsPadding_androidKt.systemBarsPadding(modifier2), function22, ComposableLambda3.rememberComposableLambda(-640313584, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionProfessionalTraderComposableKt$OptionProfessionalTraderComposable$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i17) {
                        if ((i17 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-640313584, i17, -1, "com.robinhood.android.optionsupgrade.OptionProfessionalTraderComposable.<anonymous> (OptionProfessionalTraderComposable.kt:47)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i18 = BentoTheme.$stable;
                        Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer3, i18).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                        String str = disclosureMarkdown;
                        boolean z7 = z2;
                        boolean z8 = z6;
                        Function0<Unit> function0 = onPrimaryCtaButtonClicked;
                        Function0<Unit> function02 = onSecondaryCtaButtonClicked;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        BentoMarkdownText2.BentoMarkdownText(str, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer3, i18).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0L, 0L, false, composer3, BentoMarkdownText.$stable << 15, 28), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 26);
                        BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, function0, StringResources_androidKt.stringResource(C25121R.string.uk_options_not_professional_trader_button, composer3, 0), z8, null, !z7, function02, StringResources_androidKt.stringResource(C25121R.string.uk_options_professional_trader_button, composer3, 0), z7, null, !z8, composer3, 0, 0, 16959);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, 0, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, null, ComposableLambda3.rememberComposableLambda(-1887159546, true, new OptionProfessionalTraderComposable5(f2, title, i12, description, valueProps, z5), composerStartRestartGroup, 54), composer2, (i13 & 112) | 805306752, 440);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = f2;
                i14 = i12;
                function23 = function22;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                f3 = f;
                function23 = function2;
                z5 = z3;
                composer2 = composerStartRestartGroup;
                i14 = i;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier2;
                final boolean z7 = z5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionProfessionalTraderComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionProfessionalTraderComposable3.OptionProfessionalTraderComposable_e3GALPE$lambda$0(title, description, valueProps, disclosureMarkdown, z, z2, onPrimaryCtaButtonClicked, onSecondaryCtaButtonClicked, modifier4, i14, f3, function23, z7, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 24576;
        z4 = z;
        if ((i4 & 32) == 0) {
        }
        if ((i4 & 64) == 0) {
        }
        if ((i4 & 128) == 0) {
        }
        i6 = i4 & 256;
        if (i6 == 0) {
        }
        if ((i2 & 805306368) == 0) {
        }
        if ((i3 & 6) != 0) {
        }
        i8 = i4 & 2048;
        if (i8 == 0) {
        }
        int i152 = i7;
        i10 = i4 & 4096;
        if (i10 == 0) {
        }
        if ((i5 & 306783379) == 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i6 == 0) {
                }
                if ((i4 & 512) == 0) {
                }
                if ((i4 & 1024) == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                i13 = i11;
                modifier2 = modifier3;
                f2 = fM21592getMediumD9Ej5fM;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final boolean z62 = z4;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(WindowInsetsPadding_androidKt.systemBarsPadding(modifier2), function22, ComposableLambda3.rememberComposableLambda(-640313584, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionProfessionalTraderComposableKt$OptionProfessionalTraderComposable$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i17) {
                        if ((i17 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-640313584, i17, -1, "com.robinhood.android.optionsupgrade.OptionProfessionalTraderComposable.<anonymous> (OptionProfessionalTraderComposable.kt:47)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i18 = BentoTheme.$stable;
                        Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer3, i18).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                        String str = disclosureMarkdown;
                        boolean z72 = z2;
                        boolean z8 = z62;
                        Function0<Unit> function0 = onPrimaryCtaButtonClicked;
                        Function0<Unit> function02 = onSecondaryCtaButtonClicked;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        BentoMarkdownText2.BentoMarkdownText(str, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer3, i18).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0L, 0L, false, composer3, BentoMarkdownText.$stable << 15, 28), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 26);
                        BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, function0, StringResources_androidKt.stringResource(C25121R.string.uk_options_not_professional_trader_button, composer3, 0), z8, null, !z72, function02, StringResources_androidKt.stringResource(C25121R.string.uk_options_professional_trader_button, composer3, 0), z72, null, !z8, composer3, 0, 0, 16959);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, 0, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, null, ComposableLambda3.rememberComposableLambda(-1887159546, true, new OptionProfessionalTraderComposable5(f2, title, i12, description, valueProps, z5), composerStartRestartGroup, 54), composer2, (i13 & 112) | 805306752, 440);
                if (ComposerKt.isTraceInProgress()) {
                }
                f3 = f2;
                i14 = i12;
                function23 = function22;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
