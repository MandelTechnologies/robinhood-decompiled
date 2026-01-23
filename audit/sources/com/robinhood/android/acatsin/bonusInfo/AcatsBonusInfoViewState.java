package com.robinhood.android.acatsin.bonusInfo;

import com.robinhood.models.api.bonfire.ApiAcatsBonusModalContentResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsBonusInfoViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/acatsin/bonusInfo/AcatsBonusInfoViewState;", "", "<init>", "()V", "Loading", "Error", "Loaded", "Lcom/robinhood/android/acatsin/bonusInfo/AcatsBonusInfoViewState$Error;", "Lcom/robinhood/android/acatsin/bonusInfo/AcatsBonusInfoViewState$Loaded;", "Lcom/robinhood/android/acatsin/bonusInfo/AcatsBonusInfoViewState$Loading;", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public abstract class AcatsBonusInfoViewState {
    public static final int $stable = 0;

    public /* synthetic */ AcatsBonusInfoViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: AcatsBonusInfoViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/acatsin/bonusInfo/AcatsBonusInfoViewState$Loading;", "Lcom/robinhood/android/acatsin/bonusInfo/AcatsBonusInfoViewState;", "<init>", "()V", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading extends AcatsBonusInfoViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    private AcatsBonusInfoViewState() {
    }

    /* compiled from: AcatsBonusInfoViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/acatsin/bonusInfo/AcatsBonusInfoViewState$Error;", "Lcom/robinhood/android/acatsin/bonusInfo/AcatsBonusInfoViewState;", "<init>", "()V", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Error extends AcatsBonusInfoViewState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }
    }

    /* compiled from: AcatsBonusInfoViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/bonusInfo/AcatsBonusInfoViewState$Loaded;", "Lcom/robinhood/android/acatsin/bonusInfo/AcatsBonusInfoViewState;", "content", "Lcom/robinhood/models/api/bonfire/ApiAcatsBonusModalContentResponse;", "<init>", "(Lcom/robinhood/models/api/bonfire/ApiAcatsBonusModalContentResponse;)V", "getContent", "()Lcom/robinhood/models/api/bonfire/ApiAcatsBonusModalContentResponse;", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loaded extends AcatsBonusInfoViewState {
        public static final int $stable = 8;
        private final ApiAcatsBonusModalContentResponse content;

        public final ApiAcatsBonusModalContentResponse getContent() {
            return this.content;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(ApiAcatsBonusModalContentResponse content) {
            super(null);
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }
    }
}
