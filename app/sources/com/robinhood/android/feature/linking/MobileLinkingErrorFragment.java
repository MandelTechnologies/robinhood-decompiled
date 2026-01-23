package com.robinhood.android.feature.linking;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.linking.LinkingGroupColors2;
import com.robinhood.android.linking.MobileLinkingColorComposable3;
import com.robinhood.android.linking.MobileLinkingData2;
import com.robinhood.android.store.linking.LinkingGroup;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoImage;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.tradeladder.p398ui.ladder.GenericLadderTopBarKt;
import com.robinhood.shared.tradeladder.p398ui.ladder.extensions.StringResources5;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.LadderStyleKt;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.topbar.NavigationContent3;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.resource.StringResource;
import hippo.model.p469v1.LinkingGroupColorsDto;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;

/* compiled from: MobileLinkingErrorFragment.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0012\u001a\u00020\u0013H\u0017¢\u0006\u0002\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/feature/linking/MobileLinkingErrorFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "callbacks", "Lcom/robinhood/android/linking/MobileLinkingCallbacks;", "getCallbacks", "()Lcom/robinhood/android/linking/MobileLinkingCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "linkingGroupColorDto", "Lhippo/model/v1/LinkingGroupColorsDto;", "getLinkingGroupColorDto", "()Lhippo/model/v1/LinkingGroupColorsDto;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Args", "Companion", "feature-mobile-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MobileLinkingErrorFragment extends GenericComposeFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(MobileLinkingData2.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.feature.linking.MobileLinkingErrorFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof MobileLinkingData2) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MobileLinkingErrorFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/linking/MobileLinkingCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(MobileLinkingErrorFragment mobileLinkingErrorFragment, int i, Composer composer, int i2) {
        mobileLinkingErrorFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MobileLinkingData2 getCallbacks() {
        return (MobileLinkingData2) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinkingGroupColorsDto getLinkingGroupColorDto() {
        LinkingGroupColorsDto color;
        LinkingGroup linkingGroup = ((Args) INSTANCE.getArgs((Fragment) this)).getLinkingGroup();
        return (linkingGroup == null || (color = linkingGroup.getColor()) == null) ? LinkingGroupColorsDto.COLORS_EXTENDED_UNSPECIFIED : color;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1508924293);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1508924293, i2, -1, "com.robinhood.android.feature.linking.MobileLinkingErrorFragment.ComposeContent (MobileLinkingErrorFragment.kt:50)");
            }
            ScaffoldKt.m5939ScaffoldTvnljyQ(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ComposableLambda3.rememberComposableLambda(917482039, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.linking.MobileLinkingErrorFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(917482039, i3, -1, "com.robinhood.android.feature.linking.MobileLinkingErrorFragment.ComposeContent.<anonymous> (MobileLinkingErrorFragment.kt:55)");
                    }
                    final MobileLinkingErrorFragment mobileLinkingErrorFragment = MobileLinkingErrorFragment.this;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(776885291, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.linking.MobileLinkingErrorFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(776885291, i4, -1, "com.robinhood.android.feature.linking.MobileLinkingErrorFragment.ComposeContent.<anonymous>.<anonymous> (MobileLinkingErrorFragment.kt:57)");
                            }
                            Alignment.Companion companion = Alignment.INSTANCE;
                            Alignment.Vertical centerVertically = companion.getCenterVertically();
                            MobileLinkingErrorFragment mobileLinkingErrorFragment2 = mobileLinkingErrorFragment;
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Arrangement arrangement = Arrangement.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer3, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion2);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composer3, 48);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, companion2);
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                            MobileLinkingData2 callbacks = mobileLinkingErrorFragment2.getCallbacks();
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer3.changedInstance(callbacks);
                            Object objRememberedValue = composer3.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new MobileLinkingErrorFragment5(callbacks);
                                composer3.updateRememberedValue(objRememberedValue);
                            }
                            composer3.endReplaceGroup();
                            NavigationContent3.NavigationContent((Function0) ((KFunction) objRememberedValue), null, false, composer3, 0, 6);
                            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion2, C2002Dp.m7995constructorimpl(10)), composer3, 6);
                            long composeColor = LinkingGroupColors2.toComposeColor(mobileLinkingErrorFragment2.getLinkingGroupColorDto(), composer3, 0);
                            MobileLinkingData2 callbacks2 = mobileLinkingErrorFragment2.getCallbacks();
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer3.changedInstance(callbacks2);
                            Object objRememberedValue2 = composer3.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new MobileLinkingErrorFragment6(callbacks2);
                                composer3.updateRememberedValue(objRememberedValue2);
                            }
                            composer3.endReplaceGroup();
                            MobileLinkingColorComposable3.m16071MobileLinkingColorComposableKTwxG1Y(composeColor, ClickableKt.m4893clickableXHw0xAI$default(companion2, false, null, null, (Function0) ((KFunction) objRememberedValue2), 7, null), null, composer3, 0, 4);
                            composer3.endNode();
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                    MobileLinkingErrorFragment2 mobileLinkingErrorFragment2 = MobileLinkingErrorFragment2.INSTANCE;
                    GenericLadderTopBarKt.GenericLadderTopBar(composableLambdaRememberComposableLambda, mobileLinkingErrorFragment2.m14454getLambda$2008060180$feature_mobile_linking_externalDebug(), mobileLinkingErrorFragment2.m14455getLambda$498038355$feature_mobile_linking_externalDebug(), null, null, composer2, 438, 24);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1498983860, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.linking.MobileLinkingErrorFragment.ComposeContent.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                    invoke(paddingValues, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer2, int i3) {
                    int i4;
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i3 & 6) == 0) {
                        i4 = i3 | (composer2.changed(paddingValues) ? 4 : 2);
                    } else {
                        i4 = i3;
                    }
                    if ((i4 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1498983860, i4, -1, "com.robinhood.android.feature.linking.MobileLinkingErrorFragment.ComposeContent.<anonymous> (MobileLinkingErrorFragment.kt:77)");
                    }
                    Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize(Modifier.INSTANCE, 1.0f), paddingValues);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifierPadding, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM());
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    MobileLinkingErrorFragment mobileLinkingErrorFragment = MobileLinkingErrorFragment.this;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5142padding3ABfNKs);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoImage.BentoImage(PainterResources_androidKt.painterResource(C16754R.drawable.unsupported_symbol_icon, composer2, 0), null, null, null, null, 0.0f, null, composer2, 48, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                    Companion companion2 = MobileLinkingErrorFragment.INSTANCE;
                    StringResource title = ((Args) companion2.getArgs((Fragment) mobileLinkingErrorFragment)).getTitle();
                    int i6 = StringResource.$stable;
                    String text = StringResources5.getText(title, composer2, i6);
                    TextStyle textMBold = LadderStyleKt.getTextMBold(bentoTheme.getTypography(composer2, i5));
                    TextAlign.Companion companion3 = TextAlign.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(text, null, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textMBold, composer2, 0, 0, 8126);
                    BentoText2.m20747BentoText38GnDrw(StringResources5.getText(((Args) companion2.getArgs((Fragment) mobileLinkingErrorFragment)).getMessage(), composer2, i6), null, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextM(), composer2, 0, 0, 8126);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306422, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.linking.MobileLinkingErrorFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MobileLinkingErrorFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: MobileLinkingErrorFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\f\r\u000e\u000fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0004\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/feature/linking/MobileLinkingErrorFragment$Args;", "Landroid/os/Parcelable;", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "message", "getMessage", "linkingGroup", "Lcom/robinhood/android/store/linking/LinkingGroup;", "getLinkingGroup", "()Lcom/robinhood/android/store/linking/LinkingGroup;", "UnsupportedError", "NetworkError", "NoWidgetsError", "NoLinkedGroupError", "Lcom/robinhood/android/feature/linking/MobileLinkingErrorFragment$Args$NetworkError;", "Lcom/robinhood/android/feature/linking/MobileLinkingErrorFragment$Args$NoLinkedGroupError;", "Lcom/robinhood/android/feature/linking/MobileLinkingErrorFragment$Args$NoWidgetsError;", "Lcom/robinhood/android/feature/linking/MobileLinkingErrorFragment$Args$UnsupportedError;", "feature-mobile-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Args extends Parcelable {
        LinkingGroup getLinkingGroup();

        StringResource getMessage();

        StringResource getTitle();

        /* compiled from: MobileLinkingErrorFragment.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/feature/linking/MobileLinkingErrorFragment$Args$UnsupportedError;", "Lcom/robinhood/android/feature/linking/MobileLinkingErrorFragment$Args;", "linkingGroup", "Lcom/robinhood/android/store/linking/LinkingGroup;", "<init>", "(Lcom/robinhood/android/store/linking/LinkingGroup;)V", "getLinkingGroup", "()Lcom/robinhood/android/store/linking/LinkingGroup;", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle$annotations", "()V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "message", "getMessage$annotations", "getMessage", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-mobile-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class UnsupportedError implements Args {
            public static final int $stable = 8;
            public static final Parcelable.Creator<UnsupportedError> CREATOR = new Creator();
            private final LinkingGroup linkingGroup;
            private final StringResource message;
            private final StringResource title;

            /* compiled from: MobileLinkingErrorFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<UnsupportedError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UnsupportedError createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new UnsupportedError((LinkingGroup) parcel.readParcelable(UnsupportedError.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UnsupportedError[] newArray(int i) {
                    return new UnsupportedError[i];
                }
            }

            public static /* synthetic */ UnsupportedError copy$default(UnsupportedError unsupportedError, LinkingGroup linkingGroup, int i, Object obj) {
                if ((i & 1) != 0) {
                    linkingGroup = unsupportedError.linkingGroup;
                }
                return unsupportedError.copy(linkingGroup);
            }

            public static /* synthetic */ void getMessage$annotations() {
            }

            public static /* synthetic */ void getTitle$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final LinkingGroup getLinkingGroup() {
                return this.linkingGroup;
            }

            public final UnsupportedError copy(LinkingGroup linkingGroup) {
                Intrinsics.checkNotNullParameter(linkingGroup, "linkingGroup");
                return new UnsupportedError(linkingGroup);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UnsupportedError) && Intrinsics.areEqual(this.linkingGroup, ((UnsupportedError) other).linkingGroup);
            }

            public int hashCode() {
                return this.linkingGroup.hashCode();
            }

            public String toString() {
                return "UnsupportedError(linkingGroup=" + this.linkingGroup + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.linkingGroup, flags);
            }

            public UnsupportedError(LinkingGroup linkingGroup) {
                Intrinsics.checkNotNullParameter(linkingGroup, "linkingGroup");
                this.linkingGroup = linkingGroup;
                StringResource.Companion companion = StringResource.INSTANCE;
                this.title = companion.invoke(C16754R.string.mobile_linking_unsupported_symbol_title, getLinkingGroup().getInstrumentSymbol());
                this.message = companion.invoke(C16754R.string.mobile_linking_unsupported_symbol_description, new Object[0]);
            }

            @Override // com.robinhood.android.feature.linking.MobileLinkingErrorFragment.Args
            public LinkingGroup getLinkingGroup() {
                return this.linkingGroup;
            }

            @Override // com.robinhood.android.feature.linking.MobileLinkingErrorFragment.Args
            public StringResource getTitle() {
                return this.title;
            }

            @Override // com.robinhood.android.feature.linking.MobileLinkingErrorFragment.Args
            public StringResource getMessage() {
                return this.message;
            }
        }

        /* compiled from: MobileLinkingErrorFragment.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0017\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\u0018\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001aR\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u0016¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/feature/linking/MobileLinkingErrorFragment$Args$NetworkError;", "Lcom/robinhood/android/feature/linking/MobileLinkingErrorFragment$Args;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle$annotations", "()V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "message", "getMessage$annotations", "getMessage", "linkingGroup", "Lcom/robinhood/android/store/linking/LinkingGroup;", "getLinkingGroup$annotations", "getLinkingGroup", "()Lcom/robinhood/android/store/linking/LinkingGroup;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-mobile-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NetworkError implements Args {
            public static final int $stable = 8;
            public static final Parcelable.Creator<NetworkError> CREATOR = new Creator();
            private final Exception exception;
            private final LinkingGroup linkingGroup;
            private final StringResource message;
            private final StringResource title;

            /* compiled from: MobileLinkingErrorFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<NetworkError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NetworkError createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NetworkError((Exception) parcel.readSerializable());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NetworkError[] newArray(int i) {
                    return new NetworkError[i];
                }
            }

            public static /* synthetic */ NetworkError copy$default(NetworkError networkError, Exception exc, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = networkError.exception;
                }
                return networkError.copy(exc);
            }

            public static /* synthetic */ void getLinkingGroup$annotations() {
            }

            public static /* synthetic */ void getMessage$annotations() {
            }

            public static /* synthetic */ void getTitle$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final Exception getException() {
                return this.exception;
            }

            public final NetworkError copy(Exception exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                return new NetworkError(exception);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NetworkError) && Intrinsics.areEqual(this.exception, ((NetworkError) other).exception);
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            public String toString() {
                return "NetworkError(exception=" + this.exception + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.exception);
            }

            public NetworkError(Exception exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.exception = exception;
                StringResource.Companion companion = StringResource.INSTANCE;
                this.title = companion.invoke(C11048R.string.general_error_title, new Object[0]);
                int i = C16754R.string.mobile_linking_network_error_message;
                Object message = exception.getMessage();
                this.message = companion.invoke(i, message == null ? Integer.valueOf(C11048R.string.general_error_no_connection) : message);
            }

            public final Exception getException() {
                return this.exception;
            }

            @Override // com.robinhood.android.feature.linking.MobileLinkingErrorFragment.Args
            public StringResource getTitle() {
                return this.title;
            }

            @Override // com.robinhood.android.feature.linking.MobileLinkingErrorFragment.Args
            public StringResource getMessage() {
                return this.message;
            }

            @Override // com.robinhood.android.feature.linking.MobileLinkingErrorFragment.Args
            public LinkingGroup getLinkingGroup() {
                return this.linkingGroup;
            }
        }

        /* compiled from: MobileLinkingErrorFragment.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/feature/linking/MobileLinkingErrorFragment$Args$NoWidgetsError;", "Lcom/robinhood/android/feature/linking/MobileLinkingErrorFragment$Args;", "linkingGroup", "Lcom/robinhood/android/store/linking/LinkingGroup;", "<init>", "(Lcom/robinhood/android/store/linking/LinkingGroup;)V", "getLinkingGroup", "()Lcom/robinhood/android/store/linking/LinkingGroup;", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle$annotations", "()V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "message", "getMessage$annotations", "getMessage", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-mobile-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NoWidgetsError implements Args {
            public static final int $stable = 8;
            public static final Parcelable.Creator<NoWidgetsError> CREATOR = new Creator();
            private final LinkingGroup linkingGroup;
            private final StringResource message;
            private final StringResource title;

            /* compiled from: MobileLinkingErrorFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<NoWidgetsError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NoWidgetsError createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NoWidgetsError((LinkingGroup) parcel.readParcelable(NoWidgetsError.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NoWidgetsError[] newArray(int i) {
                    return new NoWidgetsError[i];
                }
            }

            public static /* synthetic */ NoWidgetsError copy$default(NoWidgetsError noWidgetsError, LinkingGroup linkingGroup, int i, Object obj) {
                if ((i & 1) != 0) {
                    linkingGroup = noWidgetsError.linkingGroup;
                }
                return noWidgetsError.copy(linkingGroup);
            }

            public static /* synthetic */ void getMessage$annotations() {
            }

            public static /* synthetic */ void getTitle$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final LinkingGroup getLinkingGroup() {
                return this.linkingGroup;
            }

            public final NoWidgetsError copy(LinkingGroup linkingGroup) {
                Intrinsics.checkNotNullParameter(linkingGroup, "linkingGroup");
                return new NoWidgetsError(linkingGroup);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NoWidgetsError) && Intrinsics.areEqual(this.linkingGroup, ((NoWidgetsError) other).linkingGroup);
            }

            public int hashCode() {
                return this.linkingGroup.hashCode();
            }

            public String toString() {
                return "NoWidgetsError(linkingGroup=" + this.linkingGroup + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.linkingGroup, flags);
            }

            public NoWidgetsError(LinkingGroup linkingGroup) {
                Intrinsics.checkNotNullParameter(linkingGroup, "linkingGroup");
                this.linkingGroup = linkingGroup;
                StringResource.Companion companion = StringResource.INSTANCE;
                this.title = companion.invoke(C16754R.string.mobile_linking_no_widgets_error_title, new Object[0]);
                this.message = companion.invoke(C16754R.string.mobile_linking_no_widgets_error_message, new Object[0]);
            }

            @Override // com.robinhood.android.feature.linking.MobileLinkingErrorFragment.Args
            public LinkingGroup getLinkingGroup() {
                return this.linkingGroup;
            }

            @Override // com.robinhood.android.feature.linking.MobileLinkingErrorFragment.Args
            public StringResource getTitle() {
                return this.title;
            }

            @Override // com.robinhood.android.feature.linking.MobileLinkingErrorFragment.Args
            public StringResource getMessage() {
                return this.message;
            }
        }

        /* compiled from: MobileLinkingErrorFragment.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0005X\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u0003\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/feature/linking/MobileLinkingErrorFragment$Args$NoLinkedGroupError;", "Lcom/robinhood/android/feature/linking/MobileLinkingErrorFragment$Args;", "<init>", "()V", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle$annotations", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "message", "getMessage$annotations", "getMessage", "linkingGroup", "Lcom/robinhood/android/store/linking/LinkingGroup;", "getLinkingGroup$annotations", "getLinkingGroup", "()Lcom/robinhood/android/store/linking/LinkingGroup;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-mobile-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NoLinkedGroupError implements Args {
            public static final int $stable;
            public static final Parcelable.Creator<NoLinkedGroupError> CREATOR;
            public static final NoLinkedGroupError INSTANCE = new NoLinkedGroupError();
            private static final LinkingGroup linkingGroup = null;
            private static final StringResource message;
            private static final StringResource title;

            /* compiled from: MobileLinkingErrorFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<NoLinkedGroupError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NoLinkedGroupError createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return NoLinkedGroupError.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NoLinkedGroupError[] newArray(int i) {
                    return new NoLinkedGroupError[i];
                }
            }

            public static /* synthetic */ void getLinkingGroup$annotations() {
            }

            public static /* synthetic */ void getMessage$annotations() {
            }

            public static /* synthetic */ void getTitle$annotations() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof NoLinkedGroupError);
            }

            public int hashCode() {
                return 152345418;
            }

            public String toString() {
                return "NoLinkedGroupError";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private NoLinkedGroupError() {
            }

            @Override // com.robinhood.android.feature.linking.MobileLinkingErrorFragment.Args
            public StringResource getTitle() {
                return title;
            }

            static {
                StringResource.Companion companion = StringResource.INSTANCE;
                title = companion.invoke(C16754R.string.mobile_linking_no_linking_group_error_title, new Object[0]);
                message = companion.invoke(C16754R.string.mobile_linking_no_linking_group_error_message, new Object[0]);
                $stable = 8;
                CREATOR = new Creator();
            }

            @Override // com.robinhood.android.feature.linking.MobileLinkingErrorFragment.Args
            public StringResource getMessage() {
                return message;
            }

            @Override // com.robinhood.android.feature.linking.MobileLinkingErrorFragment.Args
            public LinkingGroup getLinkingGroup() {
                return linkingGroup;
            }
        }
    }

    /* compiled from: MobileLinkingErrorFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/feature/linking/MobileLinkingErrorFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/feature/linking/MobileLinkingErrorFragment;", "Lcom/robinhood/android/feature/linking/MobileLinkingErrorFragment$Args;", "<init>", "()V", "feature-mobile-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MobileLinkingErrorFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(MobileLinkingErrorFragment mobileLinkingErrorFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, mobileLinkingErrorFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MobileLinkingErrorFragment newInstance(Args args) {
            return (MobileLinkingErrorFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MobileLinkingErrorFragment mobileLinkingErrorFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, mobileLinkingErrorFragment, args);
        }
    }
}
