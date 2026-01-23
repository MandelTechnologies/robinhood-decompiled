package com.robinhood.curatedproductdiscovery.p291ui;

import android.content.res.Configuration;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.CardKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.SingletonAsyncImagePainter;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals3;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.InfoTagsKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.DefaultScreenMargins;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.util.AnnotatedStringResource;
import com.robinhood.curatedproductdiscovery.C33034R;
import com.robinhood.referral.SingularAttributionManager;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NewProductsLandingFragment.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aC\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0003¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000b\u001a3\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0010\u001a\u001f\u0010\u0011\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0012\u001a!\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0003¢\u0006\u0002\u0010\u0015\u001a\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u001a\u001a\f\u0010\u001b\u001a\u00020\u001c*\u00020\u001dH\u0002¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020\u0018X\u008a\u0084\u0002"}, m3636d2 = {"NewProductsLandingContent", "", "products", "", "Lcom/robinhood/curatedproductdiscovery/ui/NewProductCardData;", "onDeeplinkClick", "Lkotlin/Function1;", "", "onDisclosureClick", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "NewProductLandingTitle", "(Landroidx/compose/runtime/Composer;I)V", "NewProductCard", SingularAttributionManager.PRODUCT_PARAM_KEY, "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/curatedproductdiscovery/ui/NewProductCardData;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "NewProductCardInfo", "(Lcom/robinhood/curatedproductdiscovery/ui/NewProductCardData;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "NewProductsLandingDisclosure", "onClick", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "cardBackgroundColor", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "(Lcom/robinhood/curatedproductdiscovery/ui/NewProductCardData;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "isSmallScreen", "", "Landroid/content/res/Configuration;", "feature-curated-product-discovery_externalDebug", "backgroundColor"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class NewProductsLandingFragmentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewProductCard$lambda$9(NewProductCardData newProductCardData, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        NewProductCard(newProductCardData, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewProductCardInfo$lambda$12(NewProductCardData newProductCardData, Modifier modifier, int i, int i2, Composer composer, int i3) {
        NewProductCardInfo(newProductCardData, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewProductLandingTitle$lambda$4(int i, Composer composer, int i2) {
        NewProductLandingTitle(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewProductsLandingContent$lambda$3(List list, Function1 function1, Function1 function12, int i, Composer composer, int i2) {
        NewProductsLandingContent(list, function1, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewProductsLandingDisclosure$lambda$13(Function1 function1, int i, Composer composer, int i2) {
        NewProductsLandingDisclosure(function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static final long NewProductCard$lambda$5(SnapshotState4<Color> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NewProductsLandingContent(final List<NewProductCardData> list, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function12, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1767800451);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1767800451, i3, -1, "com.robinhood.curatedproductdiscovery.ui.NewProductsLandingContent (NewProductsLandingFragment.kt:136)");
            }
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            DefaultScreenMargins defaultScreenMargins = DefaultScreenMargins.INSTANCE;
            Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(modifierFillMaxSize$default, defaultScreenMargins.m21613getTopD9Ej5fM(), defaultScreenMargins.m21612getBottomD9Ej5fM(), composerStartRestartGroup, 6, 0);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list) | ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.curatedproductdiscovery.ui.NewProductsLandingFragmentKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return NewProductsLandingFragmentKt.NewProductsLandingContent$lambda$2$lambda$1(list, function1, function12, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup = composerStartRestartGroup;
            LazyDslKt.LazyColumn(modifierM21622defaultHorizontalPaddingWMci_g0, lazyListStateRememberLazyListState, null, false, horizontalOrVerticalM5089spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, 492);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.curatedproductdiscovery.ui.NewProductsLandingFragmentKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NewProductsLandingFragmentKt.NewProductsLandingContent$lambda$3(list, function1, function12, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewProductsLandingContent$lambda$2$lambda$1(final List list, final Function1 function1, final Function1 function12, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$NewProductsLandingFragmentKt.INSTANCE.m2595xc0edbae1(), 3, null);
        LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.curatedproductdiscovery.ui.NewProductsLandingFragmentKt$NewProductsLandingContent$lambda$2$lambda$1$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                list.get(i);
                return null;
            }
        }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.curatedproductdiscovery.ui.NewProductsLandingFragmentKt$NewProductsLandingContent$lambda$2$lambda$1$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                final NewProductCardData newProductCardData = (NewProductCardData) list.get(i);
                composer.startReplaceGroup(271051183);
                if (newProductCardData.getDeeplink() != null) {
                    composer.startReplaceGroup(271072107);
                    Component component = new Component(Component.ComponentType.NEW_PRODUCT_CARD, newProductCardData.getIdentifier(), null, 4, null);
                    Context eventContext = AutoLoggingCompositionLocals3.INSTANCE.getEventContext(composer, AutoLoggingCompositionLocals3.$stable);
                    UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, null, null, Context.copy$default(eventContext == null ? new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16383, null) : eventContext, i + 1, list.size(), 0, null, null, null, newProductCardData.getDeeplink(), null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -68, -1, -1, -1, -1, -1, 16383, null), component, null, 39, null);
                    final Function1 function13 = function1;
                    AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(-1890750889, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.curatedproductdiscovery.ui.NewProductsLandingFragmentKt$NewProductsLandingContent$1$1$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i4) {
                            if ((i4 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1890750889, i4, -1, "com.robinhood.curatedproductdiscovery.ui.NewProductsLandingContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewProductsLandingFragment.kt:163)");
                            }
                            NewProductsLandingFragmentKt.NewProductCard(newProductCardData, function13, ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, null, true, false, false, true, false, null, 109, null), composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54), composer, 48);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(271980469);
                    NewProductsLandingFragmentKt.NewProductCard(newProductCardData, function1, null, composer, 0, 4);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-831030129, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.curatedproductdiscovery.ui.NewProductsLandingFragmentKt$NewProductsLandingContent$1$1$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-831030129, i, -1, "com.robinhood.curatedproductdiscovery.ui.NewProductsLandingContent.<anonymous>.<anonymous>.<anonymous> (NewProductsLandingFragment.kt:176)");
                }
                NewProductsLandingFragmentKt.NewProductsLandingDisclosure(function12, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NewProductLandingTitle(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(446886241);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(446886241, i, -1, "com.robinhood.curatedproductdiscovery.ui.NewProductLandingTitle (NewProductsLandingFragment.kt:182)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C33034R.string.new_products_landing_title, composerStartRestartGroup, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(strStringResource, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.8f), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i2).m21593getSmallD9Ej5fM(), 7, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i2).getDisplayCapsuleLarge(), composer2, 0, 0, 8124);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.curatedproductdiscovery.ui.NewProductsLandingFragmentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NewProductsLandingFragmentKt.NewProductLandingTitle$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NewProductCard(final NewProductCardData newProductCardData, final Function1<? super String, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(719956825);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(newProductCardData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
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
                    ComposerKt.traceEventStart(719956825, i3, -1, "com.robinhood.curatedproductdiscovery.ui.NewProductCard (NewProductsLandingFragment.kt:196)");
                }
                int i5 = i3 & 14;
                SnapshotState4<Color> snapshotState4CardBackgroundColor = cardBackgroundColor(newProductCardData, composerStartRestartGroup, i5);
                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
                long jNewProductCard$lambda$5 = NewProductCard$lambda$5(snapshotState4CardBackgroundColor);
                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8));
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                z = (i5 != 4) | ((i3 & 112) != 32);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.curatedproductdiscovery.ui.NewProductsLandingFragmentKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NewProductsLandingFragmentKt.NewProductCard$lambda$8$lambda$7(newProductCardData, function1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifier4, false, null, null, (Function0) objRememberedValue, 7, null);
                modifier3 = modifier4;
                CardKt.m5548CardFjzlyU(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifierM4893clickableXHw0xAI$default, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(C33034R.dimen.new_product_card_height, composerStartRestartGroup, 0)), roundedCornerShapeM5327RoundedCornerShape0680j_4, jNewProductCard$lambda$5, 0L, null, fM7995constructorimpl, ComposableLambda3.rememberComposableLambda(-275572932, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.curatedproductdiscovery.ui.NewProductsLandingFragmentKt.NewProductCard.2
                    public final void invoke(Composer composer2, int i6) {
                        BoxScopeInstance boxScopeInstance;
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-275572932, i6, -1, "com.robinhood.curatedproductdiscovery.ui.NewProductCard.<anonymous> (NewProductsLandingFragment.kt:207)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                        NewProductCardData newProductCardData2 = newProductCardData;
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        Modifier modifierAlign = boxScopeInstance2.align(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), companion2.getTopStart());
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        NewProductsLandingFragmentKt.NewProductCardInfo(newProductCardData2, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierAlign, bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), C2002Dp.m7995constructorimpl(PrimitiveResources_androidKt.dimensionResource(C33034R.dimen.new_product_card_illustration_width, composer2, 0) + PrimitiveResources_androidKt.dimensionResource(C13997R.dimen.rds_spacing_default, composer2, 0)), 0.0f, 8, null), composer2, 0, 0);
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.ARROW_RIGHT_24), StringResources_androidKt.stringResource(C33034R.string.right_arrow_content_description, composer2, 0), bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(boxScopeInstance2.align(companion, companion2.getBottomStart()), bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), 6, null), null, false, composer2, BentoIcon4.Size24.$stable, 48);
                        composer2.startReplaceGroup(783804458);
                        if (newProductCardData2.isEnabled()) {
                            boxScopeInstance = boxScopeInstance2;
                            InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(StringResources_androidKt.stringResource(C33034R.string.new_products_info_tag_enabled, composer2, 0), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(boxScopeInstance2.align(companion, companion2.getTopEnd()), 0.0f, PrimitiveResources_androidKt.dimensionResource(C33034R.dimen.new_product_card_info_tag_padding, composer2, 0), PrimitiveResources_androidKt.dimensionResource(C33034R.dimen.new_product_card_info_tag_padding, composer2, 0), 0.0f, 9, null), Integer.valueOf(ServerToBentoAssetMapper2.CHECKMARK_16.getResourceId()), null, StringResources_androidKt.stringResource(C33034R.string.new_products_info_tag_enabled, composer2, 0), false, null, null, composer2, 12582912, 104);
                        } else {
                            boxScopeInstance = boxScopeInstance2;
                        }
                        composer2.endReplaceGroup();
                        float f = 0;
                        ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(newProductCardData2.getIllustration()), null, null, null, 0, null, composer2, 0, 62), StringResources_androidKt.stringResource(C33034R.string.card_illustration_content_description, composer2, 0), boxScopeInstance.align(SizeKt.m5157heightInVpY3zN4(SizeKt.m5175widthInVpY3zN4(companion, C2002Dp.m7995constructorimpl(f), PrimitiveResources_androidKt.dimensionResource(C33034R.dimen.new_product_card_illustration_width, composer2, 0)), C2002Dp.m7995constructorimpl(f), PrimitiveResources_androidKt.dimensionResource(C33034R.dimen.new_product_card_height, composer2, 0)), companion2.getBottomEnd()), companion2.getBottomCenter(), ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer2, 27648, 96);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 1769472, 24);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.curatedproductdiscovery.ui.NewProductsLandingFragmentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return NewProductsLandingFragmentKt.NewProductCard$lambda$9(newProductCardData, function1, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            int i52 = i3 & 14;
            SnapshotState4<Color> snapshotState4CardBackgroundColor2 = cardBackgroundColor(newProductCardData, composerStartRestartGroup, i52);
            float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(0);
            long jNewProductCard$lambda$52 = NewProductCard$lambda$5(snapshotState4CardBackgroundColor2);
            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_42 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8));
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            z = (i52 != 4) | ((i3 & 112) != 32);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = new Function0() { // from class: com.robinhood.curatedproductdiscovery.ui.NewProductsLandingFragmentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NewProductsLandingFragmentKt.NewProductCard$lambda$8$lambda$7(newProductCardData, function1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifier4, false, null, null, (Function0) objRememberedValue, 7, null);
                modifier3 = modifier4;
                CardKt.m5548CardFjzlyU(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifierM4893clickableXHw0xAI$default2, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(C33034R.dimen.new_product_card_height, composerStartRestartGroup, 0)), roundedCornerShapeM5327RoundedCornerShape0680j_42, jNewProductCard$lambda$52, 0L, null, fM7995constructorimpl2, ComposableLambda3.rememberComposableLambda(-275572932, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.curatedproductdiscovery.ui.NewProductsLandingFragmentKt.NewProductCard.2
                    public final void invoke(Composer composer2, int i6) {
                        BoxScopeInstance boxScopeInstance;
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-275572932, i6, -1, "com.robinhood.curatedproductdiscovery.ui.NewProductCard.<anonymous> (NewProductsLandingFragment.kt:207)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                        NewProductCardData newProductCardData2 = newProductCardData;
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        Modifier modifierAlign = boxScopeInstance2.align(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), companion2.getTopStart());
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        NewProductsLandingFragmentKt.NewProductCardInfo(newProductCardData2, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierAlign, bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), C2002Dp.m7995constructorimpl(PrimitiveResources_androidKt.dimensionResource(C33034R.dimen.new_product_card_illustration_width, composer2, 0) + PrimitiveResources_androidKt.dimensionResource(C13997R.dimen.rds_spacing_default, composer2, 0)), 0.0f, 8, null), composer2, 0, 0);
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.ARROW_RIGHT_24), StringResources_androidKt.stringResource(C33034R.string.right_arrow_content_description, composer2, 0), bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(boxScopeInstance2.align(companion, companion2.getBottomStart()), bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), 6, null), null, false, composer2, BentoIcon4.Size24.$stable, 48);
                        composer2.startReplaceGroup(783804458);
                        if (newProductCardData2.isEnabled()) {
                            boxScopeInstance = boxScopeInstance2;
                            InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(StringResources_androidKt.stringResource(C33034R.string.new_products_info_tag_enabled, composer2, 0), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(boxScopeInstance2.align(companion, companion2.getTopEnd()), 0.0f, PrimitiveResources_androidKt.dimensionResource(C33034R.dimen.new_product_card_info_tag_padding, composer2, 0), PrimitiveResources_androidKt.dimensionResource(C33034R.dimen.new_product_card_info_tag_padding, composer2, 0), 0.0f, 9, null), Integer.valueOf(ServerToBentoAssetMapper2.CHECKMARK_16.getResourceId()), null, StringResources_androidKt.stringResource(C33034R.string.new_products_info_tag_enabled, composer2, 0), false, null, null, composer2, 12582912, 104);
                        } else {
                            boxScopeInstance = boxScopeInstance2;
                        }
                        composer2.endReplaceGroup();
                        float f = 0;
                        ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(newProductCardData2.getIllustration()), null, null, null, 0, null, composer2, 0, 62), StringResources_androidKt.stringResource(C33034R.string.card_illustration_content_description, composer2, 0), boxScopeInstance.align(SizeKt.m5157heightInVpY3zN4(SizeKt.m5175widthInVpY3zN4(companion, C2002Dp.m7995constructorimpl(f), PrimitiveResources_androidKt.dimensionResource(C33034R.dimen.new_product_card_illustration_width, composer2, 0)), C2002Dp.m7995constructorimpl(f), PrimitiveResources_androidKt.dimensionResource(C33034R.dimen.new_product_card_height, composer2, 0)), companion2.getBottomEnd()), companion2.getBottomCenter(), ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer2, 27648, 96);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 1769472, 24);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewProductCard$lambda$8$lambda$7(NewProductCardData newProductCardData, Function1 function1) {
        String deeplink = newProductCardData.getDeeplink();
        if (deeplink != null) {
            function1.invoke(deeplink);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NewProductCardInfo(final NewProductCardData newProductCardData, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        TextStyle textM;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        String strStringResource;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1048901630);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(newProductCardData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            } else {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1048901630, i3, -1, "com.robinhood.curatedproductdiscovery.ui.NewProductCardInfo (NewProductsLandingFragment.kt:265)");
                }
                if (!isSmallScreen((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration()))) {
                    composerStartRestartGroup.startReplaceGroup(1941564793);
                    textM = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextS();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1941613401);
                    textM = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextM();
                    composerStartRestartGroup.endReplaceGroup();
                }
                Arrangement arrangement = Arrangement.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                float fM21595getXsmallD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.m5091spacedByD5KLDUw(fM21595getXsmallD9Ej5fM, companion.getTop()), companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                String strStringResource2 = StringResources_androidKt.stringResource(newProductCardData.getTitle(), composerStartRestartGroup, 0);
                TextStyle displayCapsuleSmall = bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleSmall();
                TextAlign.Companion companion3 = TextAlign.INSTANCE;
                Modifier modifier4 = modifier3;
                TextStyle textStyle = textM;
                BentoText2.m20747BentoText38GnDrw(strStringResource2, null, null, null, null, null, TextAlign.m7912boximpl(companion3.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall, composerStartRestartGroup, 0, 0, 8126);
                String descriptionArgs = newProductCardData.getDescriptionArgs();
                composerStartRestartGroup.startReplaceGroup(-152333375);
                strStringResource = descriptionArgs != null ? null : StringResources_androidKt.stringResource(newProductCardData.getDescription(), new Object[]{descriptionArgs}, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-152334111);
                if (strStringResource == null) {
                    strStringResource = StringResources_androidKt.stringResource(newProductCardData.getDescription(), composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, null, null, TextAlign.m7912boximpl(companion3.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, textStyle, composer2, 0, 0, 8126);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.curatedproductdiscovery.ui.NewProductsLandingFragmentKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return NewProductsLandingFragmentKt.NewProductCardInfo$lambda$12(newProductCardData, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) != 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!isSmallScreen((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration()))) {
            }
            Arrangement arrangement2 = Arrangement.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            float fM21595getXsmallD9Ej5fM2 = bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21595getXsmallD9Ej5fM();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.m5091spacedByD5KLDUw(fM21595getXsmallD9Ej5fM2, companion4.getTop()), companion4.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                String strStringResource22 = StringResources_androidKt.stringResource(newProductCardData.getTitle(), composerStartRestartGroup, 0);
                TextStyle displayCapsuleSmall2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleSmall();
                TextAlign.Companion companion32 = TextAlign.INSTANCE;
                Modifier modifier42 = modifier3;
                TextStyle textStyle2 = textM;
                BentoText2.m20747BentoText38GnDrw(strStringResource22, null, null, null, null, null, TextAlign.m7912boximpl(companion32.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall2, composerStartRestartGroup, 0, 0, 8126);
                String descriptionArgs2 = newProductCardData.getDescriptionArgs();
                composerStartRestartGroup.startReplaceGroup(-152333375);
                if (descriptionArgs2 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-152334111);
                if (strStringResource == null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, null, null, TextAlign.m7912boximpl(companion32.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, textStyle2, composer2, 0, 0, 8126);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NewProductsLandingDisclosure(final Function1<? super String, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1696181260);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1696181260, i2, -1, "com.robinhood.curatedproductdiscovery.ui.NewProductsLandingDisclosure (NewProductsLandingFragment.kt:295)");
            }
            final AnnotatedString annotatedStringM22062annotatedStringResourceV2eopBjH0 = AnnotatedStringResource.m22062annotatedStringResourceV2eopBjH0(C33034R.string.new_products_landing_disclosure, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU(), 0L, (LinkInteractionListener) null, composerStartRestartGroup, 0, 12);
            CompositionLocal3.CompositionLocalProvider(CompositionLocalsKt.getLocalUriHandler().provides(new UriHandler() { // from class: com.robinhood.curatedproductdiscovery.ui.NewProductsLandingFragmentKt$NewProductsLandingDisclosure$uriHandler$1
                @Override // androidx.compose.p011ui.platform.UriHandler
                public void openUri(String uri) {
                    Intrinsics.checkNotNullParameter(uri, "uri");
                    function1.invoke(uri);
                }
            }), ComposableLambda3.rememberComposableLambda(-76541748, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.curatedproductdiscovery.ui.NewProductsLandingFragmentKt.NewProductsLandingDisclosure.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-76541748, i3, -1, "com.robinhood.curatedproductdiscovery.ui.NewProductsLandingDisclosure.<anonymous> (NewProductsLandingFragment.kt:306)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    TextStyle textS = bentoTheme.getTypography(composer2, i4).getTextS();
                    BentoText2.m20748BentoTextQnj7Zds(annotatedStringM22062annotatedStringResourceV2eopBjH0, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, bentoTheme.getSpacing(composer2, i4).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, null, textS, composer2, 0, 0, 8188);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.curatedproductdiscovery.ui.NewProductsLandingFragmentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NewProductsLandingFragmentKt.NewProductsLandingDisclosure$lambda$13(function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final SnapshotState4<Color> cardBackgroundColor(final NewProductCardData newProductCardData, Composer composer, int i) {
        composer.startReplaceGroup(1181570656);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1181570656, i, -1, "com.robinhood.curatedproductdiscovery.ui.cardBackgroundColor (NewProductsLandingFragment.kt:315)");
        }
        final boolean isDay = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getIsDay();
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = ((((i & 14) ^ 6) > 4 && composer.changed(newProductCardData)) || (i & 6) == 4) | composer.changed(isDay);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<Color>() { // from class: com.robinhood.curatedproductdiscovery.ui.NewProductsLandingFragmentKt$cardBackgroundColor$1$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Color invoke() {
                    return Color.m6701boximpl(m22256invoke0d7_KjU());
                }

                /* renamed from: invoke-0d7_KjU, reason: not valid java name */
                public final long m22256invoke0d7_KjU() {
                    return isDay ? newProductCardData.m22250getDayBackgroundColor0d7_KjU() : newProductCardData.m22251getNightBackgroundColor0d7_KjU();
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        SnapshotState4<Color> snapshotState4DerivedStateOf = SnapshotStateKt.derivedStateOf((Function0) objRememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return snapshotState4DerivedStateOf;
    }

    private static final boolean isSmallScreen(Configuration configuration) {
        return configuration.screenHeightDp < 700;
    }
}
