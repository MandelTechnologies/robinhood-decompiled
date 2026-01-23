package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcelable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.beneficiaries.p067ui.detail.BeneficiaryDetailCompose2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.models.serverdriven.experimental.api.RelativeHeightContainer;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SduiColumns.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u001at\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0087\b¢\u0006\u0002\u0010\u0013\u001at\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00060\u00152\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0087\b¢\u0006\u0002\u0010\u0016\u001a\u007f\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00060\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00182\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\u0010\u0019\u001aU\u0010\u001a\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u001b2\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00060\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0086\b\u001aU\u0010\u001a\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u001b2\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00060\u00152\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0086\b\u001a`\u0010\u001a\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u001b2\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00060\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00182\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0001\u001aG\u0010\u001c\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u001f\u001a~\u0010 \u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0087\b¢\u0006\u0002\u0010%\u001aj\u0010 \u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00060\u00152\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0087\b¢\u0006\u0002\u0010&\u001a\u0089\u0001\u0010 \u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00060\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00182\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\u0010'\u001a3\u0010(\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030*0)\"\u0004\b\u0000\u0010\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00182\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010+¨\u0006,"}, m3636d2 = {"SduiLazyColumn", "", "ActionT", "Landroid/os/Parcelable;", "components", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "modifier", "Landroidx/compose/ui/Modifier;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "stateHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/StateHandler;", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "horizontalPadding", "Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;", "childFillMaxWidth", "", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/StateHandler;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;ZLandroidx/compose/runtime/Composer;II)V", "componentsSuboptimal", "", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/StateHandler;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;ZLandroidx/compose/runtime/Composer;II)V", "actionClass", "Ljava/lang/Class;", "(Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/Class;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/StateHandler;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;ZLandroidx/compose/runtime/Composer;II)V", "sduiItems", "Landroidx/compose/foundation/lazy/LazyListScope;", "LazySduiComponent", "Landroidx/compose/foundation/lazy/LazyItemScope;", "component", "(Landroidx/compose/foundation/lazy/LazyItemScope;Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;ZLandroidx/compose/runtime/Composer;II)V", BeneficiaryDetailCompose2.BENEFICIARY_DETAIL_SDUI_COLUMN, "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/StateHandler;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ZLandroidx/compose/runtime/Composer;II)V", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/StateHandler;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;ZLandroidx/compose/runtime/Composer;II)V", "(Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/Class;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/StateHandler;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ZLandroidx/compose/runtime/Composer;II)V", "providedValues", "", "Landroidx/compose/runtime/ProvidedValue;", "(Ljava/lang/Class;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/StateHandler;)[Landroidx/compose/runtime/ProvidedValue;", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class SduiColumns {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LazySduiComponent$lambda$2(LazyItemScope lazyItemScope, UIComponent uIComponent, Modifier modifier, HorizontalPadding horizontalPadding, boolean z, int i, int i2, Composer composer, int i3) {
        LazySduiComponent(lazyItemScope, uIComponent, modifier, horizontalPadding, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiColumn$lambda$3(ImmutableList immutableList, Class cls, Modifier modifier, SduiStateHandler3 sduiStateHandler3, SduiActionHandler sduiActionHandler, HorizontalPadding horizontalPadding, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, boolean z, int i, int i2, Composer composer, int i3) {
        SduiColumn(immutableList, cls, modifier, sduiStateHandler3, sduiActionHandler, horizontalPadding, vertical, horizontal, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiLazyColumn$lambda$0(ImmutableList immutableList, Class cls, Modifier modifier, LazyListState lazyListState, SduiStateHandler3 sduiStateHandler3, SduiActionHandler sduiActionHandler, HorizontalPadding horizontalPadding, boolean z, int i, int i2, Composer composer, int i3) {
        SduiLazyColumn(immutableList, cls, modifier, lazyListState, sduiStateHandler3, sduiActionHandler, horizontalPadding, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ <ActionT extends Parcelable> void SduiLazyColumn(ImmutableList<? extends UIComponent<? extends ActionT>> components, Modifier modifier, LazyListState lazyListState, SduiStateHandler3 sduiStateHandler3, SduiActionHandler<? super ActionT> sduiActionHandler, HorizontalPadding horizontalPadding, boolean z, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(components, "components");
        composer.startReplaceGroup(767440808);
        if ((i2 & 2) != 0) {
            modifier = Modifier.INSTANCE;
        }
        Modifier modifier2 = modifier;
        if ((i2 & 4) != 0) {
            lazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer, 0, 3);
        }
        LazyListState lazyListState2 = lazyListState;
        SduiStateHandler3 sduiStateHandler32 = (i2 & 8) != 0 ? null : sduiStateHandler3;
        SduiActionHandler<? super ActionT> sduiActionHandler2 = (i2 & 16) != 0 ? null : sduiActionHandler;
        HorizontalPadding horizontalPadding2 = (i2 & 32) != 0 ? HorizontalPadding.Default : horizontalPadding;
        boolean z2 = (i2 & 64) != 0 ? false : z;
        Intrinsics.reifiedOperationMarker(4, "ActionT");
        int i3 = i << 3;
        SduiLazyColumn(components, Parcelable.class, modifier2, lazyListState2, sduiStateHandler32, sduiActionHandler2, horizontalPadding2, z2, composer, (i & 14) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128), 0);
        composer.endReplaceGroup();
    }

    public static final /* synthetic */ <ActionT extends Parcelable> void SduiLazyColumn(List<? extends UIComponent<? extends ActionT>> componentsSuboptimal, Modifier modifier, LazyListState lazyListState, SduiStateHandler3 sduiStateHandler3, SduiActionHandler<? super ActionT> sduiActionHandler, HorizontalPadding horizontalPadding, boolean z, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(componentsSuboptimal, "componentsSuboptimal");
        composer.startReplaceGroup(1076610452);
        if ((i2 & 2) != 0) {
            modifier = Modifier.INSTANCE;
        }
        Modifier modifier2 = modifier;
        if ((i2 & 4) != 0) {
            lazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer, 0, 3);
        }
        LazyListState lazyListState2 = lazyListState;
        SduiStateHandler3 sduiStateHandler32 = (i2 & 8) != 0 ? null : sduiStateHandler3;
        SduiActionHandler<? super ActionT> sduiActionHandler2 = (i2 & 16) != 0 ? null : sduiActionHandler;
        HorizontalPadding horizontalPadding2 = (i2 & 32) != 0 ? HorizontalPadding.Default : horizontalPadding;
        boolean z2 = (i2 & 64) != 0 ? false : z;
        ImmutableList3 persistentList = extensions2.toPersistentList(componentsSuboptimal);
        composer.startReplaceGroup(767440808);
        Intrinsics.reifiedOperationMarker(4, "ActionT");
        SduiLazyColumn(persistentList, Parcelable.class, modifier2, lazyListState2, sduiStateHandler32, sduiActionHandler2, horizontalPadding2, z2, composer, ((i & 4194288) << 3) & 33554304, 0);
        composer.endReplaceGroup();
        composer.endReplaceGroup();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2 A[PHI: r14
      0x00a2: PHI (r14v10 int) = (r14v0 int), (r14v6 int), (r14v7 int) binds: [B:57:0x00a0, B:67:0x00ba, B:66:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011d  */
    @PublishedApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiLazyColumn(final ImmutableList<? extends UIComponent<? extends ActionT>> components, final Class<ActionT> actionClass, Modifier modifier, LazyListState lazyListState, SduiStateHandler3 sduiStateHandler3, SduiActionHandler<? super ActionT> sduiActionHandler, HorizontalPadding horizontalPadding, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        LazyListState lazyListStateRememberLazyListState;
        int i4;
        SduiStateHandler3 sduiStateHandler32;
        int i5;
        int i6;
        int i7;
        boolean z2;
        SduiActionHandler<? super ActionT> sduiActionHandler2;
        HorizontalPadding horizontalPadding2;
        final Modifier modifier3;
        final HorizontalPadding horizontalPadding3;
        final SduiActionHandler<? super ActionT> sduiActionHandler3;
        final SduiStateHandler3 sduiStateHandler33;
        Composer composer2;
        final LazyListState lazyListState2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(actionClass, "actionClass");
        Composer composerStartRestartGroup = composer.startRestartGroup(313493052);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(components) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(actionClass) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    lazyListStateRememberLazyListState = lazyListState;
                    int i9 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) ? 2048 : 1024;
                    i3 |= i9;
                } else {
                    lazyListStateRememberLazyListState = lazyListState;
                }
                i3 |= i9;
            } else {
                lazyListStateRememberLazyListState = lazyListState;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    sduiStateHandler32 = sduiStateHandler3;
                    i3 |= composerStartRestartGroup.changed(sduiStateHandler32) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                int i10 = 196608;
                if (i5 != 0) {
                    i3 |= i10;
                } else if ((196608 & i) == 0) {
                    i10 = (262144 & i) == 0 ? composerStartRestartGroup.changed(sduiActionHandler) : composerStartRestartGroup.changedInstance(sduiActionHandler) ? 131072 : 65536;
                    i3 |= i10;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 1048576 : 524288;
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    i3 |= 12582912;
                    z2 = z;
                } else {
                    z2 = z;
                    if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
                    }
                }
                if ((i3 & 4793491) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i4 != 0) {
                            sduiStateHandler32 = null;
                        }
                        sduiActionHandler2 = i5 == 0 ? sduiActionHandler : null;
                        horizontalPadding2 = i6 == 0 ? HorizontalPadding.Default : horizontalPadding;
                        if (i7 != 0) {
                            z2 = false;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        sduiActionHandler2 = sduiActionHandler;
                        horizontalPadding2 = horizontalPadding;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(313493052, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiLazyColumn (SduiColumns.kt:82)");
                    }
                    ProvidedValue<?>[] providedValueArrProvidedValues = providedValues(actionClass, sduiStateHandler32);
                    final SduiActionHandler<? super ActionT> sduiActionHandler4 = sduiActionHandler2;
                    final HorizontalPadding horizontalPadding4 = horizontalPadding2;
                    final Modifier modifier4 = modifier2;
                    final LazyListState lazyListState3 = lazyListStateRememberLazyListState;
                    final boolean z3 = z2;
                    CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) Arrays.copyOf(providedValueArrProvidedValues, providedValueArrProvidedValues.length), ComposableLambda3.rememberComposableLambda(-1105327364, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsKt.SduiLazyColumn.1

                        /* compiled from: SduiColumns.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsKt$SduiLazyColumn$1$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ boolean $childFillMaxWidth;
                            final /* synthetic */ ImmutableList<UIComponent<ActionT>> $components;
                            final /* synthetic */ HorizontalPadding $horizontalPadding;
                            final /* synthetic */ LazyListState $lazyListState;
                            final /* synthetic */ Modifier $modifier;

                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass1(Modifier modifier, LazyListState lazyListState, ImmutableList<? extends UIComponent<? extends ActionT>> immutableList, HorizontalPadding horizontalPadding, boolean z) {
                                this.$modifier = modifier;
                                this.$lazyListState = lazyListState;
                                this.$components = immutableList;
                                this.$horizontalPadding = horizontalPadding;
                                this.$childFillMaxWidth = z;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer, int i) {
                                if ((i & 3) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1538328221, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiLazyColumn.<anonymous>.<anonymous> (SduiColumns.kt:90)");
                                }
                                Modifier modifier = this.$modifier;
                                LazyListState lazyListState = this.$lazyListState;
                                composer.startReplaceGroup(-1746271574);
                                boolean zChangedInstance = composer.changedInstance(this.$components) | composer.changed(this.$horizontalPadding.ordinal()) | composer.changed(this.$childFillMaxWidth);
                                final ImmutableList<UIComponent<ActionT>> immutableList = this.$components;
                                final HorizontalPadding horizontalPadding = this.$horizontalPadding;
                                final boolean z = this.$childFillMaxWidth;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsKt$SduiLazyColumn$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return SduiColumns.C207351.AnonymousClass1.invoke$lambda$2$lambda$1(immutableList, horizontalPadding, z, (LazyListScope) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                LazyDslKt.LazyColumn(modifier, lazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 508);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$2$lambda$1(final ImmutableList immutableList, final HorizontalPadding horizontalPadding, final boolean z, LazyListScope LazyColumn) {
                                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                final C20730x4ad6caa2 c20730x4ad6caa2 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsKt$SduiLazyColumn$1$1$invoke$lambda$2$lambda$1$$inlined$items$default$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Void invoke(UIComponent<? extends ActionT> uIComponent) {
                                        return null;
                                    }
                                };
                                LazyColumn.items(immutableList.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsKt$SduiLazyColumn$1$1$invoke$lambda$2$lambda$1$$inlined$items$default$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                        return invoke(num.intValue());
                                    }

                                    public final Object invoke(int i) {
                                        return c20730x4ad6caa2.invoke(immutableList.get(i));
                                    }
                                }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsKt$SduiLazyColumn$1$1$invoke$lambda$2$lambda$1$$inlined$items$default$4
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
                                        UIComponent uIComponent = (UIComponent) immutableList.get(i);
                                        composer.startReplaceGroup(-1996329191);
                                        SduiColumns.LazySduiComponent(lazyItemScope, uIComponent, null, horizontalPadding, z, composer, i3 & 14, 2);
                                        composer.endReplaceGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }));
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i11) {
                            if ((i11 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1105327364, i11, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiLazyColumn.<anonymous> (SduiColumns.kt:89)");
                            }
                            SduiActionHandler3.ProvideActionHandler(sduiActionHandler4, ComposableLambda3.rememberComposableLambda(1538328221, true, new AnonymousClass1(modifier4, lazyListState3, components, horizontalPadding4, z3), composer3, 54), composer3, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    horizontalPadding3 = horizontalPadding2;
                    sduiActionHandler3 = sduiActionHandler2;
                    sduiStateHandler33 = sduiStateHandler32;
                    composer2 = composerStartRestartGroup;
                    lazyListState2 = lazyListStateRememberLazyListState;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    sduiActionHandler3 = sduiActionHandler;
                    modifier3 = modifier2;
                    horizontalPadding3 = horizontalPadding;
                    composer2 = composerStartRestartGroup;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    sduiStateHandler33 = sduiStateHandler32;
                }
                final boolean z4 = z2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SduiColumns.SduiLazyColumn$lambda$0(components, actionClass, modifier3, lazyListState2, sduiStateHandler33, sduiActionHandler3, horizontalPadding3, z4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            sduiStateHandler32 = sduiStateHandler3;
            i5 = i2 & 32;
            int i102 = 196608;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if ((i3 & 4793491) != 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                    }
                    if ((i2 & 8) != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 != 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ProvidedValue<?>[] providedValueArrProvidedValues2 = providedValues(actionClass, sduiStateHandler32);
                    final SduiActionHandler<? super ActionT> sduiActionHandler42 = sduiActionHandler2;
                    final HorizontalPadding horizontalPadding42 = horizontalPadding2;
                    final Modifier modifier42 = modifier2;
                    final LazyListState lazyListState32 = lazyListStateRememberLazyListState;
                    final boolean z32 = z2;
                    CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) Arrays.copyOf(providedValueArrProvidedValues2, providedValueArrProvidedValues2.length), ComposableLambda3.rememberComposableLambda(-1105327364, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsKt.SduiLazyColumn.1

                        /* compiled from: SduiColumns.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsKt$SduiLazyColumn$1$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ boolean $childFillMaxWidth;
                            final /* synthetic */ ImmutableList<UIComponent<ActionT>> $components;
                            final /* synthetic */ HorizontalPadding $horizontalPadding;
                            final /* synthetic */ LazyListState $lazyListState;
                            final /* synthetic */ Modifier $modifier;

                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass1(Modifier modifier, LazyListState lazyListState, ImmutableList<? extends UIComponent<? extends ActionT>> immutableList, HorizontalPadding horizontalPadding, boolean z) {
                                this.$modifier = modifier;
                                this.$lazyListState = lazyListState;
                                this.$components = immutableList;
                                this.$horizontalPadding = horizontalPadding;
                                this.$childFillMaxWidth = z;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer, int i) {
                                if ((i & 3) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1538328221, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiLazyColumn.<anonymous>.<anonymous> (SduiColumns.kt:90)");
                                }
                                Modifier modifier = this.$modifier;
                                LazyListState lazyListState = this.$lazyListState;
                                composer.startReplaceGroup(-1746271574);
                                boolean zChangedInstance = composer.changedInstance(this.$components) | composer.changed(this.$horizontalPadding.ordinal()) | composer.changed(this.$childFillMaxWidth);
                                final ImmutableList immutableList = this.$components;
                                final HorizontalPadding horizontalPadding = this.$horizontalPadding;
                                final boolean z = this.$childFillMaxWidth;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsKt$SduiLazyColumn$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return SduiColumns.C207351.AnonymousClass1.invoke$lambda$2$lambda$1(immutableList, horizontalPadding, z, (LazyListScope) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                LazyDslKt.LazyColumn(modifier, lazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 508);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$2$lambda$1(final List immutableList, final HorizontalPadding horizontalPadding, final boolean z, LazyListScope LazyColumn) {
                                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                final Function1 c20730x4ad6caa2 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsKt$SduiLazyColumn$1$1$invoke$lambda$2$lambda$1$$inlined$items$default$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Void invoke(UIComponent<? extends ActionT> uIComponent) {
                                        return null;
                                    }
                                };
                                LazyColumn.items(immutableList.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsKt$SduiLazyColumn$1$1$invoke$lambda$2$lambda$1$$inlined$items$default$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                        return invoke(num.intValue());
                                    }

                                    public final Object invoke(int i) {
                                        return c20730x4ad6caa2.invoke(immutableList.get(i));
                                    }
                                }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsKt$SduiLazyColumn$1$1$invoke$lambda$2$lambda$1$$inlined$items$default$4
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
                                        UIComponent uIComponent = (UIComponent) immutableList.get(i);
                                        composer.startReplaceGroup(-1996329191);
                                        SduiColumns.LazySduiComponent(lazyItemScope, uIComponent, null, horizontalPadding, z, composer, i3 & 14, 2);
                                        composer.endReplaceGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }));
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i11) {
                            if ((i11 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1105327364, i11, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiLazyColumn.<anonymous> (SduiColumns.kt:89)");
                            }
                            SduiActionHandler3.ProvideActionHandler(sduiActionHandler42, ComposableLambda3.rememberComposableLambda(1538328221, true, new AnonymousClass1(modifier42, lazyListState32, components, horizontalPadding42, z32), composer3, 54), composer3, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier2;
                    horizontalPadding3 = horizontalPadding2;
                    sduiActionHandler3 = sduiActionHandler2;
                    sduiStateHandler33 = sduiStateHandler32;
                    composer2 = composerStartRestartGroup;
                    lazyListState2 = lazyListStateRememberLazyListState;
                }
            }
            final boolean z42 = z2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        sduiStateHandler32 = sduiStateHandler3;
        i5 = i2 & 32;
        int i1022 = 196608;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if ((i3 & 4793491) != 4793490) {
        }
        final boolean z422 = z2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static /* synthetic */ void sduiItems$default(LazyListScope lazyListScope, ImmutableList components, SduiStateHandler3 sduiStateHandler3, SduiActionHandler sduiActionHandler, HorizontalPadding horizontalPadding, int i, Object obj) {
        if ((i & 2) != 0) {
            sduiStateHandler3 = null;
        }
        if ((i & 4) != 0) {
            sduiActionHandler = null;
        }
        if ((i & 8) != 0) {
            horizontalPadding = HorizontalPadding.Default;
        }
        HorizontalPadding horizontalPadding2 = horizontalPadding;
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(horizontalPadding2, "horizontalPadding");
        Intrinsics.reifiedOperationMarker(4, "ActionT");
        sduiItems(lazyListScope, components, Parcelable.class, sduiStateHandler3, sduiActionHandler, horizontalPadding2);
    }

    public static final /* synthetic */ <ActionT extends Parcelable> void sduiItems(LazyListScope lazyListScope, ImmutableList<? extends UIComponent<? extends ActionT>> components, SduiStateHandler3 sduiStateHandler3, SduiActionHandler<? super ActionT> sduiActionHandler, HorizontalPadding horizontalPadding) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        Intrinsics.reifiedOperationMarker(4, "ActionT");
        sduiItems(lazyListScope, components, Parcelable.class, sduiStateHandler3, sduiActionHandler, horizontalPadding);
    }

    public static /* synthetic */ void sduiItems$default(LazyListScope lazyListScope, List componentsSuboptimal, SduiStateHandler3 sduiStateHandler3, SduiActionHandler sduiActionHandler, HorizontalPadding horizontalPadding, int i, Object obj) {
        if ((i & 2) != 0) {
            sduiStateHandler3 = null;
        }
        if ((i & 4) != 0) {
            sduiActionHandler = null;
        }
        if ((i & 8) != 0) {
            horizontalPadding = HorizontalPadding.Default;
        }
        HorizontalPadding horizontalPadding2 = horizontalPadding;
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(componentsSuboptimal, "componentsSuboptimal");
        Intrinsics.checkNotNullParameter(horizontalPadding2, "horizontalPadding");
        ImmutableList3 persistentList = extensions2.toPersistentList(componentsSuboptimal);
        Intrinsics.reifiedOperationMarker(4, "ActionT");
        sduiItems(lazyListScope, persistentList, Parcelable.class, sduiStateHandler3, sduiActionHandler, horizontalPadding2);
    }

    public static final /* synthetic */ <ActionT extends Parcelable> void sduiItems(LazyListScope lazyListScope, List<? extends UIComponent<? extends ActionT>> componentsSuboptimal, SduiStateHandler3 sduiStateHandler3, SduiActionHandler<? super ActionT> sduiActionHandler, HorizontalPadding horizontalPadding) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(componentsSuboptimal, "componentsSuboptimal");
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        ImmutableList3 persistentList = extensions2.toPersistentList(componentsSuboptimal);
        Intrinsics.reifiedOperationMarker(4, "ActionT");
        sduiItems(lazyListScope, persistentList, Parcelable.class, sduiStateHandler3, sduiActionHandler, horizontalPadding);
    }

    public static /* synthetic */ void sduiItems$default(LazyListScope lazyListScope, ImmutableList immutableList, Class cls, SduiStateHandler3 sduiStateHandler3, SduiActionHandler sduiActionHandler, HorizontalPadding horizontalPadding, int i, Object obj) {
        if ((i & 4) != 0) {
            sduiStateHandler3 = null;
        }
        if ((i & 8) != 0) {
            sduiActionHandler = null;
        }
        if ((i & 16) != 0) {
            horizontalPadding = HorizontalPadding.Default;
        }
        sduiItems(lazyListScope, immutableList, cls, sduiStateHandler3, sduiActionHandler, horizontalPadding);
    }

    @PublishedApi
    public static final <ActionT extends Parcelable> void sduiItems(LazyListScope lazyListScope, final ImmutableList<? extends UIComponent<? extends ActionT>> components, final Class<ActionT> actionClass, final SduiStateHandler3 sduiStateHandler3, final SduiActionHandler<? super ActionT> sduiActionHandler, final HorizontalPadding horizontalPadding) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(actionClass, "actionClass");
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        final SduiColumnsKt$sduiItems$$inlined$items$default$1 sduiColumnsKt$sduiItems$$inlined$items$default$1 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsKt$sduiItems$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(UIComponent<? extends ActionT> uIComponent) {
                return null;
            }
        };
        lazyListScope.items(components.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsKt$sduiItems$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return sduiColumnsKt$sduiItems$$inlined$items$default$1.invoke(components.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsKt$sduiItems$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(final LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
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
                final UIComponent uIComponent = (UIComponent) components.get(i);
                composer.startReplaceGroup(1102682329);
                ProvidedValue<?>[] providedValueArrProvidedValues = SduiColumns.providedValues(actionClass, sduiStateHandler3);
                ProvidedValue[] providedValueArr = (ProvidedValue[]) Arrays.copyOf(providedValueArrProvidedValues, providedValueArrProvidedValues.length);
                final SduiActionHandler sduiActionHandler2 = sduiActionHandler;
                final HorizontalPadding horizontalPadding2 = horizontalPadding;
                CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambda3.rememberComposableLambda(-1458270292, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsKt$sduiItems$1$1
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
                            ComposerKt.traceEventStart(-1458270292, i4, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.sduiItems.<anonymous>.<anonymous> (SduiColumns.kt:155)");
                        }
                        SduiActionHandler<ActionT> sduiActionHandler3 = sduiActionHandler2;
                        final LazyItemScope lazyItemScope2 = lazyItemScope;
                        final UIComponent<ActionT> uIComponent2 = uIComponent;
                        final HorizontalPadding horizontalPadding3 = horizontalPadding2;
                        SduiActionHandler3.ProvideActionHandler(sduiActionHandler3, ComposableLambda3.rememberComposableLambda(-2048626163, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsKt$sduiItems$1$1.1
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
                                    ComposerKt.traceEventStart(-2048626163, i5, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.sduiItems.<anonymous>.<anonymous>.<anonymous> (SduiColumns.kt:156)");
                                }
                                SduiColumns.LazySduiComponent(lazyItemScope2, uIComponent2, null, horizontalPadding3, false, composer3, 0, 10);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, ProvidedValue.$stable | 48);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void LazySduiComponent(final LazyItemScope lazyItemScope, final UIComponent<? extends ActionT> component, Modifier modifier, HorizontalPadding horizontalPadding, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        boolean z2;
        Modifier modifier3;
        HorizontalPadding horizontalPadding2;
        final HorizontalPadding horizontalPadding3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(lazyItemScope, "<this>");
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(1354991207);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(lazyItemScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(component) ? 32 : 16;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 2048 : 1024;
            }
            i5 = i2 & 8;
            if (i5 != 0) {
                if ((i & 24576) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    HorizontalPadding horizontalPadding4 = i4 == 0 ? HorizontalPadding.None : horizontalPadding;
                    if (i5 != 0) {
                        z2 = false;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1354991207, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.LazySduiComponent (SduiColumns.kt:172)");
                    }
                    if (!(component instanceof RelativeHeightContainer)) {
                        composerStartRestartGroup.startReplaceGroup(771472119);
                        int i7 = 65422 & i3;
                        HorizontalPadding horizontalPadding5 = horizontalPadding4;
                        Modifier modifier5 = modifier4;
                        SduiRelativeHeightContainer2.SduiRelativeHeightContainer(lazyItemScope, (RelativeHeightContainer) component, modifier5, horizontalPadding5, z2, composerStartRestartGroup, i7, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        modifier3 = modifier5;
                        composerStartRestartGroup.endReplaceGroup();
                        horizontalPadding2 = horizontalPadding5;
                    } else {
                        modifier3 = modifier4;
                        composerStartRestartGroup.startReplaceGroup(771479338);
                        Modifier modifierFillMaxWidth$default = Modifier.INSTANCE;
                        if (z2) {
                            modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifierFillMaxWidth$default, 0.0f, 1, null);
                        }
                        int i8 = (i3 >> 3) & 910;
                        horizontalPadding2 = horizontalPadding4;
                        SduiComponent3.SduiComponent(component, modifierFillMaxWidth$default, horizontalPadding2, composerStartRestartGroup, i8, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    horizontalPadding3 = horizontalPadding2;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    horizontalPadding3 = horizontalPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier6 = modifier2;
                    final boolean z3 = z2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SduiColumns.LazySduiComponent$lambda$2(lazyItemScope, component, modifier6, horizontalPadding3, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            z2 = z;
            if ((i3 & 9363) != 9362) {
                if (i6 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (!(component instanceof RelativeHeightContainer)) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                horizontalPadding3 = horizontalPadding2;
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z2 = z;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final /* synthetic */ <ActionT extends Parcelable> void SduiColumn(ImmutableList<? extends UIComponent<? extends ActionT>> components, Modifier modifier, SduiStateHandler3 sduiStateHandler3, SduiActionHandler<? super ActionT> sduiActionHandler, HorizontalPadding horizontalPadding, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, boolean z, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(components, "components");
        composer.startReplaceGroup(-1772220517);
        if ((i2 & 2) != 0) {
            modifier = Modifier.INSTANCE;
        }
        Modifier modifier2 = modifier;
        SduiStateHandler3 sduiStateHandler32 = (i2 & 4) != 0 ? null : sduiStateHandler3;
        SduiActionHandler<? super ActionT> sduiActionHandler2 = (i2 & 8) != 0 ? null : sduiActionHandler;
        HorizontalPadding horizontalPadding2 = (i2 & 16) != 0 ? HorizontalPadding.Default : horizontalPadding;
        Arrangement.Vertical top = (i2 & 32) != 0 ? Arrangement.INSTANCE.getTop() : vertical;
        Alignment.Horizontal start = (i2 & 64) != 0 ? Alignment.INSTANCE.getStart() : horizontal;
        boolean z2 = (i2 & 128) != 0 ? false : z;
        Intrinsics.reifiedOperationMarker(4, "ActionT");
        int i3 = i << 3;
        SduiColumn(components, Parcelable.class, modifier2, sduiStateHandler32, sduiActionHandler2, horizontalPadding2, top, start, z2, composer, (i & 14) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (29360128 & i3) | (i3 & 234881024), 0);
        composer.endReplaceGroup();
    }

    public static final /* synthetic */ <ActionT extends Parcelable> void SduiColumn(List<? extends UIComponent<? extends ActionT>> componentsSuboptimal, Modifier modifier, SduiStateHandler3 sduiStateHandler3, SduiActionHandler<? super ActionT> sduiActionHandler, HorizontalPadding horizontalPadding, boolean z, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(componentsSuboptimal, "componentsSuboptimal");
        composer.startReplaceGroup(1510558093);
        if ((i2 & 2) != 0) {
            modifier = Modifier.INSTANCE;
        }
        Modifier modifier2 = modifier;
        SduiStateHandler3 sduiStateHandler32 = (i2 & 4) != 0 ? null : sduiStateHandler3;
        SduiActionHandler<? super ActionT> sduiActionHandler2 = (i2 & 8) != 0 ? null : sduiActionHandler;
        HorizontalPadding horizontalPadding2 = (i2 & 16) != 0 ? HorizontalPadding.Default : horizontalPadding;
        boolean z2 = (i2 & 32) != 0 ? false : z;
        composer.startReplaceGroup(-1772220517);
        Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
        Alignment.Horizontal start = Alignment.INSTANCE.getStart();
        Intrinsics.reifiedOperationMarker(4, "ActionT");
        SduiColumn(extensions2.toPersistentList(componentsSuboptimal), Parcelable.class, modifier2, sduiStateHandler32, sduiActionHandler2, horizontalPadding2, top, start, z2, composer, (((i & 65520) | ((i << 6) & 29360128)) << 3) & 235405184, 0);
        composer.endReplaceGroup();
        composer.endReplaceGroup();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9 A[PHI: r15
      0x00a9: PHI (r15v10 int) = (r15v0 int), (r15v5 int), (r15v6 int) binds: [B:59:0x00a7, B:69:0x00bf, B:68:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010b  */
    @PublishedApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiColumn(final ImmutableList<? extends UIComponent<? extends ActionT>> components, final Class<ActionT> actionClass, Modifier modifier, SduiStateHandler3 sduiStateHandler3, SduiActionHandler<? super ActionT> sduiActionHandler, HorizontalPadding horizontalPadding, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        SduiStateHandler3 sduiStateHandler32;
        int i5;
        int i6;
        int i7;
        Arrangement.Vertical top;
        int i8;
        int i9;
        int i10;
        final Arrangement.Vertical vertical2;
        final Modifier modifier3;
        final SduiActionHandler<? super ActionT> sduiActionHandler2;
        Composer composer2;
        final SduiStateHandler3 sduiStateHandler33;
        final boolean z2;
        final Alignment.Horizontal horizontal2;
        final HorizontalPadding horizontalPadding2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(actionClass, "actionClass");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1652662225);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(components) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(actionClass) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    sduiStateHandler32 = sduiStateHandler3;
                    i3 |= composerStartRestartGroup.changed(sduiStateHandler32) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(sduiActionHandler) : composerStartRestartGroup.changedInstance(sduiActionHandler) ? 16384 : 8192;
                }
                i6 = i2 & 32;
                int i12 = 196608;
                if (i6 != 0) {
                    i3 |= i12;
                } else if ((196608 & i) == 0) {
                    i12 = composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 131072 : 65536;
                    i3 |= i12;
                }
                i7 = i2 & 64;
                if (i7 != 0) {
                    i3 |= 1572864;
                    top = vertical;
                } else {
                    top = vertical;
                    if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changed(top) ? 1048576 : 524288;
                    }
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= composerStartRestartGroup.changed(horizontal) ? 8388608 : 4194304;
                }
                i9 = i2 & 256;
                if (i9 == 0) {
                    if ((i & 100663296) == 0) {
                        i10 = i9;
                        i3 |= composerStartRestartGroup.changed(z) ? 67108864 : 33554432;
                    }
                    if ((i3 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            sduiStateHandler32 = null;
                        }
                        SduiActionHandler<? super ActionT> sduiActionHandler3 = i5 == 0 ? sduiActionHandler : null;
                        HorizontalPadding horizontalPadding3 = i6 == 0 ? HorizontalPadding.Default : horizontalPadding;
                        if (i7 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        }
                        Alignment.Horizontal start = i8 == 0 ? Alignment.INSTANCE.getStart() : horizontal;
                        boolean z3 = i10 == 0 ? false : z;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1652662225, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumn (SduiColumns.kt:248)");
                        }
                        ProvidedValue<?>[] providedValueArrProvidedValues = providedValues(actionClass, sduiStateHandler32);
                        final SduiActionHandler<? super ActionT> sduiActionHandler4 = sduiActionHandler3;
                        final HorizontalPadding horizontalPadding4 = horizontalPadding3;
                        final Arrangement.Vertical vertical3 = top;
                        final Alignment.Horizontal horizontal3 = start;
                        final Modifier modifier4 = modifier2;
                        final boolean z4 = z3;
                        CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) Arrays.copyOf(providedValueArrProvidedValues, providedValueArrProvidedValues.length), ComposableLambda3.rememberComposableLambda(660518127, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsKt.SduiColumn.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i13) {
                                if ((i13 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(660518127, i13, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumn.<anonymous> (SduiColumns.kt:255)");
                                }
                                SduiActionHandler<ActionT> sduiActionHandler5 = sduiActionHandler4;
                                final Modifier modifier5 = modifier4;
                                final Arrangement.Vertical vertical4 = vertical3;
                                final Alignment.Horizontal horizontal4 = horizontal3;
                                final ImmutableList<UIComponent<ActionT>> immutableList = components;
                                final boolean z5 = z4;
                                final HorizontalPadding horizontalPadding5 = horizontalPadding4;
                                SduiActionHandler3.ProvideActionHandler(sduiActionHandler5, ComposableLambda3.rememberComposableLambda(-1407103920, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsKt.SduiColumn.1.1
                                    public final void invoke(Composer composer4, int i14) {
                                        if ((i14 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1407103920, i14, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumn.<anonymous>.<anonymous> (SduiColumns.kt:256)");
                                        }
                                        Modifier modifier6 = modifier5;
                                        Arrangement.Vertical vertical5 = vertical4;
                                        Alignment.Horizontal horizontal5 = horizontal4;
                                        List list = immutableList;
                                        boolean z6 = z5;
                                        HorizontalPadding horizontalPadding6 = horizontalPadding5;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(vertical5, horizontal5, composer4, 0);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifier6);
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        composer4.startReplaceGroup(1467668656);
                                        Iterator it = list.iterator();
                                        while (it.hasNext()) {
                                            SduiComponent3.SduiComponent((UIComponent) it.next(), (z6 && Intrinsics.areEqual(horizontal5, Alignment.INSTANCE.getStart())) ? SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null) : Modifier.INSTANCE, horizontalPadding6, composer4, 0, 0);
                                        }
                                        composer4.endReplaceGroup();
                                        composer4.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }
                                }, composer3, 54), composer3, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        Modifier modifier5 = modifier2;
                        vertical2 = top;
                        modifier3 = modifier5;
                        sduiActionHandler2 = sduiActionHandler3;
                        composer2 = composerStartRestartGroup;
                        sduiStateHandler33 = sduiStateHandler32;
                        z2 = z3;
                        horizontal2 = start;
                        horizontalPadding2 = horizontalPadding3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        Modifier modifier6 = modifier2;
                        vertical2 = top;
                        modifier3 = modifier6;
                        sduiActionHandler2 = sduiActionHandler;
                        horizontalPadding2 = horizontalPadding;
                        horizontal2 = horizontal;
                        composer2 = composerStartRestartGroup;
                        sduiStateHandler33 = sduiStateHandler32;
                        z2 = z;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return SduiColumns.SduiColumn$lambda$3(components, actionClass, modifier3, sduiStateHandler33, sduiActionHandler2, horizontalPadding2, vertical2, horizontal2, z2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 100663296;
                i10 = i9;
                if ((i3 & 38347923) == 38347922) {
                    if (i11 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ProvidedValue<?>[] providedValueArrProvidedValues2 = providedValues(actionClass, sduiStateHandler32);
                    final SduiActionHandler<? super ActionT> sduiActionHandler42 = sduiActionHandler3;
                    final HorizontalPadding horizontalPadding42 = horizontalPadding3;
                    final Arrangement.Vertical vertical32 = top;
                    final Alignment.Horizontal horizontal32 = start;
                    final Modifier modifier42 = modifier2;
                    final boolean z42 = z3;
                    CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) Arrays.copyOf(providedValueArrProvidedValues2, providedValueArrProvidedValues2.length), ComposableLambda3.rememberComposableLambda(660518127, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsKt.SduiColumn.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i13) {
                            if ((i13 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(660518127, i13, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumn.<anonymous> (SduiColumns.kt:255)");
                            }
                            SduiActionHandler<ActionT> sduiActionHandler5 = sduiActionHandler42;
                            final Modifier modifier52 = modifier42;
                            final Arrangement.Vertical vertical4 = vertical32;
                            final Alignment.Horizontal horizontal4 = horizontal32;
                            final ImmutableList<? extends UIComponent<? extends ActionT>> immutableList = components;
                            final boolean z5 = z42;
                            final HorizontalPadding horizontalPadding5 = horizontalPadding42;
                            SduiActionHandler3.ProvideActionHandler(sduiActionHandler5, ComposableLambda3.rememberComposableLambda(-1407103920, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsKt.SduiColumn.1.1
                                public final void invoke(Composer composer4, int i14) {
                                    if ((i14 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1407103920, i14, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumn.<anonymous>.<anonymous> (SduiColumns.kt:256)");
                                    }
                                    Modifier modifier62 = modifier52;
                                    Arrangement.Vertical vertical5 = vertical4;
                                    Alignment.Horizontal horizontal5 = horizontal4;
                                    List list = immutableList;
                                    boolean z6 = z5;
                                    HorizontalPadding horizontalPadding6 = horizontalPadding5;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(vertical5, horizontal5, composer4, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifier62);
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    composer4.startReplaceGroup(1467668656);
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        SduiComponent3.SduiComponent((UIComponent) it.next(), (z6 && Intrinsics.areEqual(horizontal5, Alignment.INSTANCE.getStart())) ? SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null) : Modifier.INSTANCE, horizontalPadding6, composer4, 0, 0);
                                    }
                                    composer4.endReplaceGroup();
                                    composer4.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }
                            }, composer3, 54), composer3, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifier52 = modifier2;
                    vertical2 = top;
                    modifier3 = modifier52;
                    sduiActionHandler2 = sduiActionHandler3;
                    composer2 = composerStartRestartGroup;
                    sduiStateHandler33 = sduiStateHandler32;
                    z2 = z3;
                    horizontal2 = start;
                    horizontalPadding2 = horizontalPadding3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            sduiStateHandler32 = sduiStateHandler3;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            i6 = i2 & 32;
            int i122 = 196608;
            if (i6 != 0) {
            }
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            i8 = i2 & 128;
            if (i8 != 0) {
            }
            i9 = i2 & 256;
            if (i9 == 0) {
            }
            i10 = i9;
            if ((i3 & 38347923) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        sduiStateHandler32 = sduiStateHandler3;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        i6 = i2 & 32;
        int i1222 = 196608;
        if (i6 != 0) {
        }
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        i8 = i2 & 128;
        if (i8 != 0) {
        }
        i9 = i2 & 256;
        if (i9 == 0) {
        }
        i10 = i9;
        if ((i3 & 38347923) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final <ActionT> ProvidedValue<?>[] providedValues(Class<ActionT> actionClass, SduiStateHandler3 sduiStateHandler3) {
        Intrinsics.checkNotNullParameter(actionClass, "actionClass");
        return (ProvidedValue[]) CollectionsKt.listOfNotNull((Object[]) new ProvidedValue[]{UtilKt.getLocalActionClass().provides(actionClass), sduiStateHandler3 != null ? SduiStateHandler2.getLocalStateHandler().provides(sduiStateHandler3) : null}).toArray(new ProvidedValue[0]);
    }
}
