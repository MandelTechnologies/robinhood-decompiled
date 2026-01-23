package com.robinhood.android.beneficiaries.p067ui.trustflow.taxidentifier;

import android.view.KeyEvent;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.ScaffoldDefaults;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.input.KeyboardType;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.beneficiaries.p067ui.trustflow.taxidentifier.BeneficiaryTrustTaxIdentifierCompose;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.numpad.BentoNumpad4;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScreenLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.utils.compose.extensions.WindowInsetsKt;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BeneficiaryTrustTaxIdentifierCompose.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a'\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\b\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\b\"\u000e\u0010\u000b\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"BeneficiaryTrustTaxIdentifierScaffold", "", "viewState", "Lcom/robinhood/android/beneficiaries/ui/trustflow/taxidentifier/BeneficiaryTrustTaxIdentifierViewState;", "callbacks", "Lcom/robinhood/android/beneficiaries/ui/trustflow/taxidentifier/BeneficiaryTrustTaxIdentifierCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/beneficiaries/ui/trustflow/taxidentifier/BeneficiaryTrustTaxIdentifierViewState;Lcom/robinhood/android/beneficiaries/ui/trustflow/taxidentifier/BeneficiaryTrustTaxIdentifierCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BeneficiaryTrustTaxIdentifierScaffoldContent", "BeneficiaryTrustTaxIdentifierNumpadContent", "BeneficiaryTrustTaxIdentifierNumpadTag", "", "BeneficiaryTrustTaxIdentifierInputTag", "feature-beneficiaries_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.beneficiaries.ui.trustflow.taxidentifier.BeneficiaryTrustTaxIdentifierComposeKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class BeneficiaryTrustTaxIdentifierCompose {
    public static final String BeneficiaryTrustTaxIdentifierInputTag = "BeneficiaryTrustTaxIdentifierInput";
    public static final String BeneficiaryTrustTaxIdentifierNumpadTag = "BeneficiaryTrustTaxIdentifierNumpad";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BeneficiaryTrustTaxIdentifierNumpadContent$lambda$5(BeneficiaryTrustTaxIdentifierViewState beneficiaryTrustTaxIdentifierViewState, BeneficiaryTrustTaxIdentifierCallbacks beneficiaryTrustTaxIdentifierCallbacks, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BeneficiaryTrustTaxIdentifierNumpadContent(beneficiaryTrustTaxIdentifierViewState, beneficiaryTrustTaxIdentifierCallbacks, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BeneficiaryTrustTaxIdentifierScaffold$lambda$0(BeneficiaryTrustTaxIdentifierViewState beneficiaryTrustTaxIdentifierViewState, BeneficiaryTrustTaxIdentifierCallbacks beneficiaryTrustTaxIdentifierCallbacks, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BeneficiaryTrustTaxIdentifierScaffold(beneficiaryTrustTaxIdentifierViewState, beneficiaryTrustTaxIdentifierCallbacks, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BeneficiaryTrustTaxIdentifierScaffoldContent$lambda$1(BeneficiaryTrustTaxIdentifierViewState beneficiaryTrustTaxIdentifierViewState, BeneficiaryTrustTaxIdentifierCallbacks beneficiaryTrustTaxIdentifierCallbacks, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BeneficiaryTrustTaxIdentifierScaffoldContent(beneficiaryTrustTaxIdentifierViewState, beneficiaryTrustTaxIdentifierCallbacks, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BeneficiaryTrustTaxIdentifierScaffold(final BeneficiaryTrustTaxIdentifierViewState viewState, final BeneficiaryTrustTaxIdentifierCallbacks callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1278293628);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1278293628, i3, -1, "com.robinhood.android.beneficiaries.ui.trustflow.taxidentifier.BeneficiaryTrustTaxIdentifierScaffold (BeneficiaryTrustTaxIdentifierCompose.kt:28)");
                }
                int i5 = ((i3 >> 6) & 14) | 805306368;
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, null, null, null, null, 0, 0L, 0L, WindowInsetsKt.excludeTop(ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, ScaffoldDefaults.$stable)), ComposableLambda3.rememberComposableLambda(-1359734645, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.beneficiaries.ui.trustflow.taxidentifier.BeneficiaryTrustTaxIdentifierComposeKt.BeneficiaryTrustTaxIdentifierScaffold.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i6 & 6) == 0) {
                            i6 |= composer3.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i6 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1359734645, i6, -1, "com.robinhood.android.beneficiaries.ui.trustflow.taxidentifier.BeneficiaryTrustTaxIdentifierScaffold.<anonymous> (BeneficiaryTrustTaxIdentifierCompose.kt:33)");
                        }
                        BeneficiaryTrustTaxIdentifierCompose.BeneficiaryTrustTaxIdentifierScaffoldContent(viewState, callbacks, PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), composer3, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, i5, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.beneficiaries.ui.trustflow.taxidentifier.BeneficiaryTrustTaxIdentifierComposeKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BeneficiaryTrustTaxIdentifierCompose.BeneficiaryTrustTaxIdentifierScaffold$lambda$0(viewState, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i52 = ((i3 >> 6) & 14) | 805306368;
            Modifier modifier52 = modifier4;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier52, null, null, null, null, 0, 0L, 0L, WindowInsetsKt.excludeTop(ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, ScaffoldDefaults.$stable)), ComposableLambda3.rememberComposableLambda(-1359734645, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.beneficiaries.ui.trustflow.taxidentifier.BeneficiaryTrustTaxIdentifierComposeKt.BeneficiaryTrustTaxIdentifierScaffold.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i6 & 6) == 0) {
                        i6 |= composer3.changed(paddingValues) ? 4 : 2;
                    }
                    if ((i6 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1359734645, i6, -1, "com.robinhood.android.beneficiaries.ui.trustflow.taxidentifier.BeneficiaryTrustTaxIdentifierScaffold.<anonymous> (BeneficiaryTrustTaxIdentifierCompose.kt:33)");
                    }
                    BeneficiaryTrustTaxIdentifierCompose.BeneficiaryTrustTaxIdentifierScaffoldContent(viewState, callbacks, PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), composer3, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, i52, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BeneficiaryTrustTaxIdentifierScaffoldContent(final BeneficiaryTrustTaxIdentifierViewState beneficiaryTrustTaxIdentifierViewState, final BeneficiaryTrustTaxIdentifierCallbacks beneficiaryTrustTaxIdentifierCallbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1220059165);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(beneficiaryTrustTaxIdentifierViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(beneficiaryTrustTaxIdentifierCallbacks) : composerStartRestartGroup.changedInstance(beneficiaryTrustTaxIdentifierCallbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1220059165, i3, -1, "com.robinhood.android.beneficiaries.ui.trustflow.taxidentifier.BeneficiaryTrustTaxIdentifierScaffoldContent (BeneficiaryTrustTaxIdentifierCompose.kt:48)");
            }
            BentoNumpadScreenLayout.BentoNumpadScreenLayout(modifier3, ComposableLambda3.rememberComposableLambda(1637695238, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.beneficiaries.ui.trustflow.taxidentifier.BeneficiaryTrustTaxIdentifierComposeKt.BeneficiaryTrustTaxIdentifierScaffoldContent.1
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
                        ComposerKt.traceEventStart(1637695238, i5, -1, "com.robinhood.android.beneficiaries.ui.trustflow.taxidentifier.BeneficiaryTrustTaxIdentifierScaffoldContent.<anonymous> (BeneficiaryTrustTaxIdentifierCompose.kt:51)");
                    }
                    BeneficiaryTrustTaxIdentifierViewState beneficiaryTrustTaxIdentifierViewState2 = beneficiaryTrustTaxIdentifierViewState;
                    BeneficiaryTrustTaxIdentifierCallbacks beneficiaryTrustTaxIdentifierCallbacks2 = beneficiaryTrustTaxIdentifierCallbacks;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    BeneficiaryTrustTaxIdentifierCompose.BeneficiaryTrustTaxIdentifierNumpadContent(beneficiaryTrustTaxIdentifierViewState2, beneficiaryTrustTaxIdentifierCallbacks2, PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), 7, null), composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(13722102, true, new C98452(beneficiaryTrustTaxIdentifierViewState, beneficiaryTrustTaxIdentifierCallbacks), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.beneficiaries.ui.trustflow.taxidentifier.BeneficiaryTrustTaxIdentifierComposeKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BeneficiaryTrustTaxIdentifierCompose.BeneficiaryTrustTaxIdentifierScaffoldContent$lambda$1(beneficiaryTrustTaxIdentifierViewState, beneficiaryTrustTaxIdentifierCallbacks, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: BeneficiaryTrustTaxIdentifierCompose.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.beneficiaries.ui.trustflow.taxidentifier.BeneficiaryTrustTaxIdentifierComposeKt$BeneficiaryTrustTaxIdentifierScaffoldContent$2 */
    static final class C98452 implements Function3<BentoNumpad4, Composer, Integer, Unit> {
        final /* synthetic */ BeneficiaryTrustTaxIdentifierCallbacks $callbacks;
        final /* synthetic */ BeneficiaryTrustTaxIdentifierViewState $viewState;

        C98452(BeneficiaryTrustTaxIdentifierViewState beneficiaryTrustTaxIdentifierViewState, BeneficiaryTrustTaxIdentifierCallbacks beneficiaryTrustTaxIdentifierCallbacks) {
            this.$viewState = beneficiaryTrustTaxIdentifierViewState;
            this.$callbacks = beneficiaryTrustTaxIdentifierCallbacks;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoNumpad4 bentoNumpad4, Composer composer, Integer num) {
            invoke(bentoNumpad4, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BentoNumpad4 BentoNumpadScreenLayout, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(BentoNumpadScreenLayout, "$this$BentoNumpadScreenLayout");
            if ((i & 6) == 0) {
                i2 = i | ((i & 8) == 0 ? composer.changed(BentoNumpadScreenLayout) : composer.changedInstance(BentoNumpadScreenLayout) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(13722102, i2, -1, "com.robinhood.android.beneficiaries.ui.trustflow.taxidentifier.BeneficiaryTrustTaxIdentifierScaffoldContent.<anonymous> (BeneficiaryTrustTaxIdentifierCompose.kt:61)");
            }
            Modifier modifierTestTag = TestTag3.testTag(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BeneficiaryTrustTaxIdentifierCompose.BeneficiaryTrustTaxIdentifierNumpadTag);
            String string2 = StringResource2.getString(this.$viewState.getBottomButtonText(), composer, StringResource.$stable);
            boolean bottomButtonEnabled = this.$viewState.getBottomButtonEnabled();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.$callbacks);
            final BeneficiaryTrustTaxIdentifierCallbacks beneficiaryTrustTaxIdentifierCallbacks = this.$callbacks;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.beneficiaries.ui.trustflow.taxidentifier.BeneficiaryTrustTaxIdentifierComposeKt$BeneficiaryTrustTaxIdentifierScaffoldContent$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BeneficiaryTrustTaxIdentifierCompose.C98452.invoke$lambda$1$lambda$0(beneficiaryTrustTaxIdentifierCallbacks, (KeyEvent) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1<? super KeyEvent, Unit> function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(this.$callbacks);
            final BeneficiaryTrustTaxIdentifierCallbacks beneficiaryTrustTaxIdentifierCallbacks2 = this.$callbacks;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.beneficiaries.ui.trustflow.taxidentifier.BeneficiaryTrustTaxIdentifierComposeKt$BeneficiaryTrustTaxIdentifierScaffoldContent$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BeneficiaryTrustTaxIdentifierCompose.C98452.invoke$lambda$3$lambda$2(beneficiaryTrustTaxIdentifierCallbacks2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoNumpadScreenLayout.BentoNumpadWithButton(modifierTestTag, function1, string2, (Function0) objRememberedValue2, false, bottomButtonEnabled, false, false, false, false, null, false, composer, 100663302, (BentoNumpad4.$stable << 6) | ((i2 << 6) & 896), 3792);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(BeneficiaryTrustTaxIdentifierCallbacks beneficiaryTrustTaxIdentifierCallbacks) {
            beneficiaryTrustTaxIdentifierCallbacks.onTrustTaxIdentifierConfirmed();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(BeneficiaryTrustTaxIdentifierCallbacks beneficiaryTrustTaxIdentifierCallbacks, KeyEvent it) {
            Intrinsics.checkNotNullParameter(it, "it");
            beneficiaryTrustTaxIdentifierCallbacks.onTrustTaxIdentifierInput(it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BeneficiaryTrustTaxIdentifierNumpadContent(final BeneficiaryTrustTaxIdentifierViewState beneficiaryTrustTaxIdentifierViewState, BeneficiaryTrustTaxIdentifierCallbacks beneficiaryTrustTaxIdentifierCallbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        BeneficiaryTrustTaxIdentifierViewState beneficiaryTrustTaxIdentifierViewState2;
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i4;
        String subtitle_markdown;
        boolean z;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final BeneficiaryTrustTaxIdentifierCallbacks beneficiaryTrustTaxIdentifierCallbacks2 = beneficiaryTrustTaxIdentifierCallbacks;
        Composer composerStartRestartGroup = composer.startRestartGroup(-631874964);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            beneficiaryTrustTaxIdentifierViewState2 = beneficiaryTrustTaxIdentifierViewState;
        } else if ((i & 6) == 0) {
            beneficiaryTrustTaxIdentifierViewState2 = beneficiaryTrustTaxIdentifierViewState;
            i3 = (composerStartRestartGroup.changedInstance(beneficiaryTrustTaxIdentifierViewState2) ? 4 : 2) | i;
        } else {
            beneficiaryTrustTaxIdentifierViewState2 = beneficiaryTrustTaxIdentifierViewState;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(beneficiaryTrustTaxIdentifierCallbacks2) : composerStartRestartGroup.changedInstance(beneficiaryTrustTaxIdentifierCallbacks2) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-631874964, i3, -1, "com.robinhood.android.beneficiaries.ui.trustflow.taxidentifier.BeneficiaryTrustTaxIdentifierNumpadContent (BeneficiaryTrustTaxIdentifierCompose.kt:83)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                Modifier modifier5 = modifier4;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                TextAlign.Companion companion3 = TextAlign.INSTANCE;
                i4 = i3;
                BentoText2.m20747BentoText38GnDrw(beneficiaryTrustTaxIdentifierViewState2.getTrustTaxIdentifierViewModel().getTitle(), modifierFillMaxWidth$default, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleMedium(), composerStartRestartGroup, 48, 0, 8120);
                Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                int iM7919getCentere0LSkKk = companion3.m7919getCentere0LSkKk();
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU();
                TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM();
                subtitle_markdown = beneficiaryTrustTaxIdentifierViewState.getTrustTaxIdentifierViewModel().getSubtitle_markdown();
                if (subtitle_markdown == null) {
                    subtitle_markdown = "";
                }
                BentoText2.m20747BentoText38GnDrw(subtitle_markdown, modifierFillMaxWidth$default2, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, textM, composerStartRestartGroup, 48, 0, 8120);
                Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion2, C2002Dp.m7995constructorimpl(64)), composerStartRestartGroup, 6);
                Modifier modifierTestTag = TestTag3.testTag(companion2, BeneficiaryTrustTaxIdentifierInputTag);
                String trustTaxIdentifierInputString = beneficiaryTrustTaxIdentifierViewState.getTrustTaxIdentifierInputString();
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.m7782getNumberPasswordPjHm6EE(), 0, null, null, null, 123, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                if ((i4 & 112) == 32) {
                    beneficiaryTrustTaxIdentifierCallbacks2 = beneficiaryTrustTaxIdentifierCallbacks;
                    if ((i4 & 64) == 0 || !composerStartRestartGroup.changedInstance(beneficiaryTrustTaxIdentifierCallbacks2)) {
                        z = false;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.beneficiaries.ui.trustflow.taxidentifier.BeneficiaryTrustTaxIdentifierComposeKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return BeneficiaryTrustTaxIdentifierCompose.m1741xf82e294f(beneficiaryTrustTaxIdentifierCallbacks2, (String) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    BentoTextInput4.BentoHeroTextInput(trustTaxIdentifierInputString, (Function1) objRememberedValue, modifierTestTag, null, null, null, null, null, null, keyboardOptions, null, null, false, false, composer2, 805306752, 0, 15864);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                } else {
                    beneficiaryTrustTaxIdentifierCallbacks2 = beneficiaryTrustTaxIdentifierCallbacks;
                }
                z = true;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.beneficiaries.ui.trustflow.taxidentifier.BeneficiaryTrustTaxIdentifierComposeKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return BeneficiaryTrustTaxIdentifierCompose.m1741xf82e294f(beneficiaryTrustTaxIdentifierCallbacks2, (String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    BentoTextInput4.BentoHeroTextInput(trustTaxIdentifierInputString, (Function1) objRememberedValue, modifierTestTag, null, null, null, null, null, null, keyboardOptions, null, null, false, false, composer2, 805306752, 0, 15864);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier5;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.beneficiaries.ui.trustflow.taxidentifier.BeneficiaryTrustTaxIdentifierComposeKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BeneficiaryTrustTaxIdentifierCompose.BeneficiaryTrustTaxIdentifierNumpadContent$lambda$5(beneficiaryTrustTaxIdentifierViewState, beneficiaryTrustTaxIdentifierCallbacks2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion4.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion22 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                Modifier modifier52 = modifier4;
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null);
                TextAlign.Companion companion32 = TextAlign.INSTANCE;
                i4 = i3;
                BentoText2.m20747BentoText38GnDrw(beneficiaryTrustTaxIdentifierViewState2.getTrustTaxIdentifierViewModel().getTitle(), modifierFillMaxWidth$default3, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion32.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getDisplayCapsuleMedium(), composerStartRestartGroup, 48, 0, 8120);
                Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                Modifier modifierFillMaxWidth$default22 = SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null);
                int iM7919getCentere0LSkKk2 = companion32.m7919getCentere0LSkKk();
                long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU();
                TextStyle textM2 = bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextM();
                subtitle_markdown = beneficiaryTrustTaxIdentifierViewState.getTrustTaxIdentifierViewModel().getSubtitle_markdown();
                if (subtitle_markdown == null) {
                }
                BentoText2.m20747BentoText38GnDrw(subtitle_markdown, modifierFillMaxWidth$default22, Color.m6701boximpl(jM21425getFg0d7_KjU2), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk2), 0, false, 0, 0, null, 0, textM2, composerStartRestartGroup, 48, 0, 8120);
                Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion22, C2002Dp.m7995constructorimpl(64)), composerStartRestartGroup, 6);
                Modifier modifierTestTag2 = TestTag3.testTag(companion22, BeneficiaryTrustTaxIdentifierInputTag);
                String trustTaxIdentifierInputString2 = beneficiaryTrustTaxIdentifierViewState.getTrustTaxIdentifierInputString();
                KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, null, KeyboardType.INSTANCE.m7782getNumberPasswordPjHm6EE(), 0, null, null, null, 123, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                if ((i4 & 112) == 32) {
                }
                z = true;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BeneficiaryTrustTaxIdentifierNumpadContent$lambda$4$lambda$3$lambda$2 */
    public static final Unit m1741xf82e294f(BeneficiaryTrustTaxIdentifierCallbacks beneficiaryTrustTaxIdentifierCallbacks, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        beneficiaryTrustTaxIdentifierCallbacks.onTrustTaxIdentifierInput(it);
        return Unit.INSTANCE;
    }
}
