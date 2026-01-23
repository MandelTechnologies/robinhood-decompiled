package com.robinhood.android.settings.p254ui.recurring.detail;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentScheduleSettingsRows.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsType;", "", "Default", "Syp", "Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsType$Default;", "Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsType$Syp;", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface InvestmentScheduleSettingsType {

    /* compiled from: InvestmentScheduleSettingsRows.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsType$Default;", "Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsType;", "<init>", "()V", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Default implements InvestmentScheduleSettingsType {
        public static final int $stable = 0;
        public static final Default INSTANCE = new Default();

        private Default() {
        }
    }

    /* compiled from: InvestmentScheduleSettingsRows.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsType$Syp;", "Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsType;", "deleteButtonText", "Lcom/robinhood/utils/resource/StringResource;", "toggleRes", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;I)V", "getDeleteButtonText", "()Lcom/robinhood/utils/resource/StringResource;", "getToggleRes", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Syp implements InvestmentScheduleSettingsType {
        public static final int $stable = StringResource.$stable;
        private final StringResource deleteButtonText;
        private final int toggleRes;

        public static /* synthetic */ Syp copy$default(Syp syp, StringResource stringResource, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                stringResource = syp.deleteButtonText;
            }
            if ((i2 & 2) != 0) {
                i = syp.toggleRes;
            }
            return syp.copy(stringResource, i);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getDeleteButtonText() {
            return this.deleteButtonText;
        }

        /* renamed from: component2, reason: from getter */
        public final int getToggleRes() {
            return this.toggleRes;
        }

        public final Syp copy(StringResource deleteButtonText, int toggleRes) {
            Intrinsics.checkNotNullParameter(deleteButtonText, "deleteButtonText");
            return new Syp(deleteButtonText, toggleRes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Syp)) {
                return false;
            }
            Syp syp = (Syp) other;
            return Intrinsics.areEqual(this.deleteButtonText, syp.deleteButtonText) && this.toggleRes == syp.toggleRes;
        }

        public int hashCode() {
            return (this.deleteButtonText.hashCode() * 31) + Integer.hashCode(this.toggleRes);
        }

        public String toString() {
            return "Syp(deleteButtonText=" + this.deleteButtonText + ", toggleRes=" + this.toggleRes + ")";
        }

        public Syp(StringResource deleteButtonText, int i) {
            Intrinsics.checkNotNullParameter(deleteButtonText, "deleteButtonText");
            this.deleteButtonText = deleteButtonText;
            this.toggleRes = i;
        }

        public final StringResource getDeleteButtonText() {
            return this.deleteButtonText;
        }

        public final int getToggleRes() {
            return this.toggleRes;
        }
    }
}
