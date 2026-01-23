package com.robinhood.android.advisor.marketplace.onboarding;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.BackHandler5;
import com.robinhood.android.advisor.marketplace.onboarding.AdvisorMarketplaceOnboardingComponents;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AdvisorMarketplaceOnboardingComponents.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/robinhood/android/advisor/marketplace/onboarding/NavigationIconStyle;", "iconStyle", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/PaddingValues;", "", "content", "BackHandlingScaffold", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/advisor/marketplace/onboarding/NavigationIconStyle;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "AdvisorMarketplacePlaceholderScreen", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-advisor-marketplace-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisor.marketplace.onboarding.AdvisorMarketplaceOnboardingComponentsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisorMarketplaceOnboardingComponents {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisorMarketplacePlaceholderScreen$lambda$1(Modifier modifier, int i, int i2, Composer composer, int i3) {
        AdvisorMarketplacePlaceholderScreen(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BackHandlingScaffold$lambda$0(Modifier modifier, AdvisorMarketplaceOnboardingComponents5 advisorMarketplaceOnboardingComponents5, Function3 function3, int i, int i2, Composer composer, int i3) {
        BackHandlingScaffold(modifier, advisorMarketplaceOnboardingComponents5, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void BackHandlingScaffold(Modifier modifier, AdvisorMarketplaceOnboardingComponents5 advisorMarketplaceOnboardingComponents5, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        final AdvisorMarketplaceOnboardingComponents5 advisorMarketplaceOnboardingComponents52;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(831135567);
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
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(advisorMarketplaceOnboardingComponents5 == null ? -1 : advisorMarketplaceOnboardingComponents5.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            final AdvisorMarketplaceOnboardingComponents5 advisorMarketplaceOnboardingComponents53 = i5 != 0 ? AdvisorMarketplaceOnboardingComponents5.BACK : advisorMarketplaceOnboardingComponents5;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(831135567, i3, -1, "com.robinhood.android.advisor.marketplace.onboarding.BackHandlingScaffold (AdvisorMarketplaceOnboardingComponents.kt:22)");
            }
            OnBackPressedDispatcherOwner current = BackHandler5.INSTANCE.getCurrent(composerStartRestartGroup, BackHandler5.$stable);
            final OnBackPressedDispatcher onBackPressedDispatcher = current != null ? current.getOnBackPressedDispatcher() : null;
            int i6 = (i3 & 14) | 48 | ((i3 << 21) & 1879048192);
            AdvisorMarketplaceOnboardingComponents5 advisorMarketplaceOnboardingComponents54 = advisorMarketplaceOnboardingComponents53;
            Modifier modifier5 = modifier4;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, ComposableLambda3.rememberComposableLambda(1530477835, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisor.marketplace.onboarding.AdvisorMarketplaceOnboardingComponentsKt.BackHandlingScaffold.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    if ((i7 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1530477835, i7, -1, "com.robinhood.android.advisor.marketplace.onboarding.BackHandlingScaffold.<anonymous> (AdvisorMarketplaceOnboardingComponents.kt:27)");
                    }
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(AdvisorMarketplaceOnboardingComponents2.INSTANCE.m1722xebf5b843(), null, ComposableLambda3.rememberComposableLambda(-283101974, true, new AnonymousClass1(advisorMarketplaceOnboardingComponents53, onBackPressedDispatcher), composer2, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2042);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: AdvisorMarketplaceOnboardingComponents.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.advisor.marketplace.onboarding.AdvisorMarketplaceOnboardingComponentsKt$BackHandlingScaffold$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                    final /* synthetic */ OnBackPressedDispatcher $backPressedDispatcher;
                    final /* synthetic */ AdvisorMarketplaceOnboardingComponents5 $iconStyle;

                    /* compiled from: AdvisorMarketplaceOnboardingComponents.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.android.advisor.marketplace.onboarding.AdvisorMarketplaceOnboardingComponentsKt$BackHandlingScaffold$1$1$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[AdvisorMarketplaceOnboardingComponents5.values().length];
                            try {
                                iArr[AdvisorMarketplaceOnboardingComponents5.BACK.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[AdvisorMarketplaceOnboardingComponents5.CLOSE.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    AnonymousClass1(AdvisorMarketplaceOnboardingComponents5 advisorMarketplaceOnboardingComponents5, OnBackPressedDispatcher onBackPressedDispatcher) {
                        this.$iconStyle = advisorMarketplaceOnboardingComponents5;
                        this.$backPressedDispatcher = onBackPressedDispatcher;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                        invoke(bentoAppBarScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                        int i2;
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i & 6) == 0) {
                            i2 = ((i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2) | i;
                        } else {
                            i2 = i;
                        }
                        if ((i2 & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-283101974, i2, -1, "com.robinhood.android.advisor.marketplace.onboarding.BackHandlingScaffold.<anonymous>.<anonymous> (AdvisorMarketplaceOnboardingComponents.kt:30)");
                        }
                        int i3 = WhenMappings.$EnumSwitchMapping$0[this.$iconStyle.ordinal()];
                        if (i3 == 1) {
                            composer.startReplaceGroup(1424962228);
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(this.$backPressedDispatcher);
                            final OnBackPressedDispatcher onBackPressedDispatcher = this.$backPressedDispatcher;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisor.marketplace.onboarding.AdvisorMarketplaceOnboardingComponentsKt$BackHandlingScaffold$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AdvisorMarketplaceOnboardingComponents.C85511.AnonymousClass1.invoke$lambda$1$lambda$0(onBackPressedDispatcher);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i2 << 12) & 57344), 7);
                            composer.endReplaceGroup();
                        } else {
                            if (i3 != 2) {
                                composer.startReplaceGroup(-1478055992);
                                composer.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer.startReplaceGroup(1425274770);
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer.changedInstance(this.$backPressedDispatcher);
                            final OnBackPressedDispatcher onBackPressedDispatcher2 = this.$backPressedDispatcher;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisor.marketplace.onboarding.AdvisorMarketplaceOnboardingComponentsKt$BackHandlingScaffold$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AdvisorMarketplaceOnboardingComponents.C85511.AnonymousClass1.invoke$lambda$3$lambda$2(onBackPressedDispatcher2);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, (Function0) objRememberedValue2, composer, (BentoAppBarScope.$stable << 12) | ((i2 << 12) & 57344), 7);
                            composer.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
                        if (onBackPressedDispatcher != null) {
                            onBackPressedDispatcher.onBackPressed();
                        }
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(OnBackPressedDispatcher onBackPressedDispatcher) {
                        if (onBackPressedDispatcher != null) {
                            onBackPressedDispatcher.onBackPressed();
                        }
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, content, composerStartRestartGroup, i6, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
            advisorMarketplaceOnboardingComponents52 = advisorMarketplaceOnboardingComponents54;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            advisorMarketplaceOnboardingComponents52 = advisorMarketplaceOnboardingComponents5;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisor.marketplace.onboarding.AdvisorMarketplaceOnboardingComponentsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvisorMarketplaceOnboardingComponents.BackHandlingScaffold$lambda$0(modifier3, advisorMarketplaceOnboardingComponents52, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AdvisorMarketplacePlaceholderScreen(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-890745987);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-890745987, i3, -1, "com.robinhood.android.advisor.marketplace.onboarding.AdvisorMarketplacePlaceholderScreen (AdvisorMarketplaceOnboardingComponents.kt:57)");
            }
            BackHandlingScaffold(modifier2, null, AdvisorMarketplaceOnboardingComponents2.INSTANCE.m1721xa3e03951(), composerStartRestartGroup, (i3 & 14) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisor.marketplace.onboarding.AdvisorMarketplaceOnboardingComponentsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvisorMarketplaceOnboardingComponents.AdvisorMarketplacePlaceholderScreen$lambda$1(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
