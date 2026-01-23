package com.robinhood.android.directdeposit.p101ui.ddbrokerageexperiment;

import com.robinhood.models.serverdriven.experimental.api.DirectDepositToBrokeragePageAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectDepositBrokerageExperimentDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u000e\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/ddbrokerageexperiment/DirectDepositBrokerageExperimentViewState;", "", DirectDepositBrokerageExperimentPage.SDUI_CONTENT, "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/DirectDepositToBrokeragePageAction;", DirectDepositBrokerageExperimentPage.FOOTER_CONTENT, "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getSduiContent", "()Ljava/util/List;", "getFooterContent", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final /* data */ class DirectDepositBrokerageExperimentViewState {
    public static final int $stable = 8;
    private final List<UIComponent<DirectDepositToBrokeragePageAction>> footerContent;
    private final List<UIComponent<DirectDepositToBrokeragePageAction>> sduiContent;

    /* JADX WARN: Multi-variable type inference failed */
    public DirectDepositBrokerageExperimentViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DirectDepositBrokerageExperimentViewState copy$default(DirectDepositBrokerageExperimentViewState directDepositBrokerageExperimentViewState, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = directDepositBrokerageExperimentViewState.sduiContent;
        }
        if ((i & 2) != 0) {
            list2 = directDepositBrokerageExperimentViewState.footerContent;
        }
        return directDepositBrokerageExperimentViewState.copy(list, list2);
    }

    public final List<UIComponent<DirectDepositToBrokeragePageAction>> component1() {
        return this.sduiContent;
    }

    public final List<UIComponent<DirectDepositToBrokeragePageAction>> component2() {
        return this.footerContent;
    }

    public final DirectDepositBrokerageExperimentViewState copy(List<? extends UIComponent<? extends DirectDepositToBrokeragePageAction>> sduiContent, List<? extends UIComponent<? extends DirectDepositToBrokeragePageAction>> footerContent) {
        return new DirectDepositBrokerageExperimentViewState(sduiContent, footerContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DirectDepositBrokerageExperimentViewState)) {
            return false;
        }
        DirectDepositBrokerageExperimentViewState directDepositBrokerageExperimentViewState = (DirectDepositBrokerageExperimentViewState) other;
        return Intrinsics.areEqual(this.sduiContent, directDepositBrokerageExperimentViewState.sduiContent) && Intrinsics.areEqual(this.footerContent, directDepositBrokerageExperimentViewState.footerContent);
    }

    public int hashCode() {
        List<UIComponent<DirectDepositToBrokeragePageAction>> list = this.sduiContent;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<UIComponent<DirectDepositToBrokeragePageAction>> list2 = this.footerContent;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "DirectDepositBrokerageExperimentViewState(sduiContent=" + this.sduiContent + ", footerContent=" + this.footerContent + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DirectDepositBrokerageExperimentViewState(List<? extends UIComponent<? extends DirectDepositToBrokeragePageAction>> list, List<? extends UIComponent<? extends DirectDepositToBrokeragePageAction>> list2) {
        this.sduiContent = list;
        this.footerContent = list2;
    }

    public /* synthetic */ DirectDepositBrokerageExperimentViewState(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }

    public final List<UIComponent<DirectDepositToBrokeragePageAction>> getSduiContent() {
        return this.sduiContent;
    }

    public final List<UIComponent<DirectDepositToBrokeragePageAction>> getFooterContent() {
        return this.footerContent;
    }
}
