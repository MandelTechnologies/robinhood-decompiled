package com.withpersona.sdk2.inquiry.selfie;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: SelfieType.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "", "<init>", "()V", "CenterOnly", "ThreePhotos", "ConfigurablePoses", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$CenterOnly;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ThreePhotos;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public abstract class SelfieType {
    public /* synthetic */ SelfieType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: SelfieType.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$CenterOnly;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class CenterOnly extends SelfieType {
        public static final CenterOnly INSTANCE = new CenterOnly();

        public boolean equals(Object other) {
            return this == other || (other instanceof CenterOnly);
        }

        public int hashCode() {
            return -1563560561;
        }

        public String toString() {
            return "CenterOnly";
        }

        private CenterOnly() {
            super(null);
        }
    }

    private SelfieType() {
    }

    /* compiled from: SelfieType.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ThreePhotos;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class ThreePhotos extends SelfieType {
        public static final ThreePhotos INSTANCE = new ThreePhotos();

        public boolean equals(Object other) {
            return this == other || (other instanceof ThreePhotos);
        }

        public int hashCode() {
            return 2033787281;
        }

        public String toString() {
            return "ThreePhotos";
        }

        private ThreePhotos() {
            super(null);
        }
    }

    /* compiled from: SelfieType.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class ConfigurablePoses extends SelfieType {
        public static final ConfigurablePoses INSTANCE = new ConfigurablePoses();

        public boolean equals(Object other) {
            return this == other || (other instanceof ConfigurablePoses);
        }

        public int hashCode() {
            return -1488281957;
        }

        public String toString() {
            return "ConfigurablePoses";
        }

        private ConfigurablePoses() {
            super(null);
        }
    }
}
