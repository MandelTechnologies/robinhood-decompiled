package com.robinhood.android.feature.margincallresolve.p139ui;

import androidx.compose.p011ui.tooling.preview.datasource.CollectionPreviewParameterProvider;
import com.robinhood.android.feature.margincallresolve.DayTradeResolveState3;
import com.robinhood.android.lib.margincallresolve.api.models.ApiDayTradeCallView;
import com.robinhood.android.lib.margincallresolve.api.models.ApiDayTradeValueProps;
import com.robinhood.android.lib.margincallresolve.api.models.DayTradeCallIcon;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.ButtonType;
import com.robinhood.models.serverdriven.experimental.api.DismissAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: DayTradeResolveComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/feature/margincallresolve/ui/DayTradeResolveViewStateParameterProvider;", "Landroidx/compose/ui/tooling/preview/datasource/CollectionPreviewParameterProvider;", "Lcom/robinhood/android/feature/margincallresolve/DayTradeResolveViewState;", "<init>", "()V", "feature-margin-call-resolve_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.margincallresolve.ui.DayTradeResolveViewStateParameterProvider, reason: use source file name */
/* loaded from: classes3.dex */
public final class DayTradeResolveComposable7 extends CollectionPreviewParameterProvider<DayTradeResolveState3> {
    public static final int $stable = CollectionPreviewParameterProvider.$stable;

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DayTradeResolveComposable7() {
        DayTradeCallIcon dayTradeCallIcon = DayTradeCallIcon.DAY_TRADE_CALL;
        List listListOf = CollectionsKt.listOf(new ApiDayTradeValueProps(dayTradeCallIcon, "Something", "Details about something"));
        ButtonType buttonType = ButtonType.PRIMARY;
        super(CollectionsKt.listOf((Object[]) new DayTradeResolveState3[]{DayTradeResolveState3.Loading.INSTANCE, new DayTradeResolveState3.InDayTradeCall(new ApiDayTradeCallView("123456", "You're in a $420.69 Day Trade Call", "", "$420.69", "$420.69", true, listListOf, CollectionsKt.listOf(new Button("Deposit funds", buttonType, new GenericAction.Dismiss(new DismissAction(false)), true, null, null, null, null, null, null, 1008, null)))), new DayTradeResolveState3.NotInDayTradeCall(new ApiDayTradeCallView("123456", "You're blah 420.69", "Bad things will happen", "420.69", "420.69", true, CollectionsKt.listOf(new ApiDayTradeValueProps(dayTradeCallIcon, "Something", "Details about something")), CollectionsKt.listOf(new Button("Deposit funds", buttonType, new GenericAction.Dismiss(new DismissAction(false)), true, null, null, null, null, null, null, 1008, null)))), new DayTradeResolveState3.Error(new Throwable())}));
    }
}
