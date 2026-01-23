package com.robinhood.android.advisory.onboarding.portfolioreveal.infopages;

import advisory.portfolio_reveal.proto.p007v1.PortfolioRevealInfoPageDto;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.AdvisoryPortfolioRevealInfoPagesComposable;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoIconButton2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypes3;
import com.robinhood.rosetta.eventlogging.BrokerageAccountContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AdvisoryPortfolioRevealInfoPagesComposable.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aN\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u001d\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0003¢\u0006\u0004\b\f\u0010\r\u001a[\u0010\u0016\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00132\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0018\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c¨\u0006\u001e²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"", "activePageIndex", "Lkotlinx/collections/immutable/ImmutableList;", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealInfoPageDto;", "pages", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "", "Lkotlin/ExtensionFunctionType;", "content", "PortfolioRevealPageText", "(ILkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "progressBarSegments", "", "source", "Lcom/robinhood/models/api/BrokerageAccountType;", "brokerageAccountType", "Lkotlin/Function0;", "onCompleteInfoPages", "onBackClicked", "PortfolioRevealPages", "(Lkotlinx/collections/immutable/ImmutableList;ILjava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/unit/Dp;", "MaxImageSize", "F", "FooterContentMinHeight", "feature-advisory-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.AdvisoryPortfolioRevealInfoPagesComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisoryPortfolioRevealInfoPagesComposable {
    private static final float MaxImageSize = C2002Dp.m7995constructorimpl(400);
    private static final float FooterContentMinHeight = C2002Dp.m7995constructorimpl(200);

    /* JADX INFO: Access modifiers changed from: private */
    public static final int PortfolioRevealPageText$lambda$5$lambda$4$lambda$0(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int PortfolioRevealPageText$lambda$5$lambda$4$lambda$1(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int PortfolioRevealPageText$lambda$5$lambda$4$lambda$2(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int PortfolioRevealPageText$lambda$5$lambda$4$lambda$3(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioRevealPageText$lambda$6(int i, ImmutableList immutableList, Modifier modifier, Function4 function4, int i2, int i3, Composer composer, int i4) {
        PortfolioRevealPageText(i, immutableList, modifier, function4, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioRevealPages$lambda$11(ImmutableList immutableList, int i, String str, BrokerageAccountType brokerageAccountType, Function0 function0, Function0 function02, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        PortfolioRevealPages(immutableList, i, str, brokerageAccountType, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$12(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PortfolioRevealPageText(int i, final ImmutableList<PortfolioRevealInfoPageDto> immutableList, Modifier modifier, final Function4<? super AnimatedContentScope, ? super PortfolioRevealInfoPageDto, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i2, final int i3) {
        final int i4;
        int i5;
        Modifier modifier2;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-20232756);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            i4 = i;
        } else if ((i2 & 6) == 0) {
            i4 = i;
            i5 = (composerStartRestartGroup.changed(i4) ? 4 : 2) | i2;
        } else {
            i4 = i;
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(immutableList) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 == 0) {
            if ((i2 & 384) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= composerStartRestartGroup.changedInstance(function4) ? 2048 : 1024;
            }
            if ((i5 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                if (i6 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-20232756, i5, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.PortfolioRevealPageText (AdvisoryPortfolioRevealInfoPagesComposable.kt:63)");
                }
                Integer numValueOf = Integer.valueOf(i4);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.AdvisoryPortfolioRevealInfoPagesComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AdvisoryPortfolioRevealInfoPagesComposable.PortfolioRevealPageText$lambda$5$lambda$4((AnimatedContentTransitionScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                AnimatedContentKt.AnimatedContent(numValueOf, modifier2, (Function1) objRememberedValue, null, null, null, ComposableLambda3.rememberComposableLambda(-680551358, true, new Function4<AnimatedContentScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.AdvisoryPortfolioRevealInfoPagesComposableKt.PortfolioRevealPageText.2
                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Integer num, Composer composer2, Integer num2) {
                        invoke(animatedContentScope, num.intValue(), composer2, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedContentScope AnimatedContent, int i7, Composer composer2, int i8) {
                        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-680551358, i8, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.PortfolioRevealPageText.<anonymous> (AdvisoryPortfolioRevealInfoPagesComposable.kt:75)");
                        }
                        function4.invoke(AnimatedContent, immutableList.get(i7), composer2, Integer.valueOf(i8 & 14));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i5 & 14) | 1573248 | ((i5 >> 3) & 112), 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.AdvisoryPortfolioRevealInfoPagesComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AdvisoryPortfolioRevealInfoPagesComposable.PortfolioRevealPageText$lambda$6(i4, immutableList, modifier3, function4, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 384;
        modifier2 = modifier;
        if ((i3 & 8) == 0) {
        }
        if ((i5 & 1171) != 1170) {
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Integer numValueOf2 = Integer.valueOf(i4);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            AnimatedContentKt.AnimatedContent(numValueOf2, modifier2, (Function1) objRememberedValue, null, null, null, ComposableLambda3.rememberComposableLambda(-680551358, true, new Function4<AnimatedContentScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.AdvisoryPortfolioRevealInfoPagesComposableKt.PortfolioRevealPageText.2
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Integer num, Composer composer2, Integer num2) {
                    invoke(animatedContentScope, num.intValue(), composer2, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedContentScope AnimatedContent, int i7, Composer composer2, int i8) {
                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-680551358, i8, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.PortfolioRevealPageText.<anonymous> (AdvisoryPortfolioRevealInfoPagesComposable.kt:75)");
                    }
                    function4.invoke(AnimatedContent, immutableList.get(i7), composer2, Integer.valueOf(i8 & 14));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i5 & 14) | 1573248 | ((i5 >> 3) & 112), 56);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        final Modifier modifier32 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ContentTransform PortfolioRevealPageText$lambda$5$lambda$4(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        if (((Number) AnimatedContent.getTargetState()).intValue() > ((Number) AnimatedContent.getInitialState()).intValue()) {
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally$default(null, new Function1() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.AdvisoryPortfolioRevealInfoPagesComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(AdvisoryPortfolioRevealInfoPagesComposable.PortfolioRevealPageText$lambda$5$lambda$4$lambda$0(((Integer) obj).intValue()));
                }
            }, 1, null), EnterExitTransitionKt.slideOutHorizontally$default(null, new Function1() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.AdvisoryPortfolioRevealInfoPagesComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(AdvisoryPortfolioRevealInfoPagesComposable.PortfolioRevealPageText$lambda$5$lambda$4$lambda$1(((Integer) obj).intValue()));
                }
            }, 1, null));
        }
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally$default(null, new Function1() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.AdvisoryPortfolioRevealInfoPagesComposableKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(AdvisoryPortfolioRevealInfoPagesComposable.PortfolioRevealPageText$lambda$5$lambda$4$lambda$2(((Integer) obj).intValue()));
            }
        }, 1, null), EnterExitTransitionKt.slideOutHorizontally$default(null, new Function1() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.AdvisoryPortfolioRevealInfoPagesComposableKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(AdvisoryPortfolioRevealInfoPagesComposable.PortfolioRevealPageText$lambda$5$lambda$4$lambda$3(((Integer) obj).intValue()));
            }
        }, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int PortfolioRevealPages$lambda$9(SnapshotIntState2 snapshotIntState2) {
        return snapshotIntState2.getIntValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PortfolioRevealPages(final ImmutableList<PortfolioRevealInfoPageDto> pages, final int i, final String source, final BrokerageAccountType brokerageAccountType, final Function0<Unit> onCompleteInfoPages, final Function0<Unit> onBackClicked, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(onCompleteInfoPages, "onCompleteInfoPages");
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1960309769);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(pages) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(source) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(brokerageAccountType.ordinal()) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onCompleteInfoPages) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onBackClicked) ? 131072 : 65536;
        }
        int i6 = i3 & 64;
        if (i6 == 0) {
            if ((1572864 & i2) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            i5 = i4;
            if ((599187 & i5) == 599186 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1960309769, i5, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.PortfolioRevealPages (AdvisoryPortfolioRevealInfoPagesComposable.kt:89)");
                }
                Object[] objArr = {pages};
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.AdvisoryPortfolioRevealInfoPagesComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AdvisoryPortfolioRevealInfoPagesComposable.PortfolioRevealPages$lambda$8$lambda$7();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                Screen screen = new Screen(Screen.Name.ADVISORY_PORTFOLIO_REVEAL_INFO_PAGE, null, pages.get(snapshotIntState2.getIntValue()).getScreen_identifier(), null, 10, null);
                Context context = new Context(0, 0, 0, null, null, null, null, null, 0, null, source, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new BrokerageAccountContext(BrokerageAccountTypes3.toProtobuf(brokerageAccountType), null, null, null, false, false, null, null, null, null, 1022, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -257, -1, -1, 16383, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                modifier3 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier3, ComposableLambda3.rememberComposableLambda(2053109709, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.AdvisoryPortfolioRevealInfoPagesComposableKt.PortfolioRevealPages.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i8) {
                        if ((i8 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2053109709, i8, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.PortfolioRevealPages.<anonymous> (AdvisoryPortfolioRevealInfoPagesComposable.kt:107)");
                        }
                        Function2<Composer, Integer, Unit> function2M11105getLambda$20578822$feature_advisory_onboarding_externalDebug = AdvisoryPortfolioRevealInfoPagesComposable3.INSTANCE.m11105getLambda$20578822$feature_advisory_onboarding_externalDebug();
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-318587314, true, new AnonymousClass1(snapshotIntState2, onBackClicked), composer2, 54);
                        final int i9 = i;
                        final SnapshotIntState2 snapshotIntState22 = snapshotIntState2;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M11105getLambda$20578822$feature_advisory_onboarding_externalDebug, null, composableLambdaRememberComposableLambda, null, ComposableLambda3.rememberComposableLambda(-841742017, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.AdvisoryPortfolioRevealInfoPagesComposableKt.PortfolioRevealPages.1.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                                invoke(boxScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxScope BentoAppBar, Composer composer3, int i10) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i10 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-841742017, i10, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.PortfolioRevealPages.<anonymous>.<anonymous> (AdvisoryPortfolioRevealInfoPagesComposable.kt:121)");
                                }
                                BentoProgressBar2.m20699BentoProgressBarnBX6wN0(AdvisoryPortfolioRevealInfoPagesComposable.PortfolioRevealPages$lambda$9(snapshotIntState22), 0.2f, i9, null, 0L, 0L, false, composer3, 48, 120);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), false, false, null, null, 0L, null, composer2, 24966, 0, 2026);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: AdvisoryPortfolioRevealInfoPagesComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.AdvisoryPortfolioRevealInfoPagesComposableKt$PortfolioRevealPages$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                        final /* synthetic */ SnapshotIntState2 $activePageIndex$delegate;
                        final /* synthetic */ Function0<Unit> $onBackClicked;

                        AnonymousClass1(SnapshotIntState2 snapshotIntState2, Function0<Unit> function0) {
                            this.$activePageIndex$delegate = snapshotIntState2;
                            this.$onBackClicked = function0;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                            invoke(bentoAppBarScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i & 6) == 0) {
                                i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-318587314, i, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.PortfolioRevealPages.<anonymous>.<anonymous> (AdvisoryPortfolioRevealInfoPagesComposable.kt:110)");
                            }
                            composer.startReplaceGroup(-1633490746);
                            boolean zChanged = composer.changed(this.$activePageIndex$delegate) | composer.changed(this.$onBackClicked);
                            final Function0<Unit> function0 = this.$onBackClicked;
                            final SnapshotIntState2 snapshotIntState2 = this.$activePageIndex$delegate;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.AdvisoryPortfolioRevealInfoPagesComposableKt$PortfolioRevealPages$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AdvisoryPortfolioRevealInfoPagesComposable.C90071.AnonymousClass1.invoke$lambda$1$lambda$0(function0, snapshotIntState2);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(Function0 function0, SnapshotIntState2 snapshotIntState2) {
                            if (AdvisoryPortfolioRevealInfoPagesComposable.PortfolioRevealPages$lambda$9(snapshotIntState2) > 0) {
                                AdvisoryPortfolioRevealInfoPagesComposable.PortfolioRevealPages$lambda$10(snapshotIntState2, AdvisoryPortfolioRevealInfoPagesComposable.PortfolioRevealPages$lambda$9(snapshotIntState2) - 1);
                            } else {
                                function0.invoke();
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, bentoTheme.getColors(composerStartRestartGroup, i7).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(1718455256, true, new C90082(pages, screen, context, snapshotIntState2, onCompleteInfoPages), composerStartRestartGroup, 54), composerStartRestartGroup, ((i5 >> 18) & 14) | 805306416, 316);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.AdvisoryPortfolioRevealInfoPagesComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AdvisoryPortfolioRevealInfoPagesComposable.PortfolioRevealPages$lambda$11(pages, i, source, brokerageAccountType, onCompleteInfoPages, onBackClicked, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 1572864;
        modifier2 = modifier;
        i5 = i4;
        if ((599187 & i5) == 599186) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Object[] objArr2 = {pages};
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            Screen screen2 = new Screen(Screen.Name.ADVISORY_PORTFOLIO_REVEAL_INFO_PAGE, null, pages.get(snapshotIntState22.getIntValue()).getScreen_identifier(), null, 10, null);
            Context context2 = new Context(0, 0, 0, null, null, null, null, null, 0, null, source, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new BrokerageAccountContext(BrokerageAccountTypes3.toProtobuf(brokerageAccountType), null, null, null, false, false, null, null, null, null, 1022, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -257, -1, -1, 16383, null);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i72 = BentoTheme.$stable;
            modifier3 = modifier4;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier3, ComposableLambda3.rememberComposableLambda(2053109709, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.AdvisoryPortfolioRevealInfoPagesComposableKt.PortfolioRevealPages.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    if ((i8 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2053109709, i8, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.PortfolioRevealPages.<anonymous> (AdvisoryPortfolioRevealInfoPagesComposable.kt:107)");
                    }
                    Function2<Composer, Integer, Unit> function2M11105getLambda$20578822$feature_advisory_onboarding_externalDebug = AdvisoryPortfolioRevealInfoPagesComposable3.INSTANCE.m11105getLambda$20578822$feature_advisory_onboarding_externalDebug();
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-318587314, true, new AnonymousClass1(snapshotIntState22, onBackClicked), composer2, 54);
                    final int i9 = i;
                    final SnapshotIntState2 snapshotIntState222 = snapshotIntState22;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M11105getLambda$20578822$feature_advisory_onboarding_externalDebug, null, composableLambdaRememberComposableLambda, null, ComposableLambda3.rememberComposableLambda(-841742017, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.AdvisoryPortfolioRevealInfoPagesComposableKt.PortfolioRevealPages.1.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                            invoke(boxScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BoxScope BentoAppBar, Composer composer3, int i10) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i10 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-841742017, i10, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.PortfolioRevealPages.<anonymous>.<anonymous> (AdvisoryPortfolioRevealInfoPagesComposable.kt:121)");
                            }
                            BentoProgressBar2.m20699BentoProgressBarnBX6wN0(AdvisoryPortfolioRevealInfoPagesComposable.PortfolioRevealPages$lambda$9(snapshotIntState222), 0.2f, i9, null, 0L, 0L, false, composer3, 48, 120);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), false, false, null, null, 0L, null, composer2, 24966, 0, 2026);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: AdvisoryPortfolioRevealInfoPagesComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.AdvisoryPortfolioRevealInfoPagesComposableKt$PortfolioRevealPages$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                    final /* synthetic */ SnapshotIntState2 $activePageIndex$delegate;
                    final /* synthetic */ Function0<Unit> $onBackClicked;

                    AnonymousClass1(SnapshotIntState2 snapshotIntState2, Function0<Unit> function0) {
                        this.$activePageIndex$delegate = snapshotIntState2;
                        this.$onBackClicked = function0;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                        invoke(bentoAppBarScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i & 6) == 0) {
                            i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                        }
                        if ((i & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-318587314, i, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.PortfolioRevealPages.<anonymous>.<anonymous> (AdvisoryPortfolioRevealInfoPagesComposable.kt:110)");
                        }
                        composer.startReplaceGroup(-1633490746);
                        boolean zChanged = composer.changed(this.$activePageIndex$delegate) | composer.changed(this.$onBackClicked);
                        final Function0 function0 = this.$onBackClicked;
                        final SnapshotIntState2 snapshotIntState2 = this.$activePageIndex$delegate;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.AdvisoryPortfolioRevealInfoPagesComposableKt$PortfolioRevealPages$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AdvisoryPortfolioRevealInfoPagesComposable.C90071.AnonymousClass1.invoke$lambda$1$lambda$0(function0, snapshotIntState2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(Function0 function0, SnapshotIntState2 snapshotIntState2) {
                        if (AdvisoryPortfolioRevealInfoPagesComposable.PortfolioRevealPages$lambda$9(snapshotIntState2) > 0) {
                            AdvisoryPortfolioRevealInfoPagesComposable.PortfolioRevealPages$lambda$10(snapshotIntState2, AdvisoryPortfolioRevealInfoPagesComposable.PortfolioRevealPages$lambda$9(snapshotIntState2) - 1);
                        } else {
                            function0.invoke();
                        }
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, bentoTheme2.getColors(composerStartRestartGroup, i72).m21371getBg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i72).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(1718455256, true, new C90082(pages, screen2, context2, snapshotIntState22, onCompleteInfoPages), composerStartRestartGroup, 54), composerStartRestartGroup, ((i5 >> 18) & 14) | 805306416, 316);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotIntState2 PortfolioRevealPages$lambda$8$lambda$7() {
        return SnapshotIntState3.mutableIntStateOf(0);
    }

    /* compiled from: AdvisoryPortfolioRevealInfoPagesComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.AdvisoryPortfolioRevealInfoPagesComposableKt$PortfolioRevealPages$2 */
    static final class C90082 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotIntState2 $activePageIndex$delegate;
        final /* synthetic */ Context $eventContext;
        final /* synthetic */ Function0<Unit> $onCompleteInfoPages;
        final /* synthetic */ ImmutableList<PortfolioRevealInfoPageDto> $pages;
        final /* synthetic */ Screen $screen;

        C90082(ImmutableList<PortfolioRevealInfoPageDto> immutableList, Screen screen, Context context, SnapshotIntState2 snapshotIntState2, Function0<Unit> function0) {
            this.$pages = immutableList;
            this.$screen = screen;
            this.$eventContext = context;
            this.$activePageIndex$delegate = snapshotIntState2;
            this.$onCompleteInfoPages = function0;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1718455256, i2, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.PortfolioRevealPages.<anonymous> (AdvisoryPortfolioRevealInfoPagesComposable.kt:130)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierPadding = PaddingKt.padding(companion, paddingValues);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            final ImmutableList<PortfolioRevealInfoPageDto> immutableList = this.$pages;
            final Screen screen = this.$screen;
            final Context context = this.$eventContext;
            final SnapshotIntState2 snapshotIntState2 = this.$activePageIndex$delegate;
            final Function0<Unit> function0 = this.$onCompleteInfoPages;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            int iPortfolioRevealPages$lambda$9 = AdvisoryPortfolioRevealInfoPagesComposable.PortfolioRevealPages$lambda$9(snapshotIntState2);
            AdvisoryPortfolioRevealInfoPagesComposable3 advisoryPortfolioRevealInfoPagesComposable3 = AdvisoryPortfolioRevealInfoPagesComposable3.INSTANCE;
            AdvisoryPortfolioRevealInfoPagesComposable.PortfolioRevealPageText(iPortfolioRevealPages$lambda$9, immutableList, null, advisoryPortfolioRevealInfoPagesComposable3.getLambda$2112676670$feature_advisory_onboarding_externalDebug(), composer, 3072, 4);
            Modifier modifierM5173sizeInqDBjuR0$default = SizeKt.m5173sizeInqDBjuR0$default(Column5.weight$default(column6, companion, 1.0f, false, 2, null), 0.0f, 0.0f, 0.0f, AdvisoryPortfolioRevealInfoPagesComposable.MaxImageSize, 7, null);
            Integer numValueOf = Integer.valueOf(AdvisoryPortfolioRevealInfoPagesComposable.PortfolioRevealPages$lambda$9(snapshotIntState2));
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue == companion3.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.AdvisoryPortfolioRevealInfoPagesComposableKt$PortfolioRevealPages$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AdvisoryPortfolioRevealInfoPagesComposable.C90082.invoke$lambda$4$lambda$1$lambda$0((AnimatedContentTransitionScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            AnimatedContentKt.AnimatedContent(numValueOf, modifierM5173sizeInqDBjuR0$default, (Function1) objRememberedValue, null, null, null, ComposableLambda3.rememberComposableLambda(1998458008, true, new Function4<AnimatedContentScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.AdvisoryPortfolioRevealInfoPagesComposableKt$PortfolioRevealPages$2$1$2
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Integer num, Composer composer2, Integer num2) {
                    invoke(animatedContentScope, num.intValue(), composer2, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedContentScope AnimatedContent, int i3, Composer composer2, int i4) {
                    String image_dark_url;
                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1998458008, i4, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.PortfolioRevealPages.<anonymous>.<anonymous>.<anonymous> (AdvisoryPortfolioRevealInfoPagesComposable.kt:157)");
                    }
                    PortfolioRevealInfoPageDto portfolioRevealInfoPageDto = immutableList.get(i3);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierLogScreenTransitions = ModifiersKt.logScreenTransitions(companion4, new UserInteractionEventDescriptor(null, screen, null, context, null, null, 53, null));
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierLogScreenTransitions, bentoTheme.getSpacing(composer2, i5).m21594getXlargeD9Ej5fM(), 0.0f, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM5144paddingVpY3zN4$default);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                    if (bentoTheme.getColors(composer2, i5).getIsDay()) {
                        image_dark_url = portfolioRevealInfoPageDto.getImage_light_url();
                    } else {
                        image_dark_url = portfolioRevealInfoPageDto.getImage_dark_url();
                    }
                    ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(image_dark_url, null, null, null, 0, null, composer2, 0, 62), (String) null, modifierFillMaxWidth$default, (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composer2, 25008, 104);
                    BentoText2.m20747BentoText38GnDrw(portfolioRevealInfoPageDto.getAsset_text(), null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextS(), composer2, 0, 0, 8126);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 1573248, 56);
            AdvisoryPortfolioRevealInfoPagesComposable.PortfolioRevealPageText(AdvisoryPortfolioRevealInfoPagesComposable.PortfolioRevealPages$lambda$9(snapshotIntState2), immutableList, SizeKt.m5158heightInVpY3zN4$default(companion, AdvisoryPortfolioRevealInfoPagesComposable.FooterContentMinHeight, 0.0f, 2, null), advisoryPortfolioRevealInfoPagesComposable3.getLambda$957638631$feature_advisory_onboarding_externalDebug(), composer, 3456, 0);
            immutableList.get(AdvisoryPortfolioRevealInfoPagesComposable.PortfolioRevealPages$lambda$9(snapshotIntState2));
            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(ModifiersKt.autoLogEvents$default(companion, new UserInteractionEventDescriptor(null, screen, null, context, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 37, null), true, false, false, true, false, null, 108, null), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
            BentoIconButton4.Icon.StandardSize16 standardSize16 = new BentoIconButton4.Icon.StandardSize16(ServerToBentoAssetMapper2.ARROW_RIGHT_16);
            composer.startReplaceGroup(-1746271574);
            boolean zChanged = composer.changed(snapshotIntState2) | composer.changedInstance(immutableList) | composer.changed(function0);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.AdvisoryPortfolioRevealInfoPagesComposableKt$PortfolioRevealPages$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AdvisoryPortfolioRevealInfoPagesComposable.C90082.invoke$lambda$4$lambda$3$lambda$2(immutableList, function0, snapshotIntState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoIconButton2.m20641BentoIconButtoncqYvz4g((Function0) objRememberedValue2, standardSize16, "Next", modifierM5142padding3ABfNKs, null, false, null, null, null, null, false, composer, (BentoIconButton4.Icon.StandardSize16.$stable << 3) | 384, 0, 2032);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ContentTransform invoke$lambda$4$lambda$1$lambda$0(AnimatedContentTransitionScope AnimatedContent) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2(ImmutableList immutableList, Function0 function0, SnapshotIntState2 snapshotIntState2) {
            if (AdvisoryPortfolioRevealInfoPagesComposable.PortfolioRevealPages$lambda$9(snapshotIntState2) < immutableList.size() - 1) {
                AdvisoryPortfolioRevealInfoPagesComposable.PortfolioRevealPages$lambda$10(snapshotIntState2, AdvisoryPortfolioRevealInfoPagesComposable.PortfolioRevealPages$lambda$9(snapshotIntState2) + 1);
            } else {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PortfolioRevealPages$lambda$10(SnapshotIntState2 snapshotIntState2, int i) {
        snapshotIntState2.setIntValue(i);
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-359791916);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-359791916, i, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.Preview (AdvisoryPortfolioRevealInfoPagesComposable.kt:252)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, Boolean.TRUE, null, null, AdvisoryPortfolioRevealInfoPagesComposable3.INSTANCE.m11104getLambda$1838912484$feature_advisory_onboarding_externalDebug(), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.AdvisoryPortfolioRevealInfoPagesComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvisoryPortfolioRevealInfoPagesComposable.Preview$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
