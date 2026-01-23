package com.robinhood.android.retirement.gold;

import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: RetirementGoldPromoViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/retirement/gold/RetirementGoldPromoViewState;", "", "Loading", "Failure", "Loaded", "Lcom/robinhood/android/retirement/gold/RetirementGoldPromoViewState$Failure;", "Lcom/robinhood/android/retirement/gold/RetirementGoldPromoViewState$Loaded;", "Lcom/robinhood/android/retirement/gold/RetirementGoldPromoViewState$Loading;", "feature-retirement-gold_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface RetirementGoldPromoViewState {

    /* compiled from: RetirementGoldPromoViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/retirement/gold/RetirementGoldPromoViewState$Loading;", "Lcom/robinhood/android/retirement/gold/RetirementGoldPromoViewState;", "<init>", "()V", "feature-retirement-gold_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading implements RetirementGoldPromoViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    /* compiled from: RetirementGoldPromoViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/retirement/gold/RetirementGoldPromoViewState$Failure;", "Lcom/robinhood/android/retirement/gold/RetirementGoldPromoViewState;", "<init>", "()V", "feature-retirement-gold_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Failure implements RetirementGoldPromoViewState {
        public static final int $stable = 0;
        public static final Failure INSTANCE = new Failure();

        private Failure() {
        }
    }

    /* compiled from: RetirementGoldPromoViewState.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0003J\u0015\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\fHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003J]\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\fHÖ\u0001J\t\u0010&\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/retirement/gold/RetirementGoldPromoViewState$Loaded;", "Lcom/robinhood/android/retirement/gold/RetirementGoldPromoViewState;", "eventDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", CarResultComposable2.BODY, "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", Footer.f10637type, "lottieUrl", "", "lottieStartFrame", "", "lottieEndFrame", "<init>", "(Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;II)V", "getEventDescriptor", "()Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "getBody", "()Lkotlinx/collections/immutable/ImmutableList;", "getFooter", "getLottieUrl", "()Ljava/lang/String;", "getLottieStartFrame", "()I", "getLottieEndFrame", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "feature-retirement-gold_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements RetirementGoldPromoViewState {
        public static final int $stable = 8;
        private final ImmutableList<UIComponent<GenericAction>> body;
        private final UserInteractionEventDescriptor eventDescriptor;
        private final ImmutableList<UIComponent<GenericAction>> footer;
        private final int lottieEndFrame;
        private final int lottieStartFrame;
        private final String lottieUrl;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, UserInteractionEventDescriptor userInteractionEventDescriptor, ImmutableList immutableList, ImmutableList immutableList2, String str, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                userInteractionEventDescriptor = loaded.eventDescriptor;
            }
            if ((i3 & 2) != 0) {
                immutableList = loaded.body;
            }
            if ((i3 & 4) != 0) {
                immutableList2 = loaded.footer;
            }
            if ((i3 & 8) != 0) {
                str = loaded.lottieUrl;
            }
            if ((i3 & 16) != 0) {
                i = loaded.lottieStartFrame;
            }
            if ((i3 & 32) != 0) {
                i2 = loaded.lottieEndFrame;
            }
            int i4 = i;
            int i5 = i2;
            return loaded.copy(userInteractionEventDescriptor, immutableList, immutableList2, str, i4, i5);
        }

        /* renamed from: component1, reason: from getter */
        public final UserInteractionEventDescriptor getEventDescriptor() {
            return this.eventDescriptor;
        }

        public final ImmutableList<UIComponent<GenericAction>> component2() {
            return this.body;
        }

        public final ImmutableList<UIComponent<GenericAction>> component3() {
            return this.footer;
        }

        /* renamed from: component4, reason: from getter */
        public final String getLottieUrl() {
            return this.lottieUrl;
        }

        /* renamed from: component5, reason: from getter */
        public final int getLottieStartFrame() {
            return this.lottieStartFrame;
        }

        /* renamed from: component6, reason: from getter */
        public final int getLottieEndFrame() {
            return this.lottieEndFrame;
        }

        public final Loaded copy(UserInteractionEventDescriptor eventDescriptor, ImmutableList<? extends UIComponent<? extends GenericAction>> body, ImmutableList<? extends UIComponent<? extends GenericAction>> footer, String lottieUrl, int lottieStartFrame, int lottieEndFrame) {
            Intrinsics.checkNotNullParameter(eventDescriptor, "eventDescriptor");
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(footer, "footer");
            Intrinsics.checkNotNullParameter(lottieUrl, "lottieUrl");
            return new Loaded(eventDescriptor, body, footer, lottieUrl, lottieStartFrame, lottieEndFrame);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.eventDescriptor, loaded.eventDescriptor) && Intrinsics.areEqual(this.body, loaded.body) && Intrinsics.areEqual(this.footer, loaded.footer) && Intrinsics.areEqual(this.lottieUrl, loaded.lottieUrl) && this.lottieStartFrame == loaded.lottieStartFrame && this.lottieEndFrame == loaded.lottieEndFrame;
        }

        public int hashCode() {
            return (((((((((this.eventDescriptor.hashCode() * 31) + this.body.hashCode()) * 31) + this.footer.hashCode()) * 31) + this.lottieUrl.hashCode()) * 31) + Integer.hashCode(this.lottieStartFrame)) * 31) + Integer.hashCode(this.lottieEndFrame);
        }

        public String toString() {
            return "Loaded(eventDescriptor=" + this.eventDescriptor + ", body=" + this.body + ", footer=" + this.footer + ", lottieUrl=" + this.lottieUrl + ", lottieStartFrame=" + this.lottieStartFrame + ", lottieEndFrame=" + this.lottieEndFrame + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loaded(UserInteractionEventDescriptor eventDescriptor, ImmutableList<? extends UIComponent<? extends GenericAction>> body, ImmutableList<? extends UIComponent<? extends GenericAction>> footer, String lottieUrl, int i, int i2) {
            Intrinsics.checkNotNullParameter(eventDescriptor, "eventDescriptor");
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(footer, "footer");
            Intrinsics.checkNotNullParameter(lottieUrl, "lottieUrl");
            this.eventDescriptor = eventDescriptor;
            this.body = body;
            this.footer = footer;
            this.lottieUrl = lottieUrl;
            this.lottieStartFrame = i;
            this.lottieEndFrame = i2;
        }

        public final UserInteractionEventDescriptor getEventDescriptor() {
            return this.eventDescriptor;
        }

        public final ImmutableList<UIComponent<GenericAction>> getBody() {
            return this.body;
        }

        public final ImmutableList<UIComponent<GenericAction>> getFooter() {
            return this.footer;
        }

        public final String getLottieUrl() {
            return this.lottieUrl;
        }

        public final int getLottieStartFrame() {
            return this.lottieStartFrame;
        }

        public final int getLottieEndFrame() {
            return this.lottieEndFrame;
        }
    }
}
