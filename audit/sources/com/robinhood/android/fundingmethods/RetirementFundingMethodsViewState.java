package com.robinhood.android.fundingmethods;

import com.robinhood.android.models.retirement.api.ApiRetirementFundingMethodsResponse;
import com.robinhood.android.models.retirement.api.RetirementFundingMethod;
import com.robinhood.android.models.retirement.api.RetirementFundingMethodSection;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.PlainText;
import com.robinhood.models.serverdriven.experimental.api.Text;
import com.robinhood.models.serverdriven.experimental.api.TextStyle;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: RetirementFundingMethodsViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00042\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/fundingmethods/RetirementFundingMethodsViewState;", "", "Loading", "Content", "Companion", "Lcom/robinhood/android/fundingmethods/RetirementFundingMethodsViewState$Content;", "Lcom/robinhood/android/fundingmethods/RetirementFundingMethodsViewState$Loading;", "feature-retirement-funding-methods_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface RetirementFundingMethodsViewState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: RetirementFundingMethodsViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/fundingmethods/RetirementFundingMethodsViewState$Loading;", "Lcom/robinhood/android/fundingmethods/RetirementFundingMethodsViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-funding-methods_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements RetirementFundingMethodsViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1104545529;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: RetirementFundingMethodsViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/fundingmethods/RetirementFundingMethodsViewState$Content;", "Lcom/robinhood/android/fundingmethods/RetirementFundingMethodsViewState;", "fundingMethods", "Lcom/robinhood/android/models/retirement/api/ApiRetirementFundingMethodsResponse;", "<init>", "(Lcom/robinhood/android/models/retirement/api/ApiRetirementFundingMethodsResponse;)V", "getFundingMethods", "()Lcom/robinhood/android/models/retirement/api/ApiRetirementFundingMethodsResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-funding-methods_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Content implements RetirementFundingMethodsViewState {
        public static final int $stable = 8;
        private final ApiRetirementFundingMethodsResponse fundingMethods;

        public static /* synthetic */ Content copy$default(Content content, ApiRetirementFundingMethodsResponse apiRetirementFundingMethodsResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                apiRetirementFundingMethodsResponse = content.fundingMethods;
            }
            return content.copy(apiRetirementFundingMethodsResponse);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiRetirementFundingMethodsResponse getFundingMethods() {
            return this.fundingMethods;
        }

        public final Content copy(ApiRetirementFundingMethodsResponse fundingMethods) {
            Intrinsics.checkNotNullParameter(fundingMethods, "fundingMethods");
            return new Content(fundingMethods);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Content) && Intrinsics.areEqual(this.fundingMethods, ((Content) other).fundingMethods);
        }

        public int hashCode() {
            return this.fundingMethods.hashCode();
        }

        public String toString() {
            return "Content(fundingMethods=" + this.fundingMethods + ")";
        }

        public Content(ApiRetirementFundingMethodsResponse fundingMethods) {
            Intrinsics.checkNotNullParameter(fundingMethods, "fundingMethods");
            this.fundingMethods = fundingMethods;
        }

        public final ApiRetirementFundingMethodsResponse getFundingMethods() {
            return this.fundingMethods;
        }
    }

    /* compiled from: RetirementFundingMethodsViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/fundingmethods/RetirementFundingMethodsViewState$Companion;", "", "<init>", "()V", "selectedMethod", "Lcom/robinhood/android/models/retirement/api/RetirementFundingMethod;", "loadingMock", "Lcom/robinhood/android/fundingmethods/RetirementFundingMethodsViewState$Content;", "getLoadingMock", "()Lcom/robinhood/android/fundingmethods/RetirementFundingMethodsViewState$Content;", "feature-retirement-funding-methods_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Content loadingMock;
        private static final RetirementFundingMethod selectedMethod;

        private Companion() {
        }

        static {
            RetirementFundingMethod retirementFundingMethod = new RetirementFundingMethod("---- - --- ------------", "---------- ------ ---- ------ ----", Icon.RETIREMENT_24, "", "", null, false);
            selectedMethod = retirementFundingMethod;
            ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(new Text(new PlainText("--- -- --- ---- -- ---- ---- ----------- ----"), TextStyle.DISPLAY_MEDIUM, null, null, null, 28, null));
            RetirementFundingMethodSection retirementFundingMethodSection = new RetirementFundingMethodSection(null, null, CollectionsKt.listOf(retirementFundingMethod));
            ArrayList arrayList = new ArrayList(3);
            for (int i = 0; i < 3; i++) {
                arrayList.add(new RetirementFundingMethod("----- -- -------- --------", "----------- ---- ---- ---- ----------", Icon.RETIREMENT_24, "", "", null, false));
            }
            loadingMock = new Content(new ApiRetirementFundingMethodsResponse(immutableList3PersistentListOf, extensions2.persistentListOf(retirementFundingMethodSection, new RetirementFundingMethodSection("----- ----", null, arrayList)), "--------", extensions2.persistentListOf()));
        }

        public final Content getLoadingMock() {
            return loadingMock;
        }
    }
}
