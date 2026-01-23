package com.robinhood.compose.infoscreen;

import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: InfoScreen.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/compose/infoscreen/InfoScreenFooter;", "", "Close", "Sdui", "Lcom/robinhood/compose/infoscreen/InfoScreenFooter$Close;", "Lcom/robinhood/compose/infoscreen/InfoScreenFooter$Sdui;", "lib-compose-info-screen_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public interface InfoScreenFooter {

    /* compiled from: InfoScreen.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/compose/infoscreen/InfoScreenFooter$Close;", "Lcom/robinhood/compose/infoscreen/InfoScreenFooter;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-compose-info-screen_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Close implements InfoScreenFooter {
        public static final int $stable = 0;
        public static final Close INSTANCE = new Close();

        public boolean equals(Object other) {
            return this == other || (other instanceof Close);
        }

        public int hashCode() {
            return -1249510878;
        }

        public String toString() {
            return "Close";
        }

        private Close() {
        }
    }

    /* compiled from: InfoScreen.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/compose/infoscreen/InfoScreenFooter$Sdui;", "Lcom/robinhood/compose/infoscreen/InfoScreenFooter;", "components", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;)V", "getComponents", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-compose-info-screen_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Sdui implements InfoScreenFooter {
        public static final int $stable = 8;
        private final ImmutableList<UIComponent<GenericAction>> components;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Sdui copy$default(Sdui sdui, ImmutableList immutableList, int i, Object obj) {
            if ((i & 1) != 0) {
                immutableList = sdui.components;
            }
            return sdui.copy(immutableList);
        }

        public final ImmutableList<UIComponent<GenericAction>> component1() {
            return this.components;
        }

        public final Sdui copy(ImmutableList<? extends UIComponent<? extends GenericAction>> components) {
            Intrinsics.checkNotNullParameter(components, "components");
            return new Sdui(components);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Sdui) && Intrinsics.areEqual(this.components, ((Sdui) other).components);
        }

        public int hashCode() {
            return this.components.hashCode();
        }

        public String toString() {
            return "Sdui(components=" + this.components + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Sdui(ImmutableList<? extends UIComponent<? extends GenericAction>> components) {
            Intrinsics.checkNotNullParameter(components, "components");
            this.components = components;
        }

        public final ImmutableList<UIComponent<GenericAction>> getComponents() {
            return this.components;
        }
    }
}
