package com.robinhood.android.beneficiaries.p067ui.list;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ScaffoldDefaults;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.beneficiaries.models.p066db.BeneficiaryList;
import com.robinhood.android.beneficiaries.p067ui.list.BeneficiaryListComposable;
import com.robinhood.android.beneficiaries.p067ui.list.BeneficiaryListViewState;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.RichTexts2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIcon2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoImage;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.ThemedImageSource;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.compose.extensions.WindowInsetsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BeneficiaryListComposable.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a'\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u000b\u001a'\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u000b\u001a\u0014\u0010\r\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u001a\u0014\u0010\u0011\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002\u001a*\u0010\u0014\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a*\u0010\u000f\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a$\u0010\u001a\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0014\u0010\u001d\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0016H\u0002\u001a#\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00192\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\"H\u0003¢\u0006\u0002\u0010#\u001a#\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u001c2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010\"H\u0003¢\u0006\u0002\u0010'¨\u0006("}, m3636d2 = {"BeneficiaryListComposable", "", "viewState", "Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListViewState;", "callbacks", "Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListViewState;Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BeneficiaryListScaffoldContent", "Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListViewState$Content;", "(Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListViewState$Content;Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BeneficiaryListScaffoldContentEligible", "beneficiaryListHeader", "Landroidx/compose/foundation/lazy/LazyListScope;", "beneficiaryList", "Lcom/robinhood/android/beneficiaries/models/db/BeneficiaryList;", "beneficiaryEmptyStateImage", "source", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedImageSource;", "beneficiarySections", "accountNumber", "", "", "Lcom/robinhood/android/beneficiaries/models/db/BeneficiaryList$BeneficiarySection;", "Lcom/robinhood/android/beneficiaries/models/db/BeneficiaryList$Beneficiary;", "beneficiaryAddRow", "beneficiaryRow", "Lcom/robinhood/android/beneficiaries/models/db/BeneficiaryList$AddBeneficiaryRow;", "beneficiaryDisclosure", "disclosureMarkdown", "BeneficiaryListRow", "beneficiary", "onBeneficiaryClick", "Lkotlin/Function0;", "(Lcom/robinhood/android/beneficiaries/models/db/BeneficiaryList$Beneficiary;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "BeneficiaryListAddRow", "addBeneficiaryRow", "onAddBeneficiaryClick", "(Lcom/robinhood/android/beneficiaries/models/db/BeneficiaryList$AddBeneficiaryRow;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-beneficiaries_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class BeneficiaryListComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BeneficiaryListAddRow$lambda$20(BeneficiaryList.AddBeneficiaryRow addBeneficiaryRow, Function0 function0, int i, Composer composer, int i2) {
        BeneficiaryListAddRow(addBeneficiaryRow, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BeneficiaryListComposable$lambda$0(BeneficiaryListViewState beneficiaryListViewState, BeneficiaryListCallbacks beneficiaryListCallbacks, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BeneficiaryListComposable(beneficiaryListViewState, beneficiaryListCallbacks, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BeneficiaryListRow$lambda$18(BeneficiaryList.Beneficiary beneficiary, Function0 function0, int i, Composer composer, int i2) {
        BeneficiaryListRow(beneficiary, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BeneficiaryListScaffoldContent$lambda$3(BeneficiaryListViewState.Content content, BeneficiaryListCallbacks beneficiaryListCallbacks, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BeneficiaryListScaffoldContent(content, beneficiaryListCallbacks, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BeneficiaryListScaffoldContentEligible$lambda$14(BeneficiaryListViewState.Content content, BeneficiaryListCallbacks beneficiaryListCallbacks, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BeneficiaryListScaffoldContentEligible(content, beneficiaryListCallbacks, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BeneficiaryListComposable(final BeneficiaryListViewState viewState, final BeneficiaryListCallbacks callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-578280924);
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
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-578280924, i3, -1, "com.robinhood.android.beneficiaries.ui.list.BeneficiaryListComposable (BeneficiaryListComposable.kt:54)");
                }
                if (!(viewState instanceof BeneficiaryListViewState.Content)) {
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.BENEFICIARY_LIST, null, ((BeneficiaryListViewState.Content) viewState).getBeneficiaryList().getAccountNumber(), null, 10, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(1536616327, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListComposableKt.BeneficiaryListComposable.1
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
                                ComposerKt.traceEventStart(1536616327, i5, -1, "com.robinhood.android.beneficiaries.ui.list.BeneficiaryListComposable.<anonymous> (BeneficiaryListComposable.kt:62)");
                            }
                            Modifier modifier4 = modifier3;
                            WindowInsets windowInsetsExcludeTop = WindowInsetsKt.excludeTop(ScaffoldDefaults.INSTANCE.getContentWindowInsets(composer2, ScaffoldDefaults.$stable));
                            final BeneficiaryListViewState beneficiaryListViewState = viewState;
                            final BeneficiaryListCallbacks beneficiaryListCallbacks = callbacks;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier4, null, null, null, null, 0, 0L, 0L, windowInsetsExcludeTop, ComposableLambda3.rememberComposableLambda(955037912, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListComposableKt.BeneficiaryListComposable.1.1
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
                                        ComposerKt.traceEventStart(955037912, i6, -1, "com.robinhood.android.beneficiaries.ui.list.BeneficiaryListComposable.<anonymous>.<anonymous> (BeneficiaryListComposable.kt:67)");
                                    }
                                    BeneficiaryListComposable.BeneficiaryListScaffoldContent((BeneficiaryListViewState.Content) beneficiaryListViewState, beneficiaryListCallbacks, PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer3, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 805306368, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                } else if (!(viewState instanceof BeneficiaryListViewState.Loading)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BeneficiaryListComposable.BeneficiaryListComposable$lambda$0(viewState, callbacks, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            if (!(viewState instanceof BeneficiaryListViewState.Content)) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BeneficiaryListScaffoldContent(final BeneficiaryListViewState.Content content, final BeneficiaryListCallbacks beneficiaryListCallbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        BeneficiaryListViewState.Content content2;
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        BeneficiaryList.IneligibleViewModel ineligibleViewModel;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1347668660);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            content2 = content;
        } else if ((i & 6) == 0) {
            content2 = content;
            i3 = (composerStartRestartGroup.changedInstance(content2) ? 4 : 2) | i;
        } else {
            content2 = content;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(beneficiaryListCallbacks) : composerStartRestartGroup.changedInstance(beneficiaryListCallbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1347668660, i3, -1, "com.robinhood.android.beneficiaries.ui.list.BeneficiaryListScaffoldContent (BeneficiaryListComposable.kt:84)");
                }
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(spaceBetween, companion.getStart(), composerStartRestartGroup, 6);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier2);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
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
                Modifier.Companion companion3 = Modifier.INSTANCE;
                BeneficiaryListScaffoldContentEligible(content2, beneficiaryListCallbacks, SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), composerStartRestartGroup, (i3 & 112) | (i3 & 14) | 384, 0);
                ineligibleViewModel = content.getBeneficiaryList().getViewModel().getIneligibleViewModel();
                composerStartRestartGroup.startReplaceGroup(-824548941);
                if (ineligibleViewModel != null) {
                    modifier3 = modifier2;
                } else {
                    ImmutableList immutableList = extensions2.toImmutableList(ineligibleViewModel.getContent());
                    composerStartRestartGroup.startReplaceGroup(-1772220517);
                    modifier3 = modifier2;
                    SduiColumns.SduiColumn(immutableList, GenericAction.class, companion3, null, null, HorizontalPadding.Default, arrangement.getTop(), companion.getStart(), false, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BeneficiaryListComposable.BeneficiaryListScaffoldContent$lambda$3(content, beneficiaryListCallbacks, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical spaceBetween2 = arrangement2.getSpaceBetween();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(spaceBetween2, companion4.getStart(), composerStartRestartGroup, 6);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
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
                Modifier.Companion companion32 = Modifier.INSTANCE;
                BeneficiaryListScaffoldContentEligible(content2, beneficiaryListCallbacks, SizeKt.fillMaxSize$default(companion32, 0.0f, 1, null), composerStartRestartGroup, (i3 & 112) | (i3 & 14) | 384, 0);
                ineligibleViewModel = content.getBeneficiaryList().getViewModel().getIneligibleViewModel();
                composerStartRestartGroup.startReplaceGroup(-824548941);
                if (ineligibleViewModel != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void BeneficiaryListScaffoldContentEligible(final BeneficiaryListViewState.Content content, final BeneficiaryListCallbacks beneficiaryListCallbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Alignment.Companion companion;
        int currentCompositeKeyHash;
        ComposeUiNode.Companion companion2;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Modifier.Companion companion3;
        int i4;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier3;
        BeneficiaryList.AddBeneficiaryRow addBeneficiaryRow;
        boolean z;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1722853789);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(beneficiaryListCallbacks) : composerStartRestartGroup.changedInstance(beneficiaryListCallbacks) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1722853789, i3, -1, "com.robinhood.android.beneficiaries.ui.list.BeneficiaryListScaffoldContentEligible (BeneficiaryListComposable.kt:103)");
                }
                Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(spaceBetween, companion.getStart(), composerStartRestartGroup, 6);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                companion2 = ComposeUiNode.INSTANCE;
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
                companion3 = Modifier.INSTANCE;
                Modifier modifierWeight = column6.weight(companion3, 1.0f, true);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                i4 = i3 & 112;
                zChangedInstance = composerStartRestartGroup.changedInstance(content) | (i4 != 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(beneficiaryListCallbacks)));
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return BeneficiaryListComposable.m1740x342e7031(content, beneficiaryListCallbacks, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                int i6 = i3;
                LazyDslKt.LazyColumn(modifierWeight, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, 510);
                composerStartRestartGroup.startReplaceGroup(1898906157);
                if (content.isContingentBeneficiaryExperiment() && (addBeneficiaryRow = content.getBeneficiaryList().getViewModel().getAddBeneficiaryRow()) != null) {
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierFillMaxWidth$default, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM());
                    z = false;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN4);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                    BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                    String title = addBeneficiaryRow.getTitle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    if (i4 != 32 || ((i6 & 64) != 0 && composerStartRestartGroup.changedInstance(beneficiaryListCallbacks))) {
                        z = true;
                    }
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(content) | z;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListComposableKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return BeneficiaryListComposable.m1739x57f137e3(beneficiaryListCallbacks, content);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, title, modifierFillMaxWidth$default2, null, type2, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24960, 0, 8168);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    Unit unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BeneficiaryListComposable.BeneficiaryListScaffoldContentEligible$lambda$14(content, beneficiaryListCallbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
            companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(spaceBetween2, companion.getStart(), composerStartRestartGroup, 6);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion2.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                companion3 = Modifier.INSTANCE;
                Modifier modifierWeight2 = column62.weight(companion3, 1.0f, true);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                i4 = i3 & 112;
                if (i4 != 32) {
                    zChangedInstance = composerStartRestartGroup.changedInstance(content) | (i4 != 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(beneficiaryListCallbacks)));
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return BeneficiaryListComposable.m1740x342e7031(content, beneficiaryListCallbacks, (LazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier52 = modifier4;
                        int i62 = i3;
                        LazyDslKt.LazyColumn(modifierWeight2, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, 510);
                        composerStartRestartGroup.startReplaceGroup(1898906157);
                        if (content.isContingentBeneficiaryExperiment()) {
                            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i72 = BentoTheme.$stable;
                            Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(modifierFillMaxWidth$default3, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21590getDefaultD9Ej5fM());
                            z = false;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN42);
                            Function0<ComposeUiNode> constructor22 = companion2.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion2.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl2.getInserting()) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion2.getSetModifier());
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                Modifier modifierFillMaxWidth$default22 = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                                BentoButtons.Type type22 = BentoButtons.Type.Secondary;
                                String title2 = addBeneficiaryRow.getTitle();
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                if (i4 != 32) {
                                    z = true;
                                    zChangedInstance2 = composerStartRestartGroup.changedInstance(content) | z;
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (!zChangedInstance2) {
                                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListComposableKt$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return BeneficiaryListComposable.m1739x57f137e3(beneficiaryListCallbacks, content);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                        composerStartRestartGroup.endReplaceGroup();
                                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, title2, modifierFillMaxWidth$default22, null, type22, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24960, 0, 8168);
                                        composerStartRestartGroup = composerStartRestartGroup;
                                        composerStartRestartGroup.endNode();
                                        Unit unit2 = Unit.INSTANCE;
                                    }
                                }
                            }
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BeneficiaryListScaffoldContentEligible$lambda$13$lambda$8$lambda$7 */
    public static final Unit m1740x342e7031(BeneficiaryListViewState.Content content, BeneficiaryListCallbacks beneficiaryListCallbacks, LazyListScope LazyColumn) {
        BeneficiaryList.AddBeneficiaryRow addBeneficiaryRow;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        beneficiaryListHeader(LazyColumn, content.getBeneficiaryList());
        if (content.isContingentBeneficiaryExperiment()) {
            ThemedImageSource emptyStateImage = content.getBeneficiaryList().getViewModel().getEmptyStateImage();
            if (emptyStateImage != null) {
                beneficiaryEmptyStateImage(LazyColumn, emptyStateImage);
            }
            if (!content.getBeneficiaryList().getViewModel().getBeneficiarySections().isEmpty()) {
                beneficiarySections(LazyColumn, content.getBeneficiaryList().getAccountNumber(), content.getBeneficiaryList().getViewModel().getBeneficiarySections(), beneficiaryListCallbacks);
            }
        }
        if (!content.getBeneficiaryList().getViewModel().getBeneficiaries().isEmpty()) {
            beneficiaryList(LazyColumn, content.getBeneficiaryList().getAccountNumber(), content.getBeneficiaryList().getViewModel().getBeneficiaries(), beneficiaryListCallbacks);
        }
        if (!content.isContingentBeneficiaryExperiment() && (addBeneficiaryRow = content.getBeneficiaryList().getViewModel().getAddBeneficiaryRow()) != null) {
            beneficiaryAddRow(LazyColumn, content.getBeneficiaryList().getAccountNumber(), addBeneficiaryRow, beneficiaryListCallbacks);
        }
        String disclosureMarkdown = content.getBeneficiaryList().getViewModel().getDisclosureMarkdown();
        if (disclosureMarkdown != null) {
            beneficiaryDisclosure(LazyColumn, disclosureMarkdown);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BeneficiaryListScaffoldContentEligible$lambda$13$lambda$12$lambda$11$lambda$10$lambda$9 */
    public static final Unit m1739x57f137e3(BeneficiaryListCallbacks beneficiaryListCallbacks, BeneficiaryListViewState.Content content) {
        beneficiaryListCallbacks.onAddBeneficiary(content.getBeneficiaryList().getAccountNumber());
        return Unit.INSTANCE;
    }

    private static final void beneficiaryListHeader(LazyListScope lazyListScope, final BeneficiaryList beneficiaryList) {
        LazyListScope.item$default(lazyListScope, "Header", null, ComposableLambda3.composableLambdaInstance(-1897786803, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListComposableKt.beneficiaryListHeader.1
            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1897786803, i, -1, "com.robinhood.android.beneficiaries.ui.list.beneficiaryListHeader.<anonymous> (BeneficiaryListComposable.kt:166)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                BeneficiaryList beneficiaryList2 = beneficiaryList;
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(beneficiaryList2.getViewModel().getTitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8190);
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                BentoMarkdownText2.BentoMarkdownText(beneficiaryList2.getViewModel().getSubtitleMarkdown(), (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, 0, 30);
                composer.endNode();
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }
        }), 2, null);
    }

    private static final void beneficiaryList(LazyListScope lazyListScope, final String str, final List<BeneficiaryList.Beneficiary> list, final BeneficiaryListCallbacks beneficiaryListCallbacks) {
        final C9777xd4bc48f9 c9777xd4bc48f9 = new Function1() { // from class: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListComposableKt$beneficiaryList$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(BeneficiaryList.Beneficiary beneficiary) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((BeneficiaryList.Beneficiary) obj);
            }
        };
        lazyListScope.items(list.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListComposableKt$beneficiaryList$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c9777xd4bc48f9.invoke(list.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListComposableKt$beneficiaryList$$inlined$items$default$4
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
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
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
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                final BeneficiaryList.Beneficiary beneficiary = (BeneficiaryList.Beneficiary) list.get(i);
                composer.startReplaceGroup(945851483);
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composer.changedInstance(beneficiaryListCallbacks) | composer.changed(str) | composer.changedInstance(beneficiary);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final BeneficiaryListCallbacks beneficiaryListCallbacks2 = beneficiaryListCallbacks;
                    final String str2 = str;
                    objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListComposableKt$beneficiaryList$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            beneficiaryListCallbacks2.onBeneficiaryClicked(str2, beneficiary.getBeneficiaryId());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BeneficiaryListComposable.BeneficiaryListRow(beneficiary, (Function0) objRememberedValue, composer, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    private static final void beneficiaryEmptyStateImage(LazyListScope lazyListScope, final ThemedImageSource themedImageSource) {
        LazyListScope.item$default(lazyListScope, "EmptyStateImage", null, ComposableLambda3.composableLambdaInstance(-408238207, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListComposableKt.beneficiaryEmptyStateImage.1
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
                    ComposerKt.traceEventStart(-408238207, i, -1, "com.robinhood.android.beneficiaries.ui.list.beneficiaryEmptyStateImage.<anonymous> (BeneficiaryListComposable.kt:188)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(50)), composer, 6);
                BentoImage.BentoImage(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(UtilKt.toHttpUrl(themedImageSource, composer, 0), null, null, ContentScale.INSTANCE.getFillBounds(), 0, null, composer, 3072, 54), null, PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C2002Dp.m7995constructorimpl(300)), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, 0.0f, null, composer, 48, 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 2, null);
    }

    private static final void beneficiarySections(LazyListScope lazyListScope, String str, List<BeneficiaryList.BeneficiarySection> list, BeneficiaryListCallbacks beneficiaryListCallbacks) {
        for (final BeneficiaryList.BeneficiarySection beneficiarySection : list) {
            LazyListScope lazyListScope2 = lazyListScope;
            LazyListScope.item$default(lazyListScope2, beneficiarySection.getTitle(), null, ComposableLambda3.composableLambdaInstance(-423755536, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListComposableKt$beneficiarySections$1$1
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
                        ComposerKt.traceEventStart(-423755536, i, -1, "com.robinhood.android.beneficiaries.ui.list.beneficiarySections.<anonymous>.<anonymous> (BeneficiaryListComposable.kt:209)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM()), composer, 0);
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                    BentoText2.m20747BentoText38GnDrw(beneficiarySection.getTitle(), modifierM5144paddingVpY3zN4$default, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, i2).getTextM(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 0, 0, 8184);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 2, null);
            beneficiaryList(lazyListScope2, str, beneficiarySection.getBeneficiaries(), beneficiaryListCallbacks);
            lazyListScope = lazyListScope2;
        }
    }

    /* compiled from: BeneficiaryListComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListComposableKt$beneficiaryAddRow$1 */
    static final class C97821 implements Function3<LazyItemScope, Composer, Integer, Unit> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ BeneficiaryList.AddBeneficiaryRow $beneficiaryRow;
        final /* synthetic */ BeneficiaryListCallbacks $callbacks;

        C97821(BeneficiaryList.AddBeneficiaryRow addBeneficiaryRow, BeneficiaryListCallbacks beneficiaryListCallbacks, String str) {
            this.$beneficiaryRow = addBeneficiaryRow;
            this.$callbacks = beneficiaryListCallbacks;
            this.$accountNumber = str;
        }

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
                ComposerKt.traceEventStart(-743261370, i, -1, "com.robinhood.android.beneficiaries.ui.list.beneficiaryAddRow.<anonymous> (BeneficiaryListComposable.kt:239)");
            }
            BeneficiaryList.AddBeneficiaryRow addBeneficiaryRow = this.$beneficiaryRow;
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.$callbacks) | composer.changed(this.$accountNumber);
            final BeneficiaryListCallbacks beneficiaryListCallbacks = this.$callbacks;
            final String str = this.$accountNumber;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListComposableKt$beneficiaryAddRow$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BeneficiaryListComposable.C97821.invoke$lambda$1$lambda$0(beneficiaryListCallbacks, str);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BeneficiaryListComposable.BeneficiaryListAddRow(addBeneficiaryRow, (Function0) objRememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(BeneficiaryListCallbacks beneficiaryListCallbacks, String str) {
            beneficiaryListCallbacks.onAddBeneficiary(str);
            return Unit.INSTANCE;
        }
    }

    private static final void beneficiaryAddRow(LazyListScope lazyListScope, String str, BeneficiaryList.AddBeneficiaryRow addBeneficiaryRow, BeneficiaryListCallbacks beneficiaryListCallbacks) {
        LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-743261370, true, new C97821(addBeneficiaryRow, beneficiaryListCallbacks, str)), 3, null);
    }

    private static final void beneficiaryDisclosure(LazyListScope lazyListScope, final String str) {
        LazyListScope.item$default(lazyListScope, "Disclosure", null, ComposableLambda3.composableLambdaInstance(-465865345, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListComposableKt.beneficiaryDisclosure.1
            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-465865345, i, -1, "com.robinhood.android.beneficiaries.ui.list.beneficiaryDisclosure.<anonymous> (BeneficiaryListComposable.kt:247)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                String str2 = str;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
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
                BentoMarkdownText2.BentoMarkdownText(str2, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer, i2).getTextS(), 0, bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), 0L, false, composer, BentoMarkdownText.$stable << 15, 26), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 26);
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }
        }), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BeneficiaryListRow(final BeneficiaryList.Beneficiary beneficiary, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1431139249);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(beneficiary) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1431139249, i3, -1, "com.robinhood.android.beneficiaries.ui.list.BeneficiaryListRow (BeneficiaryListComposable.kt:266)");
            }
            composer2 = composerStartRestartGroup;
            BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(beneficiary.getLoggingIdentifier(), null, UserInteractionEventData.Action.VIEW_BENEFICIARY_DETAIL, null, new Component(Component.ComponentType.ROW, beneficiary.getLoggingIdentifier(), null, 4, null), null, 42, null)), true, false, false, true, false, null, 108, null), null, new AnnotatedString(beneficiary.getTitle(), null, 2, null), RichTexts2.m15957toAnnotatedStringiJQMabo(beneficiary.getSubtitle(), 0L, composerStartRestartGroup, 0, 1), null, null, null, false, false, false, false, false, 0L, function0, composer2, 0, (i3 << 6) & 7168, 8178);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BeneficiaryListComposable.BeneficiaryListRow$lambda$18(beneficiary, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BeneficiaryListAddRow(final BeneficiaryList.AddBeneficiaryRow addBeneficiaryRow, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2014173577);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(addBeneficiaryRow) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2014173577, i2, -1, "com.robinhood.android.beneficiaries.ui.list.BeneficiaryListAddRow (BeneficiaryListComposable.kt:292)");
            }
            ServerToBentoAssetMapper2 bentoAsset = SduiIcon2.toBentoAsset(addBeneficiaryRow.getIcon());
            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.ADD_BENEFICIARY, null, new Component(Component.ComponentType.ROW, null, null, 6, null), null, 43, null)), true, false, false, true, false, null, 108, null), bentoAsset != null ? new BentoBaseRowState.Start.Icon(bentoAsset, null, null, 6, null) : null, addBeneficiaryRow.getTitle(), null, null, null, null, false, false, false, 0L, function0, composerStartRestartGroup, BentoBaseRowState.Start.Icon.$stable << 3, i2 & 112, 2040);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BeneficiaryListComposable.BeneficiaryListAddRow$lambda$20(addBeneficiaryRow, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
