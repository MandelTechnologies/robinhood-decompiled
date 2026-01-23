package com.robinhood.android.cash.flat.cashback.p071ui.common;

import android.text.SpannedString;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackViewState;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.component.text.BentoSpannedText;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: FlatCashbackLoadableComposable.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a^\u0010\r\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00040\bH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a=\u0010\u0016\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"VS", "Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackViewState;", "viewState", "Lkotlin/Function0;", "", "onRetry", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "loadedViewState", "loadedComposable", "FlatCashbackLoadableComposable", "(Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackViewState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/cash/flat/cashback/ui/common/ValueProp;", "valueProps", "Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowBulletType;", "bullet", "Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowAlignment;", "alignment", "ValuePropRows", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowBulletType;Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowAlignment;Landroidx/compose/runtime/Composer;II)V", "feature-cash-flat-cashback_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cash.flat.cashback.ui.common.FlatCashbackLoadableComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class FlatCashbackLoadableComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlatCashbackLoadableComposable$lambda$0(BaseFlatCashbackViewState baseFlatCashbackViewState, Function0 function0, Modifier modifier, Function3 function3, int i, int i2, Composer composer, int i3) {
        FlatCashbackLoadableComposable(baseFlatCashbackViewState, function0, modifier, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ValuePropRows$lambda$3(ImmutableList immutableList, Modifier modifier, BentoValuePropRow2 bentoValuePropRow2, BentoValuePropRow bentoValuePropRow, int i, int i2, Composer composer, int i3) {
        ValuePropRows(immutableList, modifier, bentoValuePropRow2, bentoValuePropRow, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <VS> void FlatCashbackLoadableComposable(final BaseFlatCashbackViewState<VS> viewState, final Function0<Unit> onRetry, Modifier modifier, final Function3<? super VS, ? super Composer, ? super Integer, Unit> loadedComposable, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        Modifier modifier3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onRetry, "onRetry");
        Intrinsics.checkNotNullParameter(loadedComposable, "loadedComposable");
        Composer composerStartRestartGroup = composer.startRestartGroup(1995130410);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onRetry) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(loadedComposable) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1995130410, i3, -1, "com.robinhood.android.cash.flat.cashback.ui.common.FlatCashbackLoadableComposable (FlatCashbackLoadableComposable.kt:20)");
                }
                if (!(viewState instanceof BaseFlatCashbackViewState.Loading)) {
                    composerStartRestartGroup.startReplaceGroup(1764919722);
                    composer2 = composerStartRestartGroup;
                    LocalShowPlaceholder.Loadable(true, modifier5, null, ComposableLambda3.rememberComposableLambda(-303076830, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.flat.cashback.ui.common.FlatCashbackLoadableComposableKt.FlatCashbackLoadableComposable.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i5) {
                            if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-303076830, i5, -1, "com.robinhood.android.cash.flat.cashback.ui.common.FlatCashbackLoadableComposable.<anonymous> (FlatCashbackLoadableComposable.kt:25)");
                            }
                            loadedComposable.invoke(((BaseFlatCashbackViewState.Loading) viewState).getMockViewState(), composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composer2, ((i3 >> 3) & 112) | 3078, 4);
                    composer2.endReplaceGroup();
                    modifier3 = modifier5;
                } else {
                    composer2 = composerStartRestartGroup;
                    if (viewState instanceof BaseFlatCashbackViewState.Error) {
                        composer2.startReplaceGroup(1764925190);
                        modifier3 = modifier5;
                        ErrorScreenComposable.ErrorScreenComposable(modifier3, onRetry, 0, null, null, null, null, false, composer2, ((i3 >> 6) & 14) | (i3 & 112), EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                        composer2 = composer2;
                        composer2.endReplaceGroup();
                    } else {
                        modifier3 = modifier5;
                        if (!(viewState instanceof BaseFlatCashbackViewState.Loaded)) {
                            composer2.startReplaceGroup(1764917995);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(1764929525);
                        loadedComposable.invoke((Object) ((BaseFlatCashbackViewState.Loaded) viewState).getLoadedViewState(), composer2, Integer.valueOf((i3 >> 6) & 112));
                        composer2.endReplaceGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.flat.cashback.ui.common.FlatCashbackLoadableComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FlatCashbackLoadableComposable.FlatCashbackLoadableComposable$lambda$0(viewState, onRetry, modifier4, loadedComposable, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!(viewState instanceof BaseFlatCashbackViewState.Loading)) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ValuePropRows(final ImmutableList<ValueProp> valueProps, Modifier modifier, BentoValuePropRow2 bentoValuePropRow2, BentoValuePropRow bentoValuePropRow, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        BentoValuePropRow2 bentoValuePropRow22;
        int i5;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        final BentoValuePropRow2 bentoValuePropRow23;
        final BentoValuePropRow bentoValuePropRow3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(valueProps, "valueProps");
        Composer composerStartRestartGroup = composer.startRestartGroup(447932920);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(valueProps) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    bentoValuePropRow22 = bentoValuePropRow2;
                    i3 |= composerStartRestartGroup.changedInstance(bentoValuePropRow22) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changed(bentoValuePropRow == null ? -1 : bentoValuePropRow.ordinal()) ? 2048 : 1024;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    BentoValuePropRow2 bentoValuePropRow24 = i4 == 0 ? null : bentoValuePropRow22;
                    BentoValuePropRow bentoValuePropRow4 = i5 == 0 ? BentoValuePropRow.Top : bentoValuePropRow;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(447932920, i3, -1, "com.robinhood.android.cash.flat.cashback.ui.common.ValuePropRows (FlatCashbackLoadableComposable.kt:51)");
                    }
                    int i7 = 0;
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
                    composerStartRestartGroup.startReplaceGroup(1204054372);
                    for (ValueProp valueProp : valueProps) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        final ValueProp valueProp2 = valueProp;
                        BentoValuePropRow bentoValuePropRow5 = bentoValuePropRow4;
                        BentoValuePropRow3.m21026BentoValuePropRowWithMarkdownOrRichtextFV1VA1c(valueProp2.getTitle(), ComposableLambda3.rememberComposableLambda(613378000, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.flat.cashback.ui.common.FlatCashbackLoadableComposableKt$ValuePropRows$1$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i9) {
                                if ((i9 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(613378000, i9, -1, "com.robinhood.android.cash.flat.cashback.ui.common.ValuePropRows.<anonymous>.<anonymous>.<anonymous> (FlatCashbackLoadableComposable.kt:57)");
                                }
                                CharSequence body = valueProp2.getBody();
                                if (body != null) {
                                    BentoSpannedText.m21106BentoSpannedTextTHkziT8(SpannedString.valueOf(body), null, null, null, 0, null, 0, 0, null, composer2, 0, 510);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), bentoValuePropRow24 == null ? new BentoValuePropRow2.Number(i8) : bentoValuePropRow24, bentoValuePropRow5, null, null, composerStartRestartGroup, (i3 & 7168) | 48, 48);
                        bentoValuePropRow4 = bentoValuePropRow5;
                        i7 = i8;
                    }
                    BentoValuePropRow bentoValuePropRow6 = bentoValuePropRow4;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    bentoValuePropRow23 = bentoValuePropRow24;
                    bentoValuePropRow3 = bentoValuePropRow6;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    bentoValuePropRow23 = bentoValuePropRow22;
                    bentoValuePropRow3 = bentoValuePropRow;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.flat.cashback.ui.common.FlatCashbackLoadableComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return FlatCashbackLoadableComposable.ValuePropRows$lambda$3(valueProps, modifier3, bentoValuePropRow23, bentoValuePropRow3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            bentoValuePropRow22 = bentoValuePropRow2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            if ((i3 & 1171) != 1170) {
                if (i6 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i72 = 0;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1204054372);
                    while (r0.hasNext()) {
                    }
                    BentoValuePropRow bentoValuePropRow62 = bentoValuePropRow4;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                    bentoValuePropRow23 = bentoValuePropRow24;
                    bentoValuePropRow3 = bentoValuePropRow62;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        bentoValuePropRow22 = bentoValuePropRow2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
