package com.robinhood.rhc.upsells;

import com.robinhood.rhc.upsells.Upsell;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Upsell.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/Upsell;", "", "deeplink", "", "getDeeplink", "()Ljava/lang/String;", "Multi", "None", "Single", "Lcom/robinhood/rhc/upsells/Upsell$Multi;", "Lcom/robinhood/rhc/upsells/Upsell$None;", "Lcom/robinhood/rhc/upsells/Upsell$Single;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface Upsell {
    String getDeeplink();

    /* compiled from: Upsell.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\f\r\u000e\u000fR\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0004\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/Upsell$Single;", "Lcom/robinhood/rhc/upsells/Upsell;", "deeplink", "", "getDeeplink", "()Ljava/lang/String;", "id", "getId", "touchPoint", "Lcom/robinhood/rhc/upsells/TouchPoint;", "getTouchPoint", "()Lcom/robinhood/rhc/upsells/TouchPoint;", "AppReviewPrompt", "DepositMatch", "GrantedReward", "Referral", "Lcom/robinhood/rhc/upsells/Upsell$Single$AppReviewPrompt;", "Lcom/robinhood/rhc/upsells/Upsell$Single$DepositMatch;", "Lcom/robinhood/rhc/upsells/Upsell$Single$GrantedReward;", "Lcom/robinhood/rhc/upsells/Upsell$Single$Referral;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public interface Single extends Upsell {
        @Override // com.robinhood.rhc.upsells.Upsell
        String getDeeplink();

        String getId();

        TouchPoint getTouchPoint();

        /* compiled from: Upsell.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static String getDeeplink(Single single) {
                return "robinhood-global://microgram_launch?id=app-rhc-upsells&deeplink=robinhood-global%3A%2F%2Freward_confirmation%3Fid%3D" + single.getId() + "%26touch_point%3D" + single.getTouchPoint();
            }
        }

        /* compiled from: Upsell.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/Upsell$Single$GrantedReward;", "Lcom/robinhood/rhc/upsells/Upsell$Single;", "id", "", "touchPoint", "Lcom/robinhood/rhc/upsells/TouchPoint;", "(Ljava/lang/String;Lcom/robinhood/rhc/upsells/TouchPoint;)V", "getId", "()Ljava/lang/String;", "getTouchPoint", "()Lcom/robinhood/rhc/upsells/TouchPoint;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class GrantedReward implements Single {
            private final String id;
            private final TouchPoint touchPoint;

            public static /* synthetic */ GrantedReward copy$default(GrantedReward grantedReward, String str, TouchPoint touchPoint, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = grantedReward.id;
                }
                if ((i & 2) != 0) {
                    touchPoint = grantedReward.touchPoint;
                }
                return grantedReward.copy(str, touchPoint);
            }

            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* renamed from: component2, reason: from getter */
            public final TouchPoint getTouchPoint() {
                return this.touchPoint;
            }

            public final GrantedReward copy(String id, TouchPoint touchPoint) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(touchPoint, "touchPoint");
                return new GrantedReward(id, touchPoint);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GrantedReward)) {
                    return false;
                }
                GrantedReward grantedReward = (GrantedReward) other;
                return Intrinsics.areEqual(this.id, grantedReward.id) && this.touchPoint == grantedReward.touchPoint;
            }

            public int hashCode() {
                return (this.id.hashCode() * 31) + this.touchPoint.hashCode();
            }

            public String toString() {
                return "GrantedReward(id=" + this.id + ", touchPoint=" + this.touchPoint + ")";
            }

            public GrantedReward(String id, TouchPoint touchPoint) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(touchPoint, "touchPoint");
                this.id = id;
                this.touchPoint = touchPoint;
            }

            @Override // com.robinhood.rhc.upsells.Upsell.Single, com.robinhood.rhc.upsells.Upsell
            public String getDeeplink() {
                return DefaultImpls.getDeeplink(this);
            }

            @Override // com.robinhood.rhc.upsells.Upsell.Single
            public String getId() {
                return this.id;
            }

            @Override // com.robinhood.rhc.upsells.Upsell.Single
            public TouchPoint getTouchPoint() {
                return this.touchPoint;
            }
        }

        /* compiled from: Upsell.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/Upsell$Single$Referral;", "Lcom/robinhood/rhc/upsells/Upsell$Single;", "touchPoint", "Lcom/robinhood/rhc/upsells/TouchPoint;", "currencyPairId", "", "(Lcom/robinhood/rhc/upsells/TouchPoint;Ljava/lang/String;)V", "getCurrencyPairId", "()Ljava/lang/String;", "id", "getId", "getTouchPoint", "()Lcom/robinhood/rhc/upsells/TouchPoint;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class Referral implements Single {

            /* renamed from: ID */
            public static final String f5956ID = "referral";
            private final String currencyPairId;
            private final String id;
            private final TouchPoint touchPoint;

            public static /* synthetic */ Referral copy$default(Referral referral, TouchPoint touchPoint, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    touchPoint = referral.touchPoint;
                }
                if ((i & 2) != 0) {
                    str = referral.currencyPairId;
                }
                return referral.copy(touchPoint, str);
            }

            /* renamed from: component1, reason: from getter */
            public final TouchPoint getTouchPoint() {
                return this.touchPoint;
            }

            /* renamed from: component2, reason: from getter */
            public final String getCurrencyPairId() {
                return this.currencyPairId;
            }

            public final Referral copy(TouchPoint touchPoint, String currencyPairId) {
                Intrinsics.checkNotNullParameter(touchPoint, "touchPoint");
                return new Referral(touchPoint, currencyPairId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Referral)) {
                    return false;
                }
                Referral referral = (Referral) other;
                return this.touchPoint == referral.touchPoint && Intrinsics.areEqual(this.currencyPairId, referral.currencyPairId);
            }

            public int hashCode() {
                int iHashCode = this.touchPoint.hashCode() * 31;
                String str = this.currencyPairId;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "Referral(touchPoint=" + this.touchPoint + ", currencyPairId=" + this.currencyPairId + ")";
            }

            public Referral(TouchPoint touchPoint, String str) {
                Intrinsics.checkNotNullParameter(touchPoint, "touchPoint");
                this.touchPoint = touchPoint;
                this.currencyPairId = str;
                this.id = f5956ID;
            }

            @Override // com.robinhood.rhc.upsells.Upsell.Single, com.robinhood.rhc.upsells.Upsell
            public String getDeeplink() {
                return DefaultImpls.getDeeplink(this);
            }

            @Override // com.robinhood.rhc.upsells.Upsell.Single
            public TouchPoint getTouchPoint() {
                return this.touchPoint;
            }

            public final String getCurrencyPairId() {
                return this.currencyPairId;
            }

            @Override // com.robinhood.rhc.upsells.Upsell.Single
            public String getId() {
                return this.id;
            }
        }

        /* compiled from: Upsell.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/Upsell$Single$DepositMatch;", "Lcom/robinhood/rhc/upsells/Upsell$Single;", "touchPoint", "Lcom/robinhood/rhc/upsells/TouchPoint;", "(Lcom/robinhood/rhc/upsells/TouchPoint;)V", "id", "", "getId", "()Ljava/lang/String;", "getTouchPoint", "()Lcom/robinhood/rhc/upsells/TouchPoint;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class DepositMatch implements Single {

            /* renamed from: ID */
            public static final String f5953ID = "deposit_match";
            private final String id;
            private final TouchPoint touchPoint;

            public static /* synthetic */ DepositMatch copy$default(DepositMatch depositMatch, TouchPoint touchPoint, int i, Object obj) {
                if ((i & 1) != 0) {
                    touchPoint = depositMatch.touchPoint;
                }
                return depositMatch.copy(touchPoint);
            }

            /* renamed from: component1, reason: from getter */
            public final TouchPoint getTouchPoint() {
                return this.touchPoint;
            }

            public final DepositMatch copy(TouchPoint touchPoint) {
                Intrinsics.checkNotNullParameter(touchPoint, "touchPoint");
                return new DepositMatch(touchPoint);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DepositMatch) && this.touchPoint == ((DepositMatch) other).touchPoint;
            }

            public int hashCode() {
                return this.touchPoint.hashCode();
            }

            public String toString() {
                return "DepositMatch(touchPoint=" + this.touchPoint + ")";
            }

            public DepositMatch(TouchPoint touchPoint) {
                Intrinsics.checkNotNullParameter(touchPoint, "touchPoint");
                this.touchPoint = touchPoint;
                this.id = f5953ID;
            }

            @Override // com.robinhood.rhc.upsells.Upsell.Single, com.robinhood.rhc.upsells.Upsell
            public String getDeeplink() {
                return DefaultImpls.getDeeplink(this);
            }

            @Override // com.robinhood.rhc.upsells.Upsell.Single
            public TouchPoint getTouchPoint() {
                return this.touchPoint;
            }

            @Override // com.robinhood.rhc.upsells.Upsell.Single
            public String getId() {
                return this.id;
            }
        }

        /* compiled from: Upsell.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/Upsell$Single$AppReviewPrompt;", "Lcom/robinhood/rhc/upsells/Upsell$Single;", "touchPoint", "Lcom/robinhood/rhc/upsells/TouchPoint;", "(Lcom/robinhood/rhc/upsells/TouchPoint;)V", "deeplink", "", "getDeeplink", "()Ljava/lang/String;", "id", "getId", "getTouchPoint", "()Lcom/robinhood/rhc/upsells/TouchPoint;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class AppReviewPrompt implements Single {

            /* renamed from: ID */
            public static final String f5951ID = "review_prompt";
            private final String id;
            private final TouchPoint touchPoint;

            public static /* synthetic */ AppReviewPrompt copy$default(AppReviewPrompt appReviewPrompt, TouchPoint touchPoint, int i, Object obj) {
                if ((i & 1) != 0) {
                    touchPoint = appReviewPrompt.touchPoint;
                }
                return appReviewPrompt.copy(touchPoint);
            }

            /* renamed from: component1, reason: from getter */
            public final TouchPoint getTouchPoint() {
                return this.touchPoint;
            }

            public final AppReviewPrompt copy(TouchPoint touchPoint) {
                Intrinsics.checkNotNullParameter(touchPoint, "touchPoint");
                return new AppReviewPrompt(touchPoint);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AppReviewPrompt) && this.touchPoint == ((AppReviewPrompt) other).touchPoint;
            }

            public int hashCode() {
                return this.touchPoint.hashCode();
            }

            public String toString() {
                return "AppReviewPrompt(touchPoint=" + this.touchPoint + ")";
            }

            public AppReviewPrompt(TouchPoint touchPoint) {
                Intrinsics.checkNotNullParameter(touchPoint, "touchPoint");
                this.touchPoint = touchPoint;
                this.id = f5951ID;
            }

            @Override // com.robinhood.rhc.upsells.Upsell.Single
            public TouchPoint getTouchPoint() {
                return this.touchPoint;
            }

            @Override // com.robinhood.rhc.upsells.Upsell.Single
            public String getId() {
                return this.id;
            }

            @Override // com.robinhood.rhc.upsells.Upsell.Single, com.robinhood.rhc.upsells.Upsell
            public String getDeeplink() {
                return "robinhood-global://review_prompt";
            }
        }
    }

    /* compiled from: Upsell.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\b\u0016\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J#\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u000bHÖ\u0001R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, m3636d2 = {"Lcom/robinhood/rhc/upsells/Upsell$Multi;", "Lcom/robinhood/rhc/upsells/Upsell;", "upsells", "", "Lcom/robinhood/rhc/upsells/Upsell$Single;", "touchPoint", "Lcom/robinhood/rhc/upsells/TouchPoint;", "([Lcom/robinhood/rhc/upsells/Upsell$Single;Lcom/robinhood/rhc/upsells/TouchPoint;)V", "", "(Ljava/util/List;Lcom/robinhood/rhc/upsells/TouchPoint;)V", "deeplink", "", "getDeeplink", "()Ljava/lang/String;", "ids", "next", "getNext", "()Lcom/robinhood/rhc/upsells/Upsell;", "getTouchPoint", "()Lcom/robinhood/rhc/upsells/TouchPoint;", "getUpsells", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Multi implements Upsell {
        private final String ids;
        private final TouchPoint touchPoint;
        private final List<Single> upsells;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Multi copy$default(Multi multi, List list, TouchPoint touchPoint, int i, Object obj) {
            if ((i & 1) != 0) {
                list = multi.upsells;
            }
            if ((i & 2) != 0) {
                touchPoint = multi.touchPoint;
            }
            return multi.copy(list, touchPoint);
        }

        public final List<Single> component1() {
            return this.upsells;
        }

        /* renamed from: component2, reason: from getter */
        public final TouchPoint getTouchPoint() {
            return this.touchPoint;
        }

        public final Multi copy(List<? extends Single> upsells, TouchPoint touchPoint) {
            Intrinsics.checkNotNullParameter(upsells, "upsells");
            Intrinsics.checkNotNullParameter(touchPoint, "touchPoint");
            return new Multi(upsells, touchPoint);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Multi)) {
                return false;
            }
            Multi multi = (Multi) other;
            return Intrinsics.areEqual(this.upsells, multi.upsells) && this.touchPoint == multi.touchPoint;
        }

        public int hashCode() {
            return (this.upsells.hashCode() * 31) + this.touchPoint.hashCode();
        }

        public String toString() {
            return "Multi(upsells=" + this.upsells + ", touchPoint=" + this.touchPoint + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Multi(List<? extends Single> upsells, TouchPoint touchPoint) {
            Intrinsics.checkNotNullParameter(upsells, "upsells");
            Intrinsics.checkNotNullParameter(touchPoint, "touchPoint");
            this.upsells = upsells;
            this.touchPoint = touchPoint;
            this.ids = CollectionsKt.joinToString$default(upsells, ",", null, null, 0, null, new Function1<Single, CharSequence>() { // from class: com.robinhood.rhc.upsells.Upsell$Multi$ids$1
                @Override // kotlin.jvm.functions.Function1
                public final CharSequence invoke(Upsell.Single it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.getId();
                }
            }, 30, null);
        }

        public final List<Single> getUpsells() {
            return this.upsells;
        }

        public final TouchPoint getTouchPoint() {
            return this.touchPoint;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Multi(Single[] upsells, TouchPoint touchPoint) {
            this((List<? extends Single>) ArraysKt.toList(upsells), touchPoint);
            Intrinsics.checkNotNullParameter(upsells, "upsells");
            Intrinsics.checkNotNullParameter(touchPoint, "touchPoint");
        }

        @Override // com.robinhood.rhc.upsells.Upsell
        public String getDeeplink() {
            return "robinhood-global://microgram_launch?id=app-rhc-upsells&deeplink=robinhood-global%3A%2F%2Freward_confirmation%3Fids%3D" + this.ids + "%26touch_point%3D" + this.touchPoint;
        }

        public final Upsell getNext() {
            if (this.upsells.isEmpty()) {
                return null;
            }
            List mutableList = CollectionsKt.toMutableList((Collection) this.upsells);
            mutableList.remove(0);
            if (mutableList.isEmpty()) {
                return null;
            }
            if (mutableList.size() == 1) {
                return (Upsell) CollectionsKt.first(mutableList);
            }
            return new Multi((List<? extends Single>) mutableList, this.touchPoint);
        }
    }

    /* compiled from: Upsell.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/Upsell$None;", "Lcom/robinhood/rhc/upsells/Upsell;", "()V", "deeplink", "", "getDeeplink", "()Ljava/lang/Void;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class None implements Upsell {
        public static final None INSTANCE = new None();
        private static final Void deeplink = null;

        private None() {
        }

        @Override // com.robinhood.rhc.upsells.Upsell
        public /* bridge */ /* synthetic */ String getDeeplink() {
            return (String) m23942getDeeplink();
        }

        /* renamed from: getDeeplink, reason: collision with other method in class */
        public Void m23942getDeeplink() {
            return deeplink;
        }
    }
}
