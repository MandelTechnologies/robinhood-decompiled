package com.robinhood.android.gold.sage.data;

import android.os.Parcel;
import android.os.Parcelable;
import gold.proto.p464v1.GoldSageSplash;
import gold.proto.p464v1.GoldSageStartApplication;
import gold.proto.p464v1.GoldSageTimeline;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldSageFlow.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/gold/sage/data/GoldSageFlow;", "Landroid/os/Parcelable;", "splash", "Lgold/proto/v1/GoldSageSplash;", "timeline", "Lgold/proto/v1/GoldSageTimeline;", "application", "Lgold/proto/v1/GoldSageStartApplication;", "<init>", "(Lgold/proto/v1/GoldSageSplash;Lgold/proto/v1/GoldSageTimeline;Lgold/proto/v1/GoldSageStartApplication;)V", "getSplash", "()Lgold/proto/v1/GoldSageSplash;", "getTimeline", "()Lgold/proto/v1/GoldSageTimeline;", "getApplication", "()Lgold/proto/v1/GoldSageStartApplication;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-gold-sage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GoldSageFlow implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<GoldSageFlow> CREATOR = new Creator();
    private final GoldSageStartApplication application;
    private final GoldSageSplash splash;
    private final GoldSageTimeline timeline;

    /* compiled from: GoldSageFlow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<GoldSageFlow> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldSageFlow createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GoldSageFlow((GoldSageSplash) parcel.readSerializable(), (GoldSageTimeline) parcel.readSerializable(), (GoldSageStartApplication) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldSageFlow[] newArray(int i) {
            return new GoldSageFlow[i];
        }
    }

    public static /* synthetic */ GoldSageFlow copy$default(GoldSageFlow goldSageFlow, GoldSageSplash goldSageSplash, GoldSageTimeline goldSageTimeline, GoldSageStartApplication goldSageStartApplication, int i, Object obj) {
        if ((i & 1) != 0) {
            goldSageSplash = goldSageFlow.splash;
        }
        if ((i & 2) != 0) {
            goldSageTimeline = goldSageFlow.timeline;
        }
        if ((i & 4) != 0) {
            goldSageStartApplication = goldSageFlow.application;
        }
        return goldSageFlow.copy(goldSageSplash, goldSageTimeline, goldSageStartApplication);
    }

    /* renamed from: component1, reason: from getter */
    public final GoldSageSplash getSplash() {
        return this.splash;
    }

    /* renamed from: component2, reason: from getter */
    public final GoldSageTimeline getTimeline() {
        return this.timeline;
    }

    /* renamed from: component3, reason: from getter */
    public final GoldSageStartApplication getApplication() {
        return this.application;
    }

    public final GoldSageFlow copy(GoldSageSplash splash, GoldSageTimeline timeline, GoldSageStartApplication application) {
        Intrinsics.checkNotNullParameter(splash, "splash");
        Intrinsics.checkNotNullParameter(timeline, "timeline");
        Intrinsics.checkNotNullParameter(application, "application");
        return new GoldSageFlow(splash, timeline, application);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldSageFlow)) {
            return false;
        }
        GoldSageFlow goldSageFlow = (GoldSageFlow) other;
        return Intrinsics.areEqual(this.splash, goldSageFlow.splash) && Intrinsics.areEqual(this.timeline, goldSageFlow.timeline) && Intrinsics.areEqual(this.application, goldSageFlow.application);
    }

    public int hashCode() {
        return (((this.splash.hashCode() * 31) + this.timeline.hashCode()) * 31) + this.application.hashCode();
    }

    public String toString() {
        return "GoldSageFlow(splash=" + this.splash + ", timeline=" + this.timeline + ", application=" + this.application + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.splash);
        dest.writeSerializable(this.timeline);
        dest.writeSerializable(this.application);
    }

    public GoldSageFlow(GoldSageSplash splash, GoldSageTimeline timeline, GoldSageStartApplication application) {
        Intrinsics.checkNotNullParameter(splash, "splash");
        Intrinsics.checkNotNullParameter(timeline, "timeline");
        Intrinsics.checkNotNullParameter(application, "application");
        this.splash = splash;
        this.timeline = timeline;
        this.application = application;
    }

    public final GoldSageSplash getSplash() {
        return this.splash;
    }

    public final GoldSageTimeline getTimeline() {
        return this.timeline;
    }

    public final GoldSageStartApplication getApplication() {
        return this.application;
    }
}
