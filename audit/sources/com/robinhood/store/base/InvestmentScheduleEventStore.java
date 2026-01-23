package com.robinhood.store.base;

import com.robinhood.recurring.models.p366ui.UiInvestmentScheduleEvent;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

/* compiled from: InvestmentScheduleEventStore.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\t\u001a\u00020\u0007H&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u000b\u001a\u00020\u0007H&J\u001c\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0007H&J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0007H&¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/store/base/InvestmentScheduleEventStore;", "", "streamInvestmentScheduleEventBySchedule", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/robinhood/recurring/models/ui/UiInvestmentScheduleEvent;", "scheduleId", "Ljava/util/UUID;", "streamInvestmentScheduleEventByAchTransfer", "achTransferId", "streamInvestmentScheduleEventByOrder", "orderId", "refresh", "", "force", "", "accountNumber", "", "refreshAccountFirstPage", "refreshByAchTransfer", "refreshByOrder", "lib-store-base_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface InvestmentScheduleEventStore {
    void refresh(boolean force, String accountNumber);

    void refreshAccountFirstPage(String accountNumber, boolean force);

    void refreshByAchTransfer(boolean force, UUID achTransferId);

    void refreshByOrder(boolean force, UUID orderId);

    Flow<UiInvestmentScheduleEvent> streamInvestmentScheduleEventByAchTransfer(UUID achTransferId);

    Flow<UiInvestmentScheduleEvent> streamInvestmentScheduleEventByOrder(UUID orderId);

    Flow<List<UiInvestmentScheduleEvent>> streamInvestmentScheduleEventBySchedule(UUID scheduleId);

    /* compiled from: InvestmentScheduleEventStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void refresh$default(InvestmentScheduleEventStore investmentScheduleEventStore, boolean z, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refresh");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            investmentScheduleEventStore.refresh(z, str);
        }
    }
}
