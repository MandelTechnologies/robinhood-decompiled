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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.beneficiaries.p067ui.detail.BeneficiaryDetailCompose2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdl;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: SduiColumnsIdl.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0087\u0001\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0018\b\b\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a\u008d\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00172\u0016\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\u0010\u0018\u001ah\u0010\u0019\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u001a2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0018\b\b\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0086\bø\u0001\u0000\u001an\u0010\u0019\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u001a2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0016\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00172\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0001\u001aG\u0010\u001b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u001c\u001a\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u001d\u001a\u0097\u0001\u0010\u001e\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u001f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0018\b\b\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a\u009d\u0001\u0010\u001e\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u001f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0016\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00172\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0004\b$\u0010&\u001a\u0091\u0001\u0010\u001e\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020'0\u00042\u0018\b\b\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010%\u001a\u0097\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020'0\u00042\u0016\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00172\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\u0010&\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, m3636d2 = {"SduiLazyColumn", "", "ActionT", "components", "Lkotlinx/collections/immutable/ImmutableList;", "Lrh_server_driven_ui/v1/UIComponentDto;", "parseAction", "Lkotlin/Function1;", "Lrh_server_driven_ui/v1/ActionDto;", "modifier", "Landroidx/compose/ui/Modifier;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "stateHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/StateHandler;", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "horizontalPadding", "Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;", "childFillMaxWidth", "", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/StateHandler;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;ZLandroidx/compose/runtime/Composer;II)V", "actionClass", "Ljava/lang/Class;", "(Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/Class;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/StateHandler;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;ZLandroidx/compose/runtime/Composer;II)V", "sduiItems", "Landroidx/compose/foundation/lazy/LazyListScope;", "LazySduiComponent", "component", "(Lrh_server_driven_ui/v1/UIComponentDto;Lkotlin/jvm/functions/Function1;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;ZLandroidx/compose/runtime/Composer;II)V", BeneficiaryDetailCompose2.BENEFICIARY_DETAIL_SDUI_COLUMN, "Landroid/os/Parcelable;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "SduiColumnIdl", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/StateHandler;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ZLandroidx/compose/runtime/Composer;II)V", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Ljava/lang/Class;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/StateHandler;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ZLandroidx/compose/runtime/Composer;II)V", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdlKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiColumnsIdl {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LazySduiComponent$lambda$2(UIComponentDto uIComponentDto, Function1 function1, HorizontalPadding horizontalPadding, boolean z, int i, int i2, Composer composer, int i3) {
        LazySduiComponent(uIComponentDto, function1, horizontalPadding, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiColumn$lambda$3(ImmutableList immutableList, Function1 function1, Class cls, Modifier modifier, SduiStateHandler3 sduiStateHandler3, SduiActionHandler sduiActionHandler, HorizontalPadding horizontalPadding, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, boolean z, int i, int i2, Composer composer, int i3) {
        SduiColumnIdl(immutableList, function1, cls, modifier, sduiStateHandler3, sduiActionHandler, horizontalPadding, vertical, horizontal, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiColumn$lambda$4(ImmutableList immutableList, Function1 function1, Class cls, Modifier modifier, SduiStateHandler3 sduiStateHandler3, SduiActionHandler sduiActionHandler, HorizontalPadding horizontalPadding, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, boolean z, int i, int i2, Composer composer, int i3) {
        SduiColumn(immutableList, function1, cls, modifier, sduiStateHandler3, sduiActionHandler, horizontalPadding, vertical, horizontal, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiLazyColumn$lambda$0(ImmutableList immutableList, Class cls, Function1 function1, Modifier modifier, LazyListState lazyListState, SduiStateHandler3 sduiStateHandler3, SduiActionHandler sduiActionHandler, HorizontalPadding horizontalPadding, boolean z, int i, int i2, Composer composer, int i3) {
        SduiLazyColumn(immutableList, cls, function1, modifier, lazyListState, sduiStateHandler3, sduiActionHandler, horizontalPadding, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ <ActionT> void SduiLazyColumn(ImmutableList<UIComponentDto> components, Function1<? super ActionDto, ? extends ActionT> parseAction, Modifier modifier, LazyListState lazyListState, SduiStateHandler3 sduiStateHandler3, SduiActionHandler<? super ActionT> sduiActionHandler, HorizontalPadding horizontalPadding, boolean z, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        composer.startReplaceGroup(-1370740990);
        if ((i2 & 4) != 0) {
            modifier = Modifier.INSTANCE;
        }
        Modifier modifier2 = modifier;
        if ((i2 & 8) != 0) {
            lazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer, 0, 3);
        }
        LazyListState lazyListState2 = lazyListState;
        SduiStateHandler3 sduiStateHandler32 = (i2 & 16) != 0 ? null : sduiStateHandler3;
        SduiActionHandler<? super ActionT> sduiActionHandler2 = (i2 & 32) != 0 ? null : sduiActionHandler;
        HorizontalPadding horizontalPadding2 = (i2 & 64) != 0 ? HorizontalPadding.Default : horizontalPadding;
        boolean z2 = (i2 & 128) != 0 ? false : z;
        Intrinsics.reifiedOperationMarker(4, "ActionT");
        int i3 = i << 3;
        SduiLazyColumn(components, Object.class, parseAction, modifier2, lazyListState2, sduiStateHandler32, sduiActionHandler2, horizontalPadding2, z2, composer, (i & 14) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (29360128 & i3) | (i3 & 234881024), 0);
        composer.endReplaceGroup();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0 A[PHI: r15
      0x00c0: PHI (r15v11 int) = (r15v0 int), (r15v6 int), (r15v7 int) binds: [B:67:0x00be, B:77:0x00d8, B:76:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0109  */
    @PublishedApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT> void SduiLazyColumn(final ImmutableList<UIComponentDto> components, final Class<ActionT> actionClass, final Function1<? super ActionDto, ? extends ActionT> parseAction, Modifier modifier, LazyListState lazyListState, SduiStateHandler3 sduiStateHandler3, SduiActionHandler<? super ActionT> sduiActionHandler, HorizontalPadding horizontalPadding, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        LazyListState lazyListStateRememberLazyListState;
        int i4;
        SduiStateHandler3 sduiStateHandler32;
        int i5;
        int i6;
        int i7;
        final SduiActionHandler<? super ActionT> sduiActionHandler2;
        int i8;
        final Modifier modifier3;
        final HorizontalPadding horizontalPadding2;
        final LazyListState lazyListState2;
        final boolean z2;
        final Modifier modifier4;
        final LazyListState lazyListState3;
        final HorizontalPadding horizontalPadding3;
        Composer composer2;
        final boolean z3;
        final SduiActionHandler<? super ActionT> sduiActionHandler3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(actionClass, "actionClass");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(1084369134);
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
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(parseAction) ? 256 : 128;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    lazyListStateRememberLazyListState = lazyListState;
                    int i10 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) ? 16384 : 8192;
                    i3 |= i10;
                } else {
                    lazyListStateRememberLazyListState = lazyListState;
                }
                i3 |= i10;
            } else {
                lazyListStateRememberLazyListState = lazyListState;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    sduiStateHandler32 = sduiStateHandler3;
                    i3 |= composerStartRestartGroup.changed(sduiStateHandler32) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                int i11 = 1572864;
                if (i5 != 0) {
                    i3 |= i11;
                } else if ((1572864 & i) == 0) {
                    i11 = (2097152 & i) == 0 ? composerStartRestartGroup.changed(sduiActionHandler) : composerStartRestartGroup.changedInstance(sduiActionHandler) ? 1048576 : 524288;
                    i3 |= i11;
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 8388608 : 4194304;
                }
                i7 = i2 & 256;
                if (i7 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i3 |= composerStartRestartGroup.changed(z) ? 67108864 : 33554432;
                }
                if ((i3 & 38347923) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i9 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i4 != 0) {
                            sduiStateHandler32 = null;
                        }
                        SduiActionHandler<? super ActionT> sduiActionHandler4 = i5 == 0 ? sduiActionHandler : null;
                        HorizontalPadding horizontalPadding4 = i6 == 0 ? HorizontalPadding.Default : horizontalPadding;
                        if (i7 == 0) {
                            HorizontalPadding horizontalPadding5 = horizontalPadding4;
                            sduiActionHandler2 = sduiActionHandler4;
                            i8 = i3;
                            modifier3 = modifier2;
                            horizontalPadding2 = horizontalPadding5;
                            LazyListState lazyListState4 = lazyListStateRememberLazyListState;
                            z2 = false;
                            lazyListState2 = lazyListState4;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1084369134, i8, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiLazyColumn (SduiColumnsIdl.kt:57)");
                            }
                            ProvidedValue<?>[] providedValueArrProvidedValues = SduiColumns.providedValues(actionClass, sduiStateHandler32);
                            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) Arrays.copyOf(providedValueArrProvidedValues, providedValueArrProvidedValues.length), ComposableLambda3.rememberComposableLambda(-633250770, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdlKt.SduiLazyColumn.1

                                /* compiled from: SduiColumnsIdl.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdlKt$SduiLazyColumn$1$1, reason: invalid class name */
                                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                                    final /* synthetic */ boolean $childFillMaxWidth;
                                    final /* synthetic */ ImmutableList<UIComponentDto> $components;
                                    final /* synthetic */ HorizontalPadding $horizontalPadding;
                                    final /* synthetic */ LazyListState $lazyListState;
                                    final /* synthetic */ Modifier $modifier;
                                    final /* synthetic */ Function1<ActionDto, ActionT> $parseAction;

                                    /* JADX WARN: Multi-variable type inference failed */
                                    AnonymousClass1(Modifier modifier, LazyListState lazyListState, ImmutableList<UIComponentDto> immutableList, Function1<? super ActionDto, ? extends ActionT> function1, HorizontalPadding horizontalPadding, boolean z) {
                                        this.$modifier = modifier;
                                        this.$lazyListState = lazyListState;
                                        this.$components = immutableList;
                                        this.$parseAction = function1;
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
                                            ComposerKt.traceEventStart(-619049427, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiLazyColumn.<anonymous>.<anonymous> (SduiColumnsIdl.kt:65)");
                                        }
                                        Modifier modifier = this.$modifier;
                                        LazyListState lazyListState = this.$lazyListState;
                                        composer.startReplaceGroup(-1224400529);
                                        boolean zChangedInstance = composer.changedInstance(this.$components) | composer.changed(this.$parseAction) | composer.changed(this.$horizontalPadding.ordinal()) | composer.changed(this.$childFillMaxWidth);
                                        final ImmutableList<UIComponentDto> immutableList = this.$components;
                                        final Function1<ActionDto, ActionT> function1 = this.$parseAction;
                                        final HorizontalPadding horizontalPadding = this.$horizontalPadding;
                                        final boolean z = this.$childFillMaxWidth;
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdlKt$SduiLazyColumn$1$1$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return SduiColumnsIdl.C207281.AnonymousClass1.invoke$lambda$2$lambda$1(immutableList, function1, horizontalPadding, z, (LazyListScope) obj);
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
                                    public static final Unit invoke$lambda$2$lambda$1(final ImmutableList immutableList, final Function1 function1, final HorizontalPadding horizontalPadding, final boolean z, LazyListScope LazyColumn) {
                                        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                        final C20722x7c4cf2a1 c20722x7c4cf2a1 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdlKt$SduiLazyColumn$1$1$invoke$lambda$2$lambda$1$$inlined$items$default$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Void invoke(UIComponentDto uIComponentDto) {
                                                return null;
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                return invoke((UIComponentDto) obj);
                                            }
                                        };
                                        LazyColumn.items(immutableList.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdlKt$SduiLazyColumn$1$1$invoke$lambda$2$lambda$1$$inlined$items$default$3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                                return invoke(num.intValue());
                                            }

                                            public final Object invoke(int i) {
                                                return c20722x7c4cf2a1.invoke(immutableList.get(i));
                                            }
                                        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdlKt$SduiLazyColumn$1$1$invoke$lambda$2$lambda$1$$inlined$items$default$4
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
                                                UIComponentDto uIComponentDto = (UIComponentDto) immutableList.get(i);
                                                composer.startReplaceGroup(-1884103509);
                                                SduiColumnsIdl.LazySduiComponent(uIComponentDto, function1, horizontalPadding, z, composer, 0, 0);
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

                                public final void invoke(Composer composer3, int i12) {
                                    if ((i12 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-633250770, i12, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiLazyColumn.<anonymous> (SduiColumnsIdl.kt:64)");
                                    }
                                    SduiActionHandler3.ProvideActionHandler(sduiActionHandler2, ComposableLambda3.rememberComposableLambda(-619049427, true, new AnonymousClass1(modifier3, lazyListState2, components, parseAction, horizontalPadding2, z2), composer3, 54), composer3, 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            lazyListState3 = lazyListState2;
                            horizontalPadding3 = horizontalPadding2;
                            composer2 = composerStartRestartGroup;
                            z3 = z2;
                            sduiActionHandler3 = sduiActionHandler2;
                        } else {
                            HorizontalPadding horizontalPadding6 = horizontalPadding4;
                            sduiActionHandler2 = sduiActionHandler4;
                            i8 = i3;
                            modifier3 = modifier2;
                            horizontalPadding2 = horizontalPadding6;
                            lazyListState2 = lazyListStateRememberLazyListState;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        sduiActionHandler2 = sduiActionHandler;
                        i8 = i3;
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        horizontalPadding2 = horizontalPadding;
                    }
                    z2 = z;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ProvidedValue<?>[] providedValueArrProvidedValues2 = SduiColumns.providedValues(actionClass, sduiStateHandler32);
                    CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) Arrays.copyOf(providedValueArrProvidedValues2, providedValueArrProvidedValues2.length), ComposableLambda3.rememberComposableLambda(-633250770, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdlKt.SduiLazyColumn.1

                        /* compiled from: SduiColumnsIdl.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdlKt$SduiLazyColumn$1$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ boolean $childFillMaxWidth;
                            final /* synthetic */ ImmutableList<UIComponentDto> $components;
                            final /* synthetic */ HorizontalPadding $horizontalPadding;
                            final /* synthetic */ LazyListState $lazyListState;
                            final /* synthetic */ Modifier $modifier;
                            final /* synthetic */ Function1<ActionDto, ActionT> $parseAction;

                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass1(Modifier modifier, LazyListState lazyListState, ImmutableList<UIComponentDto> immutableList, Function1<? super ActionDto, ? extends ActionT> function1, HorizontalPadding horizontalPadding, boolean z) {
                                this.$modifier = modifier;
                                this.$lazyListState = lazyListState;
                                this.$components = immutableList;
                                this.$parseAction = function1;
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
                                    ComposerKt.traceEventStart(-619049427, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiLazyColumn.<anonymous>.<anonymous> (SduiColumnsIdl.kt:65)");
                                }
                                Modifier modifier = this.$modifier;
                                LazyListState lazyListState = this.$lazyListState;
                                composer.startReplaceGroup(-1224400529);
                                boolean zChangedInstance = composer.changedInstance(this.$components) | composer.changed(this.$parseAction) | composer.changed(this.$horizontalPadding.ordinal()) | composer.changed(this.$childFillMaxWidth);
                                final ImmutableList immutableList = this.$components;
                                final Function1 function1 = this.$parseAction;
                                final HorizontalPadding horizontalPadding = this.$horizontalPadding;
                                final boolean z = this.$childFillMaxWidth;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdlKt$SduiLazyColumn$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return SduiColumnsIdl.C207281.AnonymousClass1.invoke$lambda$2$lambda$1(immutableList, function1, horizontalPadding, z, (LazyListScope) obj);
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
                            public static final Unit invoke$lambda$2$lambda$1(final List immutableList, final Function1 function1, final HorizontalPadding horizontalPadding, final boolean z, LazyListScope LazyColumn) {
                                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                final Function1 c20722x7c4cf2a1 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdlKt$SduiLazyColumn$1$1$invoke$lambda$2$lambda$1$$inlined$items$default$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Void invoke(UIComponentDto uIComponentDto) {
                                        return null;
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        return invoke((UIComponentDto) obj);
                                    }
                                };
                                LazyColumn.items(immutableList.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdlKt$SduiLazyColumn$1$1$invoke$lambda$2$lambda$1$$inlined$items$default$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                        return invoke(num.intValue());
                                    }

                                    public final Object invoke(int i) {
                                        return c20722x7c4cf2a1.invoke(immutableList.get(i));
                                    }
                                }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdlKt$SduiLazyColumn$1$1$invoke$lambda$2$lambda$1$$inlined$items$default$4
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
                                        UIComponentDto uIComponentDto = (UIComponentDto) immutableList.get(i);
                                        composer.startReplaceGroup(-1884103509);
                                        SduiColumnsIdl.LazySduiComponent(uIComponentDto, function1, horizontalPadding, z, composer, 0, 0);
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

                        public final void invoke(Composer composer3, int i12) {
                            if ((i12 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-633250770, i12, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiLazyColumn.<anonymous> (SduiColumnsIdl.kt:64)");
                            }
                            SduiActionHandler3.ProvideActionHandler(sduiActionHandler2, ComposableLambda3.rememberComposableLambda(-619049427, true, new AnonymousClass1(modifier3, lazyListState2, components, parseAction, horizontalPadding2, z2), composer3, 54), composer3, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                    lazyListState3 = lazyListState2;
                    horizontalPadding3 = horizontalPadding2;
                    composer2 = composerStartRestartGroup;
                    z3 = z2;
                    sduiActionHandler3 = sduiActionHandler2;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    horizontalPadding3 = horizontalPadding;
                    modifier4 = modifier2;
                    lazyListState3 = lazyListStateRememberLazyListState;
                    composer2 = composerStartRestartGroup;
                    sduiActionHandler3 = sduiActionHandler;
                    z3 = z;
                }
                final SduiStateHandler3 sduiStateHandler33 = sduiStateHandler32;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdlKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SduiColumnsIdl.SduiLazyColumn$lambda$0(components, actionClass, parseAction, modifier4, lazyListState3, sduiStateHandler33, sduiActionHandler3, horizontalPadding3, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            sduiStateHandler32 = sduiStateHandler3;
            i5 = i2 & 64;
            int i112 = 1572864;
            if (i5 != 0) {
            }
            i6 = i2 & 128;
            if (i6 != 0) {
            }
            i7 = i2 & 256;
            if (i7 != 0) {
            }
            if ((i3 & 38347923) != 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                }
            }
            final SduiStateHandler3 sduiStateHandler332 = sduiStateHandler32;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        sduiStateHandler32 = sduiStateHandler3;
        i5 = i2 & 64;
        int i1122 = 1572864;
        if (i5 != 0) {
        }
        i6 = i2 & 128;
        if (i6 != 0) {
        }
        i7 = i2 & 256;
        if (i7 != 0) {
        }
        if ((i3 & 38347923) != 38347922) {
        }
        final SduiStateHandler3 sduiStateHandler3322 = sduiStateHandler32;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static /* synthetic */ void sduiItems$default(LazyListScope lazyListScope, ImmutableList components, Function1 parseAction, SduiStateHandler3 sduiStateHandler3, SduiActionHandler sduiActionHandler, HorizontalPadding horizontalPadding, int i, Object obj) {
        if ((i & 4) != 0) {
            sduiStateHandler3 = null;
        }
        if ((i & 8) != 0) {
            sduiActionHandler = null;
        }
        if ((i & 16) != 0) {
            horizontalPadding = HorizontalPadding.Default;
        }
        HorizontalPadding horizontalPadding2 = horizontalPadding;
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Intrinsics.checkNotNullParameter(horizontalPadding2, "horizontalPadding");
        Intrinsics.reifiedOperationMarker(4, "ActionT");
        sduiItems(lazyListScope, components, parseAction, Object.class, sduiStateHandler3, sduiActionHandler, horizontalPadding2);
    }

    public static final /* synthetic */ <ActionT> void sduiItems(LazyListScope lazyListScope, ImmutableList<UIComponentDto> components, Function1<? super ActionDto, ? extends ActionT> parseAction, SduiStateHandler3 sduiStateHandler3, SduiActionHandler<? super ActionT> sduiActionHandler, HorizontalPadding horizontalPadding) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        Intrinsics.reifiedOperationMarker(4, "ActionT");
        sduiItems(lazyListScope, components, parseAction, Object.class, sduiStateHandler3, sduiActionHandler, horizontalPadding);
    }

    public static /* synthetic */ void sduiItems$default(LazyListScope lazyListScope, ImmutableList immutableList, Function1 function1, Class cls, SduiStateHandler3 sduiStateHandler3, SduiActionHandler sduiActionHandler, HorizontalPadding horizontalPadding, int i, Object obj) {
        if ((i & 8) != 0) {
            sduiStateHandler3 = null;
        }
        if ((i & 16) != 0) {
            sduiActionHandler = null;
        }
        if ((i & 32) != 0) {
            horizontalPadding = HorizontalPadding.Default;
        }
        sduiItems(lazyListScope, immutableList, function1, cls, sduiStateHandler3, sduiActionHandler, horizontalPadding);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT> void LazySduiComponent(final UIComponentDto component, final Function1<? super ActionDto, ? extends ActionT> parseAction, HorizontalPadding horizontalPadding, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        final HorizontalPadding horizontalPadding2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(1371116222);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(parseAction) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                HorizontalPadding horizontalPadding3 = i4 == 0 ? HorizontalPadding.None : horizontalPadding;
                if (i5 != 0) {
                    z2 = false;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1371116222, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.LazySduiComponent (SduiColumnsIdl.kt:134)");
                }
                Modifier modifierFillMaxWidth$default = Modifier.INSTANCE;
                if (z2) {
                    modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifierFillMaxWidth$default, 0.0f, 1, null);
                }
                int i6 = ((i3 << 3) & 7168) | (i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                horizontalPadding2 = horizontalPadding3;
                SduiComponentIdl.SduiComponent(component, parseAction, modifierFillMaxWidth$default, horizontalPadding2, composerStartRestartGroup, i6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                horizontalPadding2 = horizontalPadding;
            }
            final boolean z3 = z2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdlKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiColumnsIdl.LazySduiComponent$lambda$2(component, parseAction, horizontalPadding2, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        z2 = z;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxWidth$default2 = Modifier.INSTANCE;
            if (z2) {
            }
            int i62 = ((i3 << 3) & 7168) | (i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            horizontalPadding2 = horizontalPadding3;
            SduiComponentIdl.SduiComponent(component, parseAction, modifierFillMaxWidth$default2, horizontalPadding2, composerStartRestartGroup, i62, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        final boolean z32 = z2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @JvmName
    public static final /* synthetic */ <ActionT extends Parcelable> void SduiColumnIdl(ImmutableList<UIComponentDto> components, Function1<? super ActionDto, ? extends ActionT> parseAction, Modifier modifier, SduiStateHandler3 sduiStateHandler3, SduiActionHandler<? super ActionT> sduiActionHandler, HorizontalPadding horizontalPadding, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, boolean z, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        composer.startReplaceGroup(40010095);
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.INSTANCE : modifier;
        SduiStateHandler3 sduiStateHandler32 = (i2 & 8) != 0 ? null : sduiStateHandler3;
        SduiActionHandler<? super ActionT> sduiActionHandler2 = (i2 & 16) != 0 ? null : sduiActionHandler;
        HorizontalPadding horizontalPadding2 = (i2 & 32) != 0 ? HorizontalPadding.Default : horizontalPadding;
        Arrangement.Vertical top = (i2 & 64) != 0 ? Arrangement.INSTANCE.getTop() : vertical;
        Alignment.Horizontal start = (i2 & 128) != 0 ? Alignment.INSTANCE.getStart() : horizontal;
        boolean z2 = (i2 & 256) != 0 ? false : z;
        Intrinsics.reifiedOperationMarker(4, "ActionT");
        int i3 = i << 3;
        SduiColumnIdl(components, parseAction, Parcelable.class, modifier2, sduiStateHandler32, sduiActionHandler2, horizontalPadding2, top, start, z2, composer, (i & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (29360128 & i3) | (234881024 & i3) | (i3 & 1879048192), 0);
        composer.endReplaceGroup();
    }

    @PublishedApi
    public static final <ActionT> void sduiItems(LazyListScope lazyListScope, final ImmutableList<UIComponentDto> components, final Function1<? super ActionDto, ? extends ActionT> parseAction, final Class<ActionT> actionClass, final SduiStateHandler3 sduiStateHandler3, final SduiActionHandler<? super ActionT> sduiActionHandler, final HorizontalPadding horizontalPadding) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Intrinsics.checkNotNullParameter(actionClass, "actionClass");
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        final SduiColumnsIdlKt$sduiItems$$inlined$items$default$1 sduiColumnsIdlKt$sduiItems$$inlined$items$default$1 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdlKt$sduiItems$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(UIComponentDto uIComponentDto) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((UIComponentDto) obj);
            }
        };
        lazyListScope.items(components.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdlKt$sduiItems$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return sduiColumnsIdlKt$sduiItems$$inlined$items$default$1.invoke(components.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdlKt$sduiItems$$inlined$items$default$4
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
                final UIComponentDto uIComponentDto = (UIComponentDto) components.get(i);
                composer.startReplaceGroup(-2111231177);
                ProvidedValue<?>[] providedValueArrProvidedValues = SduiColumns.providedValues(actionClass, sduiStateHandler3);
                ProvidedValue[] providedValueArr = (ProvidedValue[]) Arrays.copyOf(providedValueArrProvidedValues, providedValueArrProvidedValues.length);
                final SduiActionHandler sduiActionHandler2 = sduiActionHandler;
                final Function1 function1 = parseAction;
                final HorizontalPadding horizontalPadding2 = horizontalPadding;
                CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambda3.rememberComposableLambda(-1043494369, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdlKt$sduiItems$1$1
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
                            ComposerKt.traceEventStart(-1043494369, i4, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.sduiItems.<anonymous>.<anonymous> (SduiColumnsIdl.kt:116)");
                        }
                        SduiActionHandler<ActionT> sduiActionHandler3 = sduiActionHandler2;
                        final UIComponentDto uIComponentDto2 = uIComponentDto;
                        final Function1<ActionDto, ActionT> function12 = function1;
                        final HorizontalPadding horizontalPadding3 = horizontalPadding2;
                        SduiActionHandler3.ProvideActionHandler(sduiActionHandler3, ComposableLambda3.rememberComposableLambda(-1493792128, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdlKt$sduiItems$1$1.1
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
                                    ComposerKt.traceEventStart(-1493792128, i5, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.sduiItems.<anonymous>.<anonymous>.<anonymous> (SduiColumnsIdl.kt:117)");
                                }
                                SduiColumnsIdl.LazySduiComponent(uIComponentDto2, function12, horizontalPadding3, false, composer3, 0, 8);
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

    /* JADX WARN: Removed duplicated region for block: B:103:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5 A[PHI: r14
      0x00a5: PHI (r14v14 int) = (r14v0 int), (r14v6 int), (r14v7 int) binds: [B:56:0x00a3, B:66:0x00bd, B:65:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010e  */
    @PublishedApi
    @JvmName
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiColumnIdl(final ImmutableList<UIComponentDto> components, final Function1<? super ActionDto, ? extends ActionT> parseAction, final Class<ActionT> actionClass, Modifier modifier, SduiStateHandler3 sduiStateHandler3, SduiActionHandler<? super ActionT> sduiActionHandler, HorizontalPadding horizontalPadding, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        SduiStateHandler3 sduiStateHandler32;
        int i5;
        int i6;
        int i7;
        Arrangement.Vertical vertical2;
        int i8;
        int i9;
        int i10;
        int i11;
        SduiActionHandler<? super ActionT> sduiActionHandler2;
        final Alignment.Horizontal horizontal2;
        final HorizontalPadding horizontalPadding2;
        Composer composer2;
        final SduiStateHandler3 sduiStateHandler33;
        final Arrangement.Vertical vertical3;
        final boolean z2;
        final SduiActionHandler<? super ActionT> sduiActionHandler3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Intrinsics.checkNotNullParameter(actionClass, "actionClass");
        Composer composerStartRestartGroup = composer.startRestartGroup(-78456165);
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
            i3 |= composerStartRestartGroup.changedInstance(parseAction) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(actionClass) ? 256 : 128;
        }
        int i12 = i2 & 8;
        if (i12 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    sduiStateHandler32 = sduiStateHandler3;
                    i3 |= composerStartRestartGroup.changed(sduiStateHandler32) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                int i13 = 196608;
                if (i5 != 0) {
                    i3 |= i13;
                } else if ((196608 & i) == 0) {
                    i13 = (262144 & i) == 0 ? composerStartRestartGroup.changed(sduiActionHandler) : composerStartRestartGroup.changedInstance(sduiActionHandler) ? 131072 : 65536;
                    i3 |= i13;
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
                    vertical2 = vertical;
                } else {
                    vertical2 = vertical;
                    if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changed(vertical2) ? 8388608 : 4194304;
                    }
                }
                i8 = i2 & 256;
                if (i8 != 0) {
                    i3 |= 100663296;
                } else {
                    if ((i & 100663296) == 0) {
                        i9 = i8;
                        i3 |= composerStartRestartGroup.changed(horizontal) ? 67108864 : 33554432;
                    }
                    i10 = i2 & 512;
                    if (i10 != 0) {
                        if ((i & 805306368) == 0) {
                            i11 = i10;
                            i3 |= composerStartRestartGroup.changed(z) ? 536870912 : 268435456;
                        }
                        if ((i3 & 306783379) != 306783378 || !composerStartRestartGroup.getSkipping()) {
                            if (i12 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            SduiStateHandler3 sduiStateHandler34 = i4 == 0 ? null : sduiStateHandler32;
                            SduiActionHandler<? super ActionT> sduiActionHandler4 = i5 == 0 ? sduiActionHandler : null;
                            final HorizontalPadding horizontalPadding3 = i6 == 0 ? HorizontalPadding.Default : horizontalPadding;
                            final Arrangement.Vertical top = i7 == 0 ? Arrangement.INSTANCE.getTop() : vertical2;
                            Alignment.Horizontal start = i9 == 0 ? Alignment.INSTANCE.getStart() : horizontal;
                            boolean z3 = i11 == 0 ? false : z;
                            if (ComposerKt.isTraceInProgress()) {
                                sduiActionHandler2 = sduiActionHandler4;
                            } else {
                                sduiActionHandler2 = sduiActionHandler4;
                                ComposerKt.traceEventStart(-78456165, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumn (SduiColumnsIdl.kt:183)");
                            }
                            ProvidedValue<?>[] providedValueArrProvidedValues = SduiColumns.providedValues(actionClass, sduiStateHandler34);
                            final Modifier modifier3 = modifier2;
                            final Alignment.Horizontal horizontal3 = start;
                            final boolean z4 = z3;
                            SduiStateHandler3 sduiStateHandler35 = sduiStateHandler34;
                            final SduiActionHandler<? super ActionT> sduiActionHandler5 = sduiActionHandler2;
                            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) Arrays.copyOf(providedValueArrProvidedValues, providedValueArrProvidedValues.length), ComposableLambda3.rememberComposableLambda(-1443742245, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdlKt.SduiColumn.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i14) {
                                    if ((i14 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1443742245, i14, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumn.<anonymous> (SduiColumnsIdl.kt:190)");
                                    }
                                    SduiActionHandler<ActionT> sduiActionHandler6 = sduiActionHandler5;
                                    final Modifier modifier4 = modifier3;
                                    final Arrangement.Vertical vertical4 = top;
                                    final Alignment.Horizontal horizontal4 = horizontal3;
                                    final ImmutableList<UIComponentDto> immutableList = components;
                                    final boolean z5 = z4;
                                    final Function1<ActionDto, ActionT> function1 = parseAction;
                                    final HorizontalPadding horizontalPadding4 = horizontalPadding3;
                                    SduiActionHandler3.ProvideActionHandler(sduiActionHandler6, ComposableLambda3.rememberComposableLambda(-681153510, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdlKt.SduiColumn.1.1
                                        public final void invoke(Composer composer4, int i15) {
                                            if ((i15 & 3) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-681153510, i15, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumn.<anonymous>.<anonymous> (SduiColumnsIdl.kt:191)");
                                            }
                                            Modifier modifier5 = modifier4;
                                            Arrangement.Vertical vertical5 = vertical4;
                                            Alignment.Horizontal horizontal5 = horizontal4;
                                            ImmutableList<UIComponentDto> immutableList2 = immutableList;
                                            boolean z6 = z5;
                                            Function1<ActionDto, ActionT> function12 = function1;
                                            HorizontalPadding horizontalPadding5 = horizontalPadding4;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(vertical5, horizontal5, composer4, 0);
                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifier5);
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
                                            composer4.startReplaceGroup(216168449);
                                            Iterator<UIComponentDto> it = immutableList2.iterator();
                                            while (it.hasNext()) {
                                                SduiComponentIdl.SduiComponent(it.next(), function12, (z6 && Intrinsics.areEqual(horizontal5, Alignment.INSTANCE.getStart())) ? SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null) : Modifier.INSTANCE, horizontalPadding5, composer4, 0, 0);
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
                            horizontal2 = horizontal3;
                            horizontalPadding2 = horizontalPadding3;
                            composer2 = composerStartRestartGroup;
                            sduiStateHandler33 = sduiStateHandler35;
                            modifier2 = modifier3;
                            vertical3 = top;
                            z2 = z4;
                            sduiActionHandler3 = sduiActionHandler5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            sduiActionHandler3 = sduiActionHandler;
                            horizontalPadding2 = horizontalPadding;
                            horizontal2 = horizontal;
                            sduiStateHandler33 = sduiStateHandler32;
                            composer2 = composerStartRestartGroup;
                            vertical3 = vertical2;
                            z2 = z;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdlKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return SduiColumnsIdl.SduiColumn$lambda$3(components, parseAction, actionClass, modifier2, sduiStateHandler33, sduiActionHandler3, horizontalPadding2, vertical3, horizontal2, z2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 805306368;
                    i11 = i10;
                    if ((i3 & 306783379) != 306783378) {
                        if (i12 != 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ProvidedValue<?>[] providedValueArrProvidedValues2 = SduiColumns.providedValues(actionClass, sduiStateHandler34);
                        final Modifier modifier32 = modifier2;
                        final Alignment.Horizontal horizontal32 = start;
                        final boolean z42 = z3;
                        SduiStateHandler3 sduiStateHandler352 = sduiStateHandler34;
                        final SduiActionHandler<? super ActionT> sduiActionHandler52 = sduiActionHandler2;
                        CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) Arrays.copyOf(providedValueArrProvidedValues2, providedValueArrProvidedValues2.length), ComposableLambda3.rememberComposableLambda(-1443742245, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdlKt.SduiColumn.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i14) {
                                if ((i14 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1443742245, i14, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumn.<anonymous> (SduiColumnsIdl.kt:190)");
                                }
                                SduiActionHandler<ActionT> sduiActionHandler6 = sduiActionHandler52;
                                final Modifier modifier4 = modifier32;
                                final Arrangement.Vertical vertical4 = top;
                                final Alignment.Horizontal horizontal4 = horizontal32;
                                final ImmutableList<UIComponentDto> immutableList = components;
                                final boolean z5 = z42;
                                final Function1<? super ActionDto, ? extends ActionT> function1 = parseAction;
                                final HorizontalPadding horizontalPadding4 = horizontalPadding3;
                                SduiActionHandler3.ProvideActionHandler(sduiActionHandler6, ComposableLambda3.rememberComposableLambda(-681153510, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdlKt.SduiColumn.1.1
                                    public final void invoke(Composer composer4, int i15) {
                                        if ((i15 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-681153510, i15, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumn.<anonymous>.<anonymous> (SduiColumnsIdl.kt:191)");
                                        }
                                        Modifier modifier5 = modifier4;
                                        Arrangement.Vertical vertical5 = vertical4;
                                        Alignment.Horizontal horizontal5 = horizontal4;
                                        ImmutableList<UIComponentDto> immutableList2 = immutableList;
                                        boolean z6 = z5;
                                        Function1<ActionDto, ActionT> function12 = function1;
                                        HorizontalPadding horizontalPadding5 = horizontalPadding4;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(vertical5, horizontal5, composer4, 0);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifier5);
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
                                        composer4.startReplaceGroup(216168449);
                                        Iterator<UIComponentDto> it = immutableList2.iterator();
                                        while (it.hasNext()) {
                                            SduiComponentIdl.SduiComponent(it.next(), function12, (z6 && Intrinsics.areEqual(horizontal5, Alignment.INSTANCE.getStart())) ? SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null) : Modifier.INSTANCE, horizontalPadding5, composer4, 0, 0);
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
                        horizontal2 = horizontal32;
                        horizontalPadding2 = horizontalPadding3;
                        composer2 = composerStartRestartGroup;
                        sduiStateHandler33 = sduiStateHandler352;
                        modifier2 = modifier32;
                        vertical3 = top;
                        z2 = z42;
                        sduiActionHandler3 = sduiActionHandler52;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i9 = i8;
                i10 = i2 & 512;
                if (i10 != 0) {
                }
                i11 = i10;
                if ((i3 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            sduiStateHandler32 = sduiStateHandler3;
            i5 = i2 & 32;
            int i132 = 196608;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i8 = i2 & 256;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i2 & 512;
            if (i10 != 0) {
            }
            i11 = i10;
            if ((i3 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        sduiStateHandler32 = sduiStateHandler3;
        i5 = i2 & 32;
        int i1322 = 196608;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i8 = i2 & 256;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i2 & 512;
        if (i10 != 0) {
        }
        i11 = i10;
        if ((i3 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final /* synthetic */ <ActionT> void SduiColumn(ImmutableList<? extends UIComponentDto.ConcreteDto> components, Function1<? super ActionDto, ? extends ActionT> parseAction, Modifier modifier, SduiStateHandler3 sduiStateHandler3, SduiActionHandler<? super ActionT> sduiActionHandler, HorizontalPadding horizontalPadding, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, boolean z, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        composer.startReplaceGroup(40010095);
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.INSTANCE : modifier;
        SduiStateHandler3 sduiStateHandler32 = (i2 & 8) != 0 ? null : sduiStateHandler3;
        SduiActionHandler<? super ActionT> sduiActionHandler2 = (i2 & 16) != 0 ? null : sduiActionHandler;
        HorizontalPadding horizontalPadding2 = (i2 & 32) != 0 ? HorizontalPadding.Default : horizontalPadding;
        Arrangement.Vertical top = (i2 & 64) != 0 ? Arrangement.INSTANCE.getTop() : vertical;
        Alignment.Horizontal start = (i2 & 128) != 0 ? Alignment.INSTANCE.getStart() : horizontal;
        boolean z2 = (i2 & 256) != 0 ? false : z;
        Intrinsics.reifiedOperationMarker(4, "ActionT");
        int i3 = i << 3;
        SduiColumn(components, parseAction, Object.class, modifier2, sduiStateHandler32, sduiActionHandler2, horizontalPadding2, top, start, z2, composer, (i & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (29360128 & i3) | (234881024 & i3) | (i3 & 1879048192), 0);
        composer.endReplaceGroup();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5 A[PHI: r14
      0x00a5: PHI (r14v14 int) = (r14v0 int), (r14v6 int), (r14v7 int) binds: [B:56:0x00a3, B:66:0x00bd, B:65:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010e  */
    @PublishedApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT> void SduiColumn(final ImmutableList<? extends UIComponentDto.ConcreteDto> components, final Function1<? super ActionDto, ? extends ActionT> parseAction, final Class<ActionT> actionClass, Modifier modifier, SduiStateHandler3 sduiStateHandler3, SduiActionHandler<? super ActionT> sduiActionHandler, HorizontalPadding horizontalPadding, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        SduiStateHandler3 sduiStateHandler32;
        int i5;
        int i6;
        int i7;
        Arrangement.Vertical vertical2;
        int i8;
        int i9;
        int i10;
        int i11;
        SduiActionHandler<? super ActionT> sduiActionHandler2;
        final Alignment.Horizontal horizontal2;
        final HorizontalPadding horizontalPadding2;
        Composer composer2;
        final SduiStateHandler3 sduiStateHandler33;
        final Arrangement.Vertical vertical3;
        final boolean z2;
        final SduiActionHandler<? super ActionT> sduiActionHandler3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Intrinsics.checkNotNullParameter(actionClass, "actionClass");
        Composer composerStartRestartGroup = composer.startRestartGroup(-78456165);
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
            i3 |= composerStartRestartGroup.changedInstance(parseAction) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(actionClass) ? 256 : 128;
        }
        int i12 = i2 & 8;
        if (i12 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    sduiStateHandler32 = sduiStateHandler3;
                    i3 |= composerStartRestartGroup.changed(sduiStateHandler32) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                int i13 = 196608;
                if (i5 != 0) {
                    i3 |= i13;
                } else if ((196608 & i) == 0) {
                    i13 = (262144 & i) == 0 ? composerStartRestartGroup.changed(sduiActionHandler) : composerStartRestartGroup.changedInstance(sduiActionHandler) ? 131072 : 65536;
                    i3 |= i13;
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
                    vertical2 = vertical;
                } else {
                    vertical2 = vertical;
                    if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changed(vertical2) ? 8388608 : 4194304;
                    }
                }
                i8 = i2 & 256;
                if (i8 != 0) {
                    i3 |= 100663296;
                } else {
                    if ((i & 100663296) == 0) {
                        i9 = i8;
                        i3 |= composerStartRestartGroup.changed(horizontal) ? 67108864 : 33554432;
                    }
                    i10 = i2 & 512;
                    if (i10 != 0) {
                        if ((i & 805306368) == 0) {
                            i11 = i10;
                            i3 |= composerStartRestartGroup.changed(z) ? 536870912 : 268435456;
                        }
                        if ((i3 & 306783379) != 306783378 || !composerStartRestartGroup.getSkipping()) {
                            if (i12 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            SduiStateHandler3 sduiStateHandler34 = i4 == 0 ? null : sduiStateHandler32;
                            SduiActionHandler<? super ActionT> sduiActionHandler4 = i5 == 0 ? sduiActionHandler : null;
                            final HorizontalPadding horizontalPadding3 = i6 == 0 ? HorizontalPadding.Default : horizontalPadding;
                            final Arrangement.Vertical top = i7 == 0 ? Arrangement.INSTANCE.getTop() : vertical2;
                            Alignment.Horizontal start = i9 == 0 ? Alignment.INSTANCE.getStart() : horizontal;
                            boolean z3 = i11 == 0 ? false : z;
                            if (ComposerKt.isTraceInProgress()) {
                                sduiActionHandler2 = sduiActionHandler4;
                            } else {
                                sduiActionHandler2 = sduiActionHandler4;
                                ComposerKt.traceEventStart(-78456165, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumn (SduiColumnsIdl.kt:253)");
                            }
                            ProvidedValue<?>[] providedValueArrProvidedValues = SduiColumns.providedValues(actionClass, sduiStateHandler34);
                            final Modifier modifier3 = modifier2;
                            final Alignment.Horizontal horizontal3 = start;
                            final boolean z4 = z3;
                            SduiStateHandler3 sduiStateHandler35 = sduiStateHandler34;
                            final SduiActionHandler<? super ActionT> sduiActionHandler5 = sduiActionHandler2;
                            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) Arrays.copyOf(providedValueArrProvidedValues, providedValueArrProvidedValues.length), ComposableLambda3.rememberComposableLambda(-1443742245, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdlKt.SduiColumn.3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i14) {
                                    if ((i14 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1443742245, i14, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumn.<anonymous> (SduiColumnsIdl.kt:260)");
                                    }
                                    SduiActionHandler<ActionT> sduiActionHandler6 = sduiActionHandler5;
                                    final Modifier modifier4 = modifier3;
                                    final Arrangement.Vertical vertical4 = top;
                                    final Alignment.Horizontal horizontal4 = horizontal3;
                                    final ImmutableList<UIComponentDto.ConcreteDto> immutableList = components;
                                    final boolean z5 = z4;
                                    final Function1<ActionDto, ActionT> function1 = parseAction;
                                    final HorizontalPadding horizontalPadding4 = horizontalPadding3;
                                    SduiActionHandler3.ProvideActionHandler(sduiActionHandler6, ComposableLambda3.rememberComposableLambda(-681153510, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdlKt.SduiColumn.3.1
                                        public final void invoke(Composer composer4, int i15) {
                                            if ((i15 & 3) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-681153510, i15, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumn.<anonymous>.<anonymous> (SduiColumnsIdl.kt:261)");
                                            }
                                            Modifier modifier5 = modifier4;
                                            Arrangement.Vertical vertical5 = vertical4;
                                            Alignment.Horizontal horizontal5 = horizontal4;
                                            ImmutableList<UIComponentDto.ConcreteDto> immutableList2 = immutableList;
                                            boolean z6 = z5;
                                            Function1<ActionDto, ActionT> function12 = function1;
                                            HorizontalPadding horizontalPadding5 = horizontalPadding4;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(vertical5, horizontal5, composer4, 0);
                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifier5);
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
                                            composer4.startReplaceGroup(216168449);
                                            Iterator<UIComponentDto.ConcreteDto> it = immutableList2.iterator();
                                            while (it.hasNext()) {
                                                SduiComponentIdl.SduiComponent(it.next(), function12, (z6 && Intrinsics.areEqual(horizontal5, Alignment.INSTANCE.getStart())) ? SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null) : Modifier.INSTANCE, horizontalPadding5, composer4, 0, 0);
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
                            horizontal2 = horizontal3;
                            horizontalPadding2 = horizontalPadding3;
                            composer2 = composerStartRestartGroup;
                            sduiStateHandler33 = sduiStateHandler35;
                            modifier2 = modifier3;
                            vertical3 = top;
                            z2 = z4;
                            sduiActionHandler3 = sduiActionHandler5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            sduiActionHandler3 = sduiActionHandler;
                            horizontalPadding2 = horizontalPadding;
                            horizontal2 = horizontal;
                            sduiStateHandler33 = sduiStateHandler32;
                            composer2 = composerStartRestartGroup;
                            vertical3 = vertical2;
                            z2 = z;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdlKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return SduiColumnsIdl.SduiColumn$lambda$4(components, parseAction, actionClass, modifier2, sduiStateHandler33, sduiActionHandler3, horizontalPadding2, vertical3, horizontal2, z2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 805306368;
                    i11 = i10;
                    if ((i3 & 306783379) != 306783378) {
                        if (i12 != 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ProvidedValue<?>[] providedValueArrProvidedValues2 = SduiColumns.providedValues(actionClass, sduiStateHandler34);
                        final Modifier modifier32 = modifier2;
                        final Alignment.Horizontal horizontal32 = start;
                        final boolean z42 = z3;
                        SduiStateHandler3 sduiStateHandler352 = sduiStateHandler34;
                        final SduiActionHandler<? super ActionT> sduiActionHandler52 = sduiActionHandler2;
                        CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) Arrays.copyOf(providedValueArrProvidedValues2, providedValueArrProvidedValues2.length), ComposableLambda3.rememberComposableLambda(-1443742245, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdlKt.SduiColumn.3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i14) {
                                if ((i14 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1443742245, i14, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumn.<anonymous> (SduiColumnsIdl.kt:260)");
                                }
                                SduiActionHandler<ActionT> sduiActionHandler6 = sduiActionHandler52;
                                final Modifier modifier4 = modifier32;
                                final Arrangement.Vertical vertical4 = top;
                                final Alignment.Horizontal horizontal4 = horizontal32;
                                final ImmutableList<? extends UIComponentDto.ConcreteDto> immutableList = components;
                                final boolean z5 = z42;
                                final Function1<? super ActionDto, ? extends ActionT> function1 = parseAction;
                                final HorizontalPadding horizontalPadding4 = horizontalPadding3;
                                SduiActionHandler3.ProvideActionHandler(sduiActionHandler6, ComposableLambda3.rememberComposableLambda(-681153510, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdlKt.SduiColumn.3.1
                                    public final void invoke(Composer composer4, int i15) {
                                        if ((i15 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-681153510, i15, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumn.<anonymous>.<anonymous> (SduiColumnsIdl.kt:261)");
                                        }
                                        Modifier modifier5 = modifier4;
                                        Arrangement.Vertical vertical5 = vertical4;
                                        Alignment.Horizontal horizontal5 = horizontal4;
                                        ImmutableList<UIComponentDto.ConcreteDto> immutableList2 = immutableList;
                                        boolean z6 = z5;
                                        Function1<ActionDto, ActionT> function12 = function1;
                                        HorizontalPadding horizontalPadding5 = horizontalPadding4;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(vertical5, horizontal5, composer4, 0);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifier5);
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
                                        composer4.startReplaceGroup(216168449);
                                        Iterator<UIComponentDto.ConcreteDto> it = immutableList2.iterator();
                                        while (it.hasNext()) {
                                            SduiComponentIdl.SduiComponent(it.next(), function12, (z6 && Intrinsics.areEqual(horizontal5, Alignment.INSTANCE.getStart())) ? SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null) : Modifier.INSTANCE, horizontalPadding5, composer4, 0, 0);
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
                        horizontal2 = horizontal32;
                        horizontalPadding2 = horizontalPadding3;
                        composer2 = composerStartRestartGroup;
                        sduiStateHandler33 = sduiStateHandler352;
                        modifier2 = modifier32;
                        vertical3 = top;
                        z2 = z42;
                        sduiActionHandler3 = sduiActionHandler52;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i9 = i8;
                i10 = i2 & 512;
                if (i10 != 0) {
                }
                i11 = i10;
                if ((i3 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            sduiStateHandler32 = sduiStateHandler3;
            i5 = i2 & 32;
            int i132 = 196608;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i8 = i2 & 256;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i2 & 512;
            if (i10 != 0) {
            }
            i11 = i10;
            if ((i3 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        sduiStateHandler32 = sduiStateHandler3;
        i5 = i2 & 32;
        int i1322 = 196608;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i8 = i2 & 256;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i2 & 512;
        if (i10 != 0) {
        }
        i11 = i10;
        if ((i3 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
