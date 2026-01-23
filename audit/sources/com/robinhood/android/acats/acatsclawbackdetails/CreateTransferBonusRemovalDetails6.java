package com.robinhood.android.acats.acatsclawbackdetails;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetails6;
import com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsViewState;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoAccordionRow;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
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

/* compiled from: CreateTransferBonusRemovalDetails.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\u0015\u0010\t\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\n\u001a\u001f\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\r\u001a\u0015\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\n\u001a'\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u008e\u0002"}, m3636d2 = {"CreateTransferBonusRemovalDetails", "", "viewState", "Lcom/robinhood/android/acats/acatsclawbackdetails/CreateTransferBonusRemovalDetailsViewState;", "callbacks", "Lcom/robinhood/android/acats/acatsclawbackdetails/CreateTransferBonusRemovalDetailsCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/acats/acatsclawbackdetails/CreateTransferBonusRemovalDetailsViewState;Lcom/robinhood/android/acats/acatsclawbackdetails/CreateTransferBonusRemovalDetailsCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CreateTransferBonusRemovalDetailsToolbar", "(Lcom/robinhood/android/acats/acatsclawbackdetails/CreateTransferBonusRemovalDetailsCallbacks;Landroidx/compose/runtime/Composer;I)V", "CreateTransferBonusRemovalDetailsContent", "Lcom/robinhood/android/acats/acatsclawbackdetails/CreateTransferBonusRemovalDetailsViewState$Content;", "(Lcom/robinhood/android/acats/acatsclawbackdetails/CreateTransferBonusRemovalDetailsViewState$Content;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CreateTransferBonusRemovalDetailsBottomBar", "CreateTransferBonusRemovalDetailsContentItem", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "createTransferBonusRemovalDetailsItem", "Lcom/robinhood/android/acats/acatsclawbackdetails/CreateTransferBonusRemovalDetailsItem;", "(ILcom/robinhood/android/acats/acatsclawbackdetails/CreateTransferBonusRemovalDetailsItem;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-acats-clawback-details_externalDebug", "isExpanded", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class CreateTransferBonusRemovalDetails6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTransferBonusRemovalDetails$lambda$0(CreateTransferBonusRemovalDetailsViewState createTransferBonusRemovalDetailsViewState, CreateTransferBonusRemovalDetails4 createTransferBonusRemovalDetails4, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CreateTransferBonusRemovalDetails(createTransferBonusRemovalDetailsViewState, createTransferBonusRemovalDetails4, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTransferBonusRemovalDetailsBottomBar$lambda$8(CreateTransferBonusRemovalDetails4 createTransferBonusRemovalDetails4, int i, Composer composer, int i2) {
        CreateTransferBonusRemovalDetailsBottomBar(createTransferBonusRemovalDetails4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTransferBonusRemovalDetailsContent$lambda$5(CreateTransferBonusRemovalDetailsViewState.Content content, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CreateTransferBonusRemovalDetailsContent(content, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTransferBonusRemovalDetailsContentItem$lambda$14(int i, CreateTransferBonusRemovalDetailsItem createTransferBonusRemovalDetailsItem, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        CreateTransferBonusRemovalDetailsContentItem(i, createTransferBonusRemovalDetailsItem, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTransferBonusRemovalDetailsToolbar$lambda$1(CreateTransferBonusRemovalDetails4 createTransferBonusRemovalDetails4, int i, Composer composer, int i2) {
        CreateTransferBonusRemovalDetailsToolbar(createTransferBonusRemovalDetails4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CreateTransferBonusRemovalDetails(final CreateTransferBonusRemovalDetailsViewState viewState, final CreateTransferBonusRemovalDetails4 callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1926280845);
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
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1926280845, i3, -1, "com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetails (CreateTransferBonusRemovalDetails.kt:45)");
                }
                int i5 = ((i3 >> 6) & 14) | 805306800;
                composer2 = composerStartRestartGroup;
                Modifier modifier5 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, ComposableLambda3.rememberComposableLambda(256404809, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsKt.CreateTransferBonusRemovalDetails.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(256404809, i6, -1, "com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetails.<anonymous> (CreateTransferBonusRemovalDetails.kt:48)");
                        }
                        CreateTransferBonusRemovalDetails6.CreateTransferBonusRemovalDetailsToolbar(callbacks, composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(2053855272, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsKt.CreateTransferBonusRemovalDetails.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2053855272, i6, -1, "com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetails.<anonymous> (CreateTransferBonusRemovalDetails.kt:51)");
                        }
                        CreateTransferBonusRemovalDetailsViewState createTransferBonusRemovalDetailsViewState = viewState;
                        if ((createTransferBonusRemovalDetailsViewState instanceof CreateTransferBonusRemovalDetailsViewState.Content) && !((CreateTransferBonusRemovalDetailsViewState.Content) createTransferBonusRemovalDetailsViewState).getLoading()) {
                            CreateTransferBonusRemovalDetails6.CreateTransferBonusRemovalDetailsBottomBar(callbacks, composer3, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1130145822, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsKt.CreateTransferBonusRemovalDetails.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(final PaddingValues paddingValues, Composer composer3, int i6) {
                        int i7;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i6 & 6) == 0) {
                            i7 = (composer3.changed(paddingValues) ? 4 : 2) | i6;
                        } else {
                            i7 = i6;
                        }
                        if ((i7 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1130145822, i7, -1, "com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetails.<anonymous> (CreateTransferBonusRemovalDetails.kt:58)");
                        }
                        CreateTransferBonusRemovalDetailsViewState createTransferBonusRemovalDetailsViewState = viewState;
                        if (createTransferBonusRemovalDetailsViewState instanceof CreateTransferBonusRemovalDetailsViewState.Failure) {
                            composer3.startReplaceGroup(-74330604);
                            ErrorScreenComposable.ErrorScreenComposable(PaddingKt.padding(Modifier.INSTANCE, paddingValues), null, 0, null, null, null, null, false, composer3, 12582912, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                            composer3.endReplaceGroup();
                        } else {
                            if (!(createTransferBonusRemovalDetailsViewState instanceof CreateTransferBonusRemovalDetailsViewState.Content)) {
                                composer3.startReplaceGroup(-556589409);
                                composer3.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer3.startReplaceGroup(-74080868);
                            boolean loading = ((CreateTransferBonusRemovalDetailsViewState.Content) viewState).getLoading();
                            final CreateTransferBonusRemovalDetailsViewState createTransferBonusRemovalDetailsViewState2 = viewState;
                            LocalShowPlaceholder.Loadable(loading, null, null, ComposableLambda3.rememberComposableLambda(-1107593521, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsKt.CreateTransferBonusRemovalDetails.3.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i8) {
                                    if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1107593521, i8, -1, "com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetails.<anonymous>.<anonymous> (CreateTransferBonusRemovalDetails.kt:70)");
                                    }
                                    CreateTransferBonusRemovalDetails6.CreateTransferBonusRemovalDetailsContent((CreateTransferBonusRemovalDetailsViewState.Content) createTransferBonusRemovalDetailsViewState2, PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer4, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 3072, 6);
                            composer3.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, i5, 504);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CreateTransferBonusRemovalDetails6.CreateTransferBonusRemovalDetails$lambda$0(viewState, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            int i52 = ((i3 >> 6) & 14) | 805306800;
            composer2 = composerStartRestartGroup;
            Modifier modifier52 = modifier4;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier52, ComposableLambda3.rememberComposableLambda(256404809, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsKt.CreateTransferBonusRemovalDetails.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    if ((i6 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(256404809, i6, -1, "com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetails.<anonymous> (CreateTransferBonusRemovalDetails.kt:48)");
                    }
                    CreateTransferBonusRemovalDetails6.CreateTransferBonusRemovalDetailsToolbar(callbacks, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(2053855272, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsKt.CreateTransferBonusRemovalDetails.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    if ((i6 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2053855272, i6, -1, "com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetails.<anonymous> (CreateTransferBonusRemovalDetails.kt:51)");
                    }
                    CreateTransferBonusRemovalDetailsViewState createTransferBonusRemovalDetailsViewState = viewState;
                    if ((createTransferBonusRemovalDetailsViewState instanceof CreateTransferBonusRemovalDetailsViewState.Content) && !((CreateTransferBonusRemovalDetailsViewState.Content) createTransferBonusRemovalDetailsViewState).getLoading()) {
                        CreateTransferBonusRemovalDetails6.CreateTransferBonusRemovalDetailsBottomBar(callbacks, composer3, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1130145822, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsKt.CreateTransferBonusRemovalDetails.3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(final PaddingValues paddingValues, Composer composer3, int i6) {
                    int i7;
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i6 & 6) == 0) {
                        i7 = (composer3.changed(paddingValues) ? 4 : 2) | i6;
                    } else {
                        i7 = i6;
                    }
                    if ((i7 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1130145822, i7, -1, "com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetails.<anonymous> (CreateTransferBonusRemovalDetails.kt:58)");
                    }
                    CreateTransferBonusRemovalDetailsViewState createTransferBonusRemovalDetailsViewState = viewState;
                    if (createTransferBonusRemovalDetailsViewState instanceof CreateTransferBonusRemovalDetailsViewState.Failure) {
                        composer3.startReplaceGroup(-74330604);
                        ErrorScreenComposable.ErrorScreenComposable(PaddingKt.padding(Modifier.INSTANCE, paddingValues), null, 0, null, null, null, null, false, composer3, 12582912, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                        composer3.endReplaceGroup();
                    } else {
                        if (!(createTransferBonusRemovalDetailsViewState instanceof CreateTransferBonusRemovalDetailsViewState.Content)) {
                            composer3.startReplaceGroup(-556589409);
                            composer3.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer3.startReplaceGroup(-74080868);
                        boolean loading = ((CreateTransferBonusRemovalDetailsViewState.Content) viewState).getLoading();
                        final CreateTransferBonusRemovalDetailsViewState createTransferBonusRemovalDetailsViewState2 = viewState;
                        LocalShowPlaceholder.Loadable(loading, null, null, ComposableLambda3.rememberComposableLambda(-1107593521, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsKt.CreateTransferBonusRemovalDetails.3.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i8) {
                                if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1107593521, i8, -1, "com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetails.<anonymous>.<anonymous> (CreateTransferBonusRemovalDetails.kt:70)");
                                }
                                CreateTransferBonusRemovalDetails6.CreateTransferBonusRemovalDetailsContent((CreateTransferBonusRemovalDetailsViewState.Content) createTransferBonusRemovalDetailsViewState2, PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer4, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 3072, 6);
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, i52, 504);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CreateTransferBonusRemovalDetailsToolbar(final CreateTransferBonusRemovalDetails4 createTransferBonusRemovalDetails4, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(796091549);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(createTransferBonusRemovalDetails4) : composerStartRestartGroup.changedInstance(createTransferBonusRemovalDetails4) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(796091549, i2, -1, "com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsToolbar (CreateTransferBonusRemovalDetails.kt:83)");
            }
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(CreateTransferBonusRemovalDetails.INSTANCE.m1694xdd45486f(), null, ComposableLambda3.rememberComposableLambda(361103710, true, new C73931(createTransferBonusRemovalDetails4), composerStartRestartGroup, 54), null, null, false, false, null, null, 0L, null, composerStartRestartGroup, 390, 0, 2042);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreateTransferBonusRemovalDetails6.CreateTransferBonusRemovalDetailsToolbar$lambda$1(createTransferBonusRemovalDetails4, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: CreateTransferBonusRemovalDetails.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsKt$CreateTransferBonusRemovalDetailsToolbar$1 */
    static final class C73931 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
        final /* synthetic */ CreateTransferBonusRemovalDetails4 $callbacks;

        C73931(CreateTransferBonusRemovalDetails4 createTransferBonusRemovalDetails4) {
            this.$callbacks = createTransferBonusRemovalDetails4;
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
                ComposerKt.traceEventStart(361103710, i, -1, "com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsToolbar.<anonymous> (CreateTransferBonusRemovalDetails.kt:86)");
            }
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.$callbacks);
            final CreateTransferBonusRemovalDetails4 createTransferBonusRemovalDetails4 = this.$callbacks;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsKt$CreateTransferBonusRemovalDetailsToolbar$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreateTransferBonusRemovalDetails6.C73931.invoke$lambda$1$lambda$0(createTransferBonusRemovalDetails4);
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
        public static final Unit invoke$lambda$1$lambda$0(CreateTransferBonusRemovalDetails4 createTransferBonusRemovalDetails4) {
            createTransferBonusRemovalDetails4.onBackButtonClick();
            return Unit.INSTANCE;
        }
    }

    private static final boolean CreateTransferBonusRemovalDetailsContentItem$lambda$10(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CreateTransferBonusRemovalDetailsContent(final CreateTransferBonusRemovalDetailsViewState.Content content, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(881018921);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(content) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(881018921, i3, -1, "com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsContent (CreateTransferBonusRemovalDetails.kt:96)");
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = (i3 & 14) != 4;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CreateTransferBonusRemovalDetails6.CreateTransferBonusRemovalDetailsContent$lambda$4$lambda$3(content, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i5 = (i3 >> 3) & 14;
                modifier3 = modifier4;
                LazyDslKt.LazyColumn(modifier3, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, i5, 510);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CreateTransferBonusRemovalDetails6.CreateTransferBonusRemovalDetailsContent$lambda$5(content, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i3 & 14) != 4) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CreateTransferBonusRemovalDetails6.CreateTransferBonusRemovalDetailsContent$lambda$4$lambda$3(content, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                int i52 = (i3 >> 3) & 14;
                modifier3 = modifier4;
                LazyDslKt.LazyColumn(modifier3, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, i52, 510);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTransferBonusRemovalDetailsContent$lambda$4$lambda$3(final CreateTransferBonusRemovalDetailsViewState.Content content, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1632867714, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsKt$CreateTransferBonusRemovalDetailsContent$1$1$1
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
                    ComposerKt.traceEventStart(-1632867714, i, -1, "com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsContent.<anonymous>.<anonymous>.<anonymous> (CreateTransferBonusRemovalDetails.kt:101)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                BentoText2.m20747BentoText38GnDrw(content.getTitle(), modifierM5144paddingVpY3zN4$default, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8184);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, CreateTransferBonusRemovalDetails.INSTANCE.m1693x7c883f30(), 3, null);
        final ImmutableList<CreateTransferBonusRemovalDetailsItem> bulletList = content.getBulletList();
        LazyColumn.items(bulletList.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsKt$CreateTransferBonusRemovalDetailsContent$lambda$4$lambda$3$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                bulletList.get(i);
                return null;
            }
        }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsKt$CreateTransferBonusRemovalDetailsContent$lambda$4$lambda$3$$inlined$itemsIndexed$default$3
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
                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                Object obj = bulletList.get(i);
                int i4 = i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
                composer.startReplaceGroup(1004923302);
                CreateTransferBonusRemovalDetails6.CreateTransferBonusRemovalDetailsContentItem(i, (CreateTransferBonusRemovalDetailsItem) obj, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer, ((i4 >> 3) & 14) | 384, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CreateTransferBonusRemovalDetailsBottomBar(final CreateTransferBonusRemovalDetails4 createTransferBonusRemovalDetails4, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(970156688);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(createTransferBonusRemovalDetails4) : composerStartRestartGroup.changedInstance(createTransferBonusRemovalDetails4) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(970156688, i2, -1, "com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsBottomBar (CreateTransferBonusRemovalDetails.kt:127)");
            }
            boolean z = true;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierFillMaxWidth$default, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM());
            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !composerStartRestartGroup.changedInstance(createTransferBonusRemovalDetails4))) {
                z = false;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreateTransferBonusRemovalDetails6.CreateTransferBonusRemovalDetailsBottomBar$lambda$7$lambda$6(createTransferBonusRemovalDetails4);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierM5143paddingVpY3zN4, null, null, false, false, null, null, null, null, false, null, composer2, 0, 0, 8184);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreateTransferBonusRemovalDetails6.CreateTransferBonusRemovalDetailsBottomBar$lambda$8(createTransferBonusRemovalDetails4, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTransferBonusRemovalDetailsBottomBar$lambda$7$lambda$6(CreateTransferBonusRemovalDetails4 createTransferBonusRemovalDetails4) {
        createTransferBonusRemovalDetails4.onBackButtonClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CreateTransferBonusRemovalDetailsContentItem(final int i, final CreateTransferBonusRemovalDetailsItem createTransferBonusRemovalDetailsItem, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(312695915);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(createTransferBonusRemovalDetailsItem) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 == 0) {
            if ((i2 & 384) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i4 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(312695915, i4, -1, "com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsContentItem (CreateTransferBonusRemovalDetails.kt:142)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.valueOf(i == 0), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                boolean zCreateTransferBonusRemovalDetailsContentItem$lambda$10 = CreateTransferBonusRemovalDetailsContentItem$lambda$10(snapshotState);
                BentoBaseRowState bentoBaseRowState = new BentoBaseRowState(new BentoBaseRowState.Start.NumberPog(i + 1), new BentoBaseRowState.Text.Plain(createTransferBonusRemovalDetailsItem.getTitle()), null, null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CreateTransferBonusRemovalDetails6.CreateTransferBonusRemovalDetailsContentItem$lambda$13$lambda$12(snapshotState, ((Boolean) obj).booleanValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoAccordionRow.BentoAccordionRow(modifier5, zCreateTransferBonusRemovalDetailsContentItem$lambda$10, bentoBaseRowState, (Function1) objRememberedValue2, ComposableLambda3.rememberComposableLambda(-1133388396, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsKt.CreateTransferBonusRemovalDetailsContentItem.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1133388396, i6, -1, "com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsContentItem.<anonymous> (CreateTransferBonusRemovalDetails.kt:153)");
                        }
                        BentoMarkdownText2.BentoMarkdownText(createTransferBonusRemovalDetailsItem.getContentMarkdown(), (Modifier) null, MarkdownStyle.m16260copyR0sFphs$default(BentoMarkdownText.INSTANCE.getStyle(composer2, BentoMarkdownText.$stable), null, null, null, null, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextM(), null, null, 0L, null, TextAlign.INSTANCE.m7924getStarte0LSkKk(), null, 1519, null), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, MarkdownStyle.$stable << 6, 26);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 6) & 14) | 27648 | (BentoBaseRowState.$stable << 6), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CreateTransferBonusRemovalDetails6.CreateTransferBonusRemovalDetailsContentItem$lambda$14(i, createTransferBonusRemovalDetailsItem, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 384;
        modifier2 = modifier;
        if ((i4 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifier52 = modifier4;
            boolean zCreateTransferBonusRemovalDetailsContentItem$lambda$102 = CreateTransferBonusRemovalDetailsContentItem$lambda$10(snapshotState2);
            BentoBaseRowState bentoBaseRowState2 = new BentoBaseRowState(new BentoBaseRowState.Start.NumberPog(i + 1), new BentoBaseRowState.Text.Plain(createTransferBonusRemovalDetailsItem.getTitle()), null, null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoAccordionRow.BentoAccordionRow(modifier52, zCreateTransferBonusRemovalDetailsContentItem$lambda$102, bentoBaseRowState2, (Function1) objRememberedValue2, ComposableLambda3.rememberComposableLambda(-1133388396, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsKt.CreateTransferBonusRemovalDetailsContentItem.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    if ((i6 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1133388396, i6, -1, "com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsContentItem.<anonymous> (CreateTransferBonusRemovalDetails.kt:153)");
                    }
                    BentoMarkdownText2.BentoMarkdownText(createTransferBonusRemovalDetailsItem.getContentMarkdown(), (Modifier) null, MarkdownStyle.m16260copyR0sFphs$default(BentoMarkdownText.INSTANCE.getStyle(composer2, BentoMarkdownText.$stable), null, null, null, null, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextM(), null, null, 0L, null, TextAlign.INSTANCE.m7924getStarte0LSkKk(), null, 1519, null), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, MarkdownStyle.$stable << 6, 26);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 6) & 14) | 27648 | (BentoBaseRowState.$stable << 6), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void CreateTransferBonusRemovalDetailsContentItem$lambda$11(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTransferBonusRemovalDetailsContentItem$lambda$13$lambda$12(SnapshotState snapshotState, boolean z) {
        CreateTransferBonusRemovalDetailsContentItem$lambda$11(snapshotState, z);
        return Unit.INSTANCE;
    }
}
