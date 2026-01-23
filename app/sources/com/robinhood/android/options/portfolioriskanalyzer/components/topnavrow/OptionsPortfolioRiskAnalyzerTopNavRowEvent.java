package com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsPortfolioRiskAnalyzerTopNavRowEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/topnavrow/OptionsPortfolioRiskAnalyzerTopNavRowEvent;", "", "<init>", "()V", "UpdateUnderlyingId", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/topnavrow/OptionsPortfolioRiskAnalyzerTopNavRowEvent$UpdateUnderlyingId;", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public abstract class OptionsPortfolioRiskAnalyzerTopNavRowEvent {
    public static final int $stable = 0;

    public /* synthetic */ OptionsPortfolioRiskAnalyzerTopNavRowEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerTopNavRowEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/topnavrow/OptionsPortfolioRiskAnalyzerTopNavRowEvent$UpdateUnderlyingId;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/topnavrow/OptionsPortfolioRiskAnalyzerTopNavRowEvent;", "id", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UpdateUnderlyingId extends OptionsPortfolioRiskAnalyzerTopNavRowEvent {
        public static final int $stable = 8;
        private final UUID id;

        public static /* synthetic */ UpdateUnderlyingId copy$default(UpdateUnderlyingId updateUnderlyingId, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = updateUnderlyingId.id;
            }
            return updateUnderlyingId.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        public final UpdateUnderlyingId copy(UUID id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new UpdateUnderlyingId(id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateUnderlyingId) && Intrinsics.areEqual(this.id, ((UpdateUnderlyingId) other).id);
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return "UpdateUnderlyingId(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateUnderlyingId(UUID id) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
        }

        public final UUID getId() {
            return this.id;
        }
    }

    private OptionsPortfolioRiskAnalyzerTopNavRowEvent() {
    }
}
