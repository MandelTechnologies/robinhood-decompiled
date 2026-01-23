package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcelable;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import com.robinhood.compose.bento.component.BentoChip;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.PageTemplate;
import com.robinhood.models.serverdriven.experimental.api.PaginatedListPageTemplate;
import com.robinhood.models.serverdriven.experimental.api.PaginatedListTabSection;
import com.robinhood.models.serverdriven.experimental.api.PaginatedListWithTabsPageTemplate;
import com.robinhood.models.serverdriven.experimental.api.SimplePageTemplate;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SduiPageTemplate.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\u001aB\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\tH\u0087\b¢\u0006\u0002\u0010\n\u001aM\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001a[\u0010\u000e\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0014\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0013\u0018\u00010\u00122\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\fH\u0003¢\u0006\u0002\u0010\u0014\u001aS\u0010\u0015\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\fH\u0003¢\u0006\u0002\u0010\u0016\u001a[\u0010\u0017\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0014\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0013\u0018\u00010\u00122\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\fH\u0003¢\u0006\u0002\u0010\u0014\u001aU\u0010\u0019\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u001a2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\fH\u0003¢\u0006\u0002\u0010\u001b\u001aU\u0010\u001c\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u001d2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\fH\u0003¢\u0006\u0002\u0010\u001e\u001aU\u0010\u001f\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020 2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\fH\u0003¢\u0006\u0002\u0010!\u001aA\u0010\"\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020 2\u0006\u0010#\u001a\u00020$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00010&H\u0003¢\u0006\u0002\u0010'¨\u0006(²\u0006\n\u0010#\u001a\u00020$X\u008a\u008e\u0002²\u0006\u0010\u0010)\u001a\b\u0012\u0004\u0012\u00020$0*X\u008a\u008e\u0002"}, m3636d2 = {"SduiPageTemplate", "", "ActionT", "Landroid/os/Parcelable;", "template", "Lcom/robinhood/models/serverdriven/experimental/api/PageTemplate;", "stateHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/StateHandler;", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "(Lcom/robinhood/models/serverdriven/experimental/api/PageTemplate;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/StateHandler;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Landroidx/compose/runtime/Composer;II)V", "actionClass", "Ljava/lang/Class;", "(Lcom/robinhood/models/serverdriven/experimental/api/PageTemplate;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/StateHandler;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Ljava/lang/Class;Landroidx/compose/runtime/Composer;II)V", "Header", "modifier", "Landroidx/compose/ui/Modifier;", "header", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "(Landroidx/compose/ui/Modifier;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/StateHandler;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Ljava/lang/Class;Landroidx/compose/runtime/Composer;I)V", "Content", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/api/PageTemplate;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/StateHandler;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Ljava/lang/Class;Landroidx/compose/runtime/Composer;I)V", "Footer", Footer.f10637type, "SduiSimplePageTemplate", "Lcom/robinhood/models/serverdriven/experimental/api/SimplePageTemplate;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/api/SimplePageTemplate;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/StateHandler;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Ljava/lang/Class;Landroidx/compose/runtime/Composer;II)V", "SduiPaginatedListPageTemplate", "Lcom/robinhood/models/serverdriven/experimental/api/PaginatedListPageTemplate;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/api/PaginatedListPageTemplate;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/StateHandler;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Ljava/lang/Class;Landroidx/compose/runtime/Composer;II)V", "SduiPaginatedListWithTabsPageTemplate", "Lcom/robinhood/models/serverdriven/experimental/api/PaginatedListWithTabsPageTemplate;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/api/PaginatedListWithTabsPageTemplate;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/StateHandler;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Ljava/lang/Class;Landroidx/compose/runtime/Composer;II)V", "Tabs", "selectedTabIndex", "", "onClick", "Lkotlin/Function1;", "(Lcom/robinhood/models/serverdriven/experimental/api/PaginatedListWithTabsPageTemplate;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "lib-sdui_externalRelease", "loadedTabs", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPageTemplateKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiPageTemplate {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$3(Modifier modifier, PageTemplate pageTemplate, SduiStateHandler3 sduiStateHandler3, SduiActionHandler sduiActionHandler, Class cls, int i, Composer composer, int i2) {
        Content(modifier, pageTemplate, sduiStateHandler3, sduiActionHandler, cls, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Footer$lambda$4(Modifier modifier, ImmutableList immutableList, SduiStateHandler3 sduiStateHandler3, SduiActionHandler sduiActionHandler, Class cls, int i, Composer composer, int i2) {
        Footer(modifier, immutableList, sduiStateHandler3, sduiActionHandler, cls, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Header$lambda$2(Modifier modifier, ImmutableList immutableList, SduiStateHandler3 sduiStateHandler3, SduiActionHandler sduiActionHandler, Class cls, int i, Composer composer, int i2) {
        Header(modifier, immutableList, sduiStateHandler3, sduiActionHandler, cls, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiPageTemplate$lambda$1(PageTemplate pageTemplate, SduiStateHandler3 sduiStateHandler3, SduiActionHandler sduiActionHandler, Class cls, int i, int i2, Composer composer, int i3) {
        SduiPageTemplate(pageTemplate, sduiStateHandler3, sduiActionHandler, cls, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiPaginatedListPageTemplate$lambda$6(Modifier modifier, PaginatedListPageTemplate paginatedListPageTemplate, SduiStateHandler3 sduiStateHandler3, SduiActionHandler sduiActionHandler, Class cls, int i, int i2, Composer composer, int i3) {
        SduiPaginatedListPageTemplate(modifier, paginatedListPageTemplate, sduiStateHandler3, sduiActionHandler, cls, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiPaginatedListWithTabsPageTemplate$lambda$17(Modifier modifier, PaginatedListWithTabsPageTemplate paginatedListWithTabsPageTemplate, SduiStateHandler3 sduiStateHandler3, SduiActionHandler sduiActionHandler, Class cls, int i, int i2, Composer composer, int i3) {
        SduiPaginatedListWithTabsPageTemplate(modifier, paginatedListWithTabsPageTemplate, sduiStateHandler3, sduiActionHandler, cls, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiSimplePageTemplate$lambda$5(Modifier modifier, SimplePageTemplate simplePageTemplate, SduiStateHandler3 sduiStateHandler3, SduiActionHandler sduiActionHandler, Class cls, int i, int i2, Composer composer, int i3) {
        SduiSimplePageTemplate(modifier, simplePageTemplate, sduiStateHandler3, sduiActionHandler, cls, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Tabs$lambda$21(PaginatedListWithTabsPageTemplate paginatedListWithTabsPageTemplate, int i, Function1 function1, int i2, Composer composer, int i3) {
        Tabs(paginatedListWithTabsPageTemplate, i, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ <ActionT extends Parcelable> void SduiPageTemplate(PageTemplate<? extends ActionT> template, SduiStateHandler3 sduiStateHandler3, SduiActionHandler<? super ActionT> actionHandler, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        composer.startReplaceGroup(-971110865);
        if ((i2 & 2) != 0) {
            sduiStateHandler3 = null;
        }
        Intrinsics.reifiedOperationMarker(4, "ActionT");
        SduiPageTemplate(template, sduiStateHandler3, actionHandler, Parcelable.class, composer, i & 1022, 0);
        composer.endReplaceGroup();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiPageTemplate(final PageTemplate<? extends ActionT> template, SduiStateHandler3 sduiStateHandler3, final SduiActionHandler<? super ActionT> actionHandler, final Class<ActionT> actionClass, Composer composer, final int i, final int i2) {
        int i3;
        SduiStateHandler3 sduiStateHandler32;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final SduiStateHandler3 sduiStateHandler33;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(actionClass, "actionClass");
        Composer composerStartRestartGroup = composer.startRestartGroup(1309327323);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(template) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                sduiStateHandler32 = sduiStateHandler3;
                i3 |= composerStartRestartGroup.changed(sduiStateHandler32) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(actionHandler) : composerStartRestartGroup.changedInstance(actionHandler) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(actionClass) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    sduiStateHandler32 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1309327323, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPageTemplate (SduiPageTemplate.kt:59)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
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
                int i5 = i3;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                List<UIComponent<ActionT>> header = template.getHeader();
                int i6 = i5 << 3;
                SduiStateHandler3 sduiStateHandler34 = sduiStateHandler32;
                Header(modifierFillMaxWidth$default, header == null ? extensions2.toPersistentList(header) : null, sduiStateHandler34, actionHandler, actionClass, composerStartRestartGroup, (i6 & 896) | 6 | (i6 & 7168) | (57344 & i6));
                sduiStateHandler33 = sduiStateHandler34;
                composerStartRestartGroup = composerStartRestartGroup;
                Content(SizeKt.fillMaxWidth$default(Column5.weight$default(column6, companion, 1.0f, false, 2, null), 0.0f, 1, null), template, sduiStateHandler33, actionHandler, actionClass, composerStartRestartGroup, i6 & 65520);
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(WindowInsetsPadding_androidKt.navigationBarsPadding(WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null))), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 7, null);
                List<UIComponent<ActionT>> footer = template.getFooter();
                Footer(modifierM5146paddingqDBjuR0$default, footer != null ? extensions2.toPersistentList(footer) : null, sduiStateHandler33, actionHandler, actionClass, composerStartRestartGroup, i6 & 65408);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                sduiStateHandler33 = sduiStateHandler32;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPageTemplateKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiPageTemplate.SduiPageTemplate$lambda$1(template, sduiStateHandler33, actionHandler, actionClass, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        sduiStateHandler32 = sduiStateHandler3;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 1171) == 1170) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
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
                int i52 = i3;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                List<UIComponent<ActionT>> header2 = template.getHeader();
                int i62 = i52 << 3;
                SduiStateHandler3 sduiStateHandler342 = sduiStateHandler32;
                Header(modifierFillMaxWidth$default2, header2 == null ? extensions2.toPersistentList(header2) : null, sduiStateHandler342, actionHandler, actionClass, composerStartRestartGroup, (i62 & 896) | 6 | (i62 & 7168) | (57344 & i62));
                sduiStateHandler33 = sduiStateHandler342;
                composerStartRestartGroup = composerStartRestartGroup;
                Content(SizeKt.fillMaxWidth$default(Column5.weight$default(column62, companion3, 1.0f, false, 2, null), 0.0f, 1, null), template, sduiStateHandler33, actionHandler, actionClass, composerStartRestartGroup, i62 & 65520);
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(WindowInsetsPadding_androidKt.navigationBarsPadding(WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null))), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 7, null);
                List<UIComponent<ActionT>> footer2 = template.getFooter();
                Footer(modifierM5146paddingqDBjuR0$default2, footer2 != null ? extensions2.toPersistentList(footer2) : null, sduiStateHandler33, actionHandler, actionClass, composerStartRestartGroup, i62 & 65408);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final Set<Integer> SduiPaginatedListWithTabsPageTemplate$lambda$11(SnapshotState<Set<Integer>> snapshotState) {
        return snapshotState.getValue();
    }

    private static final <ActionT extends Parcelable> void Header(final Modifier modifier, final ImmutableList<? extends UIComponent<? extends ActionT>> immutableList, final SduiStateHandler3 sduiStateHandler3, final SduiActionHandler<? super ActionT> sduiActionHandler, final Class<ActionT> cls, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1696654360);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(immutableList) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(sduiStateHandler3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(sduiActionHandler) : composerStartRestartGroup.changedInstance(sduiActionHandler) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(cls) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1696654360, i2, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.Header (SduiPageTemplate.kt:98)");
            }
            boolean z = false;
            if (immutableList != null && (!immutableList.isEmpty())) {
                z = true;
            }
            if (z) {
                int i3 = ((i2 >> 3) & 14) | 100663296 | ((i2 >> 9) & 112) | ((i2 << 6) & 896);
                int i4 = i2 << 3;
                SduiColumns.SduiColumn(immutableList, cls, modifier, sduiStateHandler3, sduiActionHandler, null, null, null, true, composerStartRestartGroup, i3 | (i4 & 7168) | (i4 & 57344), 224);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPageTemplateKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiPageTemplate.Header$lambda$2(modifier, immutableList, sduiStateHandler3, sduiActionHandler, cls, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final <ActionT extends Parcelable> void Content(Modifier modifier, final PageTemplate<? extends ActionT> pageTemplate, SduiStateHandler3 sduiStateHandler3, SduiActionHandler<? super ActionT> sduiActionHandler, Class<ActionT> cls, Composer composer, final int i) {
        int i2;
        SduiStateHandler3 sduiStateHandler32;
        SduiActionHandler<? super ActionT> sduiActionHandler2;
        Class<ActionT> cls2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-733586769);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(pageTemplate) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(sduiStateHandler3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(sduiActionHandler) : composerStartRestartGroup.changedInstance(sduiActionHandler) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(cls) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-733586769, i2, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.Content (SduiPageTemplate.kt:118)");
            }
            if (pageTemplate instanceof SimplePageTemplate) {
                composerStartRestartGroup.startReplaceGroup(-602239123);
                modifier2 = modifier;
                sduiStateHandler32 = sduiStateHandler3;
                sduiActionHandler2 = sduiActionHandler;
                cls2 = cls;
                SduiSimplePageTemplate(modifier2, (SimplePageTemplate) pageTemplate, sduiStateHandler32, sduiActionHandler2, cls2, composerStartRestartGroup, i2 & 65422, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                sduiStateHandler32 = sduiStateHandler3;
                sduiActionHandler2 = sduiActionHandler;
                cls2 = cls;
                if (pageTemplate instanceof PaginatedListPageTemplate) {
                    composerStartRestartGroup.startReplaceGroup(-602230668);
                    modifier2 = modifier;
                    SduiPaginatedListPageTemplate(modifier2, (PaginatedListPageTemplate) pageTemplate, sduiStateHandler32, sduiActionHandler2, cls2, composerStartRestartGroup, i2 & 65422, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!(pageTemplate instanceof PaginatedListWithTabsPageTemplate)) {
                        composerStartRestartGroup.startReplaceGroup(-602240140);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-602221732);
                    modifier2 = modifier;
                    SduiPaginatedListWithTabsPageTemplate(modifier2, (PaginatedListWithTabsPageTemplate) pageTemplate, sduiStateHandler32, sduiActionHandler2, cls2, composerStartRestartGroup, i2 & 65422, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            sduiStateHandler32 = sduiStateHandler3;
            sduiActionHandler2 = sduiActionHandler;
            cls2 = cls;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            final SduiStateHandler3 sduiStateHandler33 = sduiStateHandler32;
            final SduiActionHandler<? super ActionT> sduiActionHandler3 = sduiActionHandler2;
            final Class<ActionT> cls3 = cls2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPageTemplateKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiPageTemplate.Content$lambda$3(modifier3, pageTemplate, sduiStateHandler33, sduiActionHandler3, cls3, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final <ActionT extends Parcelable> void Footer(final Modifier modifier, final ImmutableList<? extends UIComponent<? extends ActionT>> immutableList, final SduiStateHandler3 sduiStateHandler3, final SduiActionHandler<? super ActionT> sduiActionHandler, final Class<ActionT> cls, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-337933658);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(immutableList) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(sduiStateHandler3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(sduiActionHandler) : composerStartRestartGroup.changedInstance(sduiActionHandler) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(cls) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-337933658, i2, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.Footer (SduiPageTemplate.kt:153)");
            }
            boolean z = false;
            if (immutableList != null && (!immutableList.isEmpty())) {
                z = true;
            }
            if (z) {
                int i3 = ((i2 >> 3) & 14) | 100663296 | ((i2 >> 9) & 112) | ((i2 << 6) & 896);
                int i4 = i2 << 3;
                SduiColumns.SduiColumn(immutableList, cls, modifier, sduiStateHandler3, sduiActionHandler, null, null, null, true, composerStartRestartGroup, i3 | (i4 & 7168) | (i4 & 57344), 224);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPageTemplateKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiPageTemplate.Footer$lambda$4(modifier, immutableList, sduiStateHandler3, sduiActionHandler, cls, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final <ActionT extends Parcelable> void SduiSimplePageTemplate(Modifier modifier, SimplePageTemplate<? extends ActionT> simplePageTemplate, final SduiStateHandler3 sduiStateHandler3, final SduiActionHandler<? super ActionT> sduiActionHandler, final Class<ActionT> cls, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        SimplePageTemplate<? extends ActionT> simplePageTemplate2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-550286310);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
            simplePageTemplate2 = simplePageTemplate;
        } else {
            simplePageTemplate2 = simplePageTemplate;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(simplePageTemplate2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(sduiStateHandler3) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(sduiActionHandler) : composerStartRestartGroup.changedInstance(sduiActionHandler) ? 2048 : 1024;
            }
            if ((i2 & 16) != 0) {
                if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(cls) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-550286310, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiSimplePageTemplate (SduiPageTemplate.kt:173)");
                    }
                    int i5 = ((i3 >> 9) & 112) | 100663296;
                    int i6 = i3 << 3;
                    SduiColumns.SduiColumn(extensions2.toPersistentList(simplePageTemplate2.getBody()), cls, ScrollKt.verticalScroll$default(modifier4, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), sduiStateHandler3, sduiActionHandler, null, null, null, true, composerStartRestartGroup, i5 | (i6 & 7168) | (i6 & 57344), 224);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final SimplePageTemplate<? extends ActionT> simplePageTemplate3 = simplePageTemplate2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPageTemplateKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SduiPageTemplate.SduiSimplePageTemplate$lambda$5(modifier3, simplePageTemplate3, sduiStateHandler3, sduiActionHandler, cls, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            if ((i3 & 9363) != 9362) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i52 = ((i3 >> 9) & 112) | 100663296;
                int i62 = i3 << 3;
                SduiColumns.SduiColumn(extensions2.toPersistentList(simplePageTemplate2.getBody()), cls, ScrollKt.verticalScroll$default(modifier4, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), sduiStateHandler3, sduiActionHandler, null, null, null, true, composerStartRestartGroup, i52 | (i62 & 7168) | (i62 & 57344), 224);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final <ActionT extends Parcelable> void SduiPaginatedListPageTemplate(Modifier modifier, final PaginatedListPageTemplate<? extends ActionT> paginatedListPageTemplate, final SduiStateHandler3 sduiStateHandler3, final SduiActionHandler<? super ActionT> sduiActionHandler, final Class<ActionT> cls, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1770870902);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(paginatedListPageTemplate) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(sduiStateHandler3) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(sduiActionHandler) : composerStartRestartGroup.changedInstance(sduiActionHandler) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(cls) ? 16384 : 8192;
        }
        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1770870902, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPaginatedListPageTemplate (SduiPageTemplate.kt:191)");
            }
            int i5 = ((i3 >> 9) & 112) | 100663296 | ((i3 << 6) & 896);
            int i6 = i3 << 3;
            int i7 = i5 | (i6 & 7168) | (i6 & 57344);
            Modifier modifier3 = modifier;
            SduiColumns.SduiColumn(extensions2.persistentListOf(paginatedListPageTemplate.getPaginated_list()), cls, modifier3, sduiStateHandler3, sduiActionHandler, null, null, null, true, composerStartRestartGroup, i7, 224);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPageTemplateKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiPageTemplate.SduiPaginatedListPageTemplate$lambda$6(modifier2, paginatedListPageTemplate, sduiStateHandler3, sduiActionHandler, cls, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final <ActionT extends Parcelable> void SduiPaginatedListWithTabsPageTemplate(Modifier modifier, final PaginatedListWithTabsPageTemplate<? extends ActionT> paginatedListWithTabsPageTemplate, final SduiStateHandler3 sduiStateHandler3, final SduiActionHandler<? super ActionT> sduiActionHandler, final Class<ActionT> cls, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        int i4;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue3;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Iterator<Integer> it;
        final Modifier modifier3;
        boolean z;
        Modifier modifierM5162requiredSize3ABfNKs;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-977881334);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(paginatedListWithTabsPageTemplate) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(sduiStateHandler3) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(sduiActionHandler) : composerStartRestartGroup.changedInstance(sduiActionHandler) ? 2048 : 1024;
            }
            if ((i2 & 16) != 0) {
                if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(cls) ? 16384 : 8192;
                }
                i4 = i3;
                if ((i4 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-977881334, i4, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPaginatedListWithTabsPageTemplate (SduiPageTemplate.kt:209)");
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotIntState3.mutableIntStateOf(paginatedListWithTabsPageTemplate.getInitial_tab_index());
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotState3.mutableStateOf$default(SetsKt.setOf(Integer.valueOf(paginatedListWithTabsPageTemplate.getInitial_tab_index())), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    final SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    int intValue = snapshotIntState2.getIntValue();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPageTemplateKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SduiPageTemplate.m2157x318cbd48(snapshotIntState2, snapshotState, ((Integer) obj).intValue());
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Tabs(paginatedListWithTabsPageTemplate, intValue, (Function1) objRememberedValue3, composerStartRestartGroup, ((i4 >> 3) & 14) | 384);
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion4);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-586353782);
                    it = SduiPaginatedListWithTabsPageTemplate$lambda$11(snapshotState).iterator();
                    while (it.hasNext()) {
                        int iIntValue = it.next().intValue();
                        PaginatedListTabSection<ActionT> paginatedListTabSection = paginatedListWithTabsPageTemplate.getTab_content().get(iIntValue);
                        if (iIntValue == snapshotIntState2.getIntValue()) {
                            modifierM5162requiredSize3ABfNKs = Modifier.INSTANCE;
                            z = false;
                        } else {
                            z = false;
                            modifierM5162requiredSize3ABfNKs = SizeKt.m5162requiredSize3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(0));
                        }
                        int i6 = i4 << 3;
                        SduiColumns.SduiColumn(extensions2.persistentListOf(paginatedListTabSection.getPaginated_list()), cls, modifier4.then(modifierM5162requiredSize3ABfNKs), sduiStateHandler3, sduiActionHandler, null, null, null, true, composerStartRestartGroup, ((i4 >> 9) & 112) | 100663296 | (i6 & 7168) | (i6 & 57344), 224);
                        modifier4 = modifier4;
                        snapshotIntState2 = snapshotIntState2;
                    }
                    modifier3 = modifier4;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPageTemplateKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SduiPageTemplate.SduiPaginatedListWithTabsPageTemplate$lambda$17(modifier3, paginatedListWithTabsPageTemplate, sduiStateHandler3, sduiActionHandler, cls, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            i4 = i3;
            if ((i4 & 9363) == 9362) {
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                final SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion22 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    int intValue2 = snapshotIntState22.getIntValue();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Tabs(paginatedListWithTabsPageTemplate, intValue2, (Function1) objRememberedValue3, composerStartRestartGroup, ((i4 >> 3) & 14) | 384);
                    Modifier.Companion companion42 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), false);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion42);
                    Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-586353782);
                        it = SduiPaginatedListWithTabsPageTemplate$lambda$11(snapshotState2).iterator();
                        while (it.hasNext()) {
                        }
                        modifier3 = modifier4;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        i4 = i3;
        if ((i4 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SduiPaginatedListWithTabsPageTemplate$lambda$16$lambda$14$lambda$13 */
    public static final Unit m2157x318cbd48(SnapshotIntState2 snapshotIntState2, SnapshotState snapshotState, int i) {
        snapshotIntState2.setIntValue(i);
        snapshotState.setValue(SetsKt.plus(SduiPaginatedListWithTabsPageTemplate$lambda$11(snapshotState), Integer.valueOf(i)));
        return Unit.INSTANCE;
    }

    private static final <ActionT extends Parcelable> void Tabs(final PaginatedListWithTabsPageTemplate<? extends ActionT> paginatedListWithTabsPageTemplate, final int i, final Function1<? super Integer, Unit> function1, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-543073821);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(paginatedListWithTabsPageTemplate) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i4 = i3;
        if ((i4 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-543073821, i4, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.Tabs (SduiPageTemplate.kt:252)");
            }
            boolean z = true;
            Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(Modifier.INSTANCE, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifierHorizontalScroll$default, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM());
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-286388615);
            Iterator<T> it = paginatedListWithTabsPageTemplate.getTab_content().iterator();
            final int i6 = 0;
            while (it.hasNext()) {
                int i7 = i6 + 1;
                String tab_title = ((PaginatedListTabSection) it.next()).getTab_title();
                boolean z2 = i6 == i ? z : false;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChanged = ((i4 & 896) == 256 ? z : false) | composerStartRestartGroup.changed(i6);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPageTemplateKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SduiPageTemplate.Tabs$lambda$20$lambda$19$lambda$18(function1, i6);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoChip.BentoSelectionChip((Function0) objRememberedValue, null, false, z2, null, tab_title, composerStartRestartGroup, 0, 22);
                i6 = i7;
                z = z;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPageTemplateKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiPageTemplate.Tabs$lambda$21(paginatedListWithTabsPageTemplate, i, function1, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Tabs$lambda$20$lambda$19$lambda$18(Function1 function1, int i) {
        function1.invoke(Integer.valueOf(i));
        return Unit.INSTANCE;
    }
}
