package com.robinhood.android.matcha.p177ui.history.detail.request;

import android.content.Context;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.p177ui.history.detail.request.MatchaRequestDetailState4;
import com.robinhood.models.p320db.matcha.MatchaRequest;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MatchaRequestDetailState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/request/Receiver;", "Lcom/robinhood/android/matcha/ui/history/detail/request/RequestState;", "request", "Lcom/robinhood/models/db/matcha/MatchaRequest;", "<init>", "(Lcom/robinhood/models/db/matcha/MatchaRequest;)V", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "primaryAction", "Lcom/robinhood/android/matcha/ui/history/detail/request/RequestState$ButtonAction;", "getPrimaryAction", "()Lcom/robinhood/android/matcha/ui/history/detail/request/RequestState$ButtonAction;", "secondaryAction", "getSecondaryAction", "getSummaryText", "", "context", "Landroid/content/Context;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.matcha.ui.history.detail.request.Receiver, reason: use source file name */
/* loaded from: classes8.dex */
public final class MatchaRequestDetailState3 extends MatchaRequestDetailState4 {
    public static final int $stable = 8;
    private final MatchaRequestDetailState4.ButtonAction primaryAction;
    private final MatchaRequestDetailState4.ButtonAction secondaryAction;
    private final StringResource title;

    /* renamed from: getSummaryText, reason: collision with other method in class */
    public Void m16332getSummaryText(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchaRequestDetailState3(MatchaRequest request) {
        super(request, null);
        Intrinsics.checkNotNullParameter(request, "request");
        StringResource.Companion companion = StringResource.INSTANCE;
        this.title = companion.invoke(C21284R.string.matcha_request_detail_receiver_subtitle, Money.format$default(Money3.toMoney(request.getAmount(), Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null), request.getTransactor().getDisplayName());
        this.secondaryAction = MatchaRequestDetailState2.isUnaccepted(request) ? new MatchaRequestDetailState4.ButtonAction(MatchaRequestDetailState4.Action.CANCEL, companion.invoke(C11048R.string.general_label_cancel, new Object[0])) : null;
    }

    @Override // com.robinhood.android.matcha.p177ui.history.detail.request.MatchaRequestDetailState4
    public /* bridge */ /* synthetic */ StringResource getSummaryText(Context context) {
        return (StringResource) m16332getSummaryText(context);
    }

    @Override // com.robinhood.android.matcha.p177ui.history.detail.request.MatchaRequestDetailState4
    public StringResource getTitle() {
        return this.title;
    }

    @Override // com.robinhood.android.matcha.p177ui.history.detail.request.MatchaRequestDetailState4
    public MatchaRequestDetailState4.ButtonAction getPrimaryAction() {
        return this.primaryAction;
    }

    @Override // com.robinhood.android.matcha.p177ui.history.detail.request.MatchaRequestDetailState4
    public MatchaRequestDetailState4.ButtonAction getSecondaryAction() {
        return this.secondaryAction;
    }
}
