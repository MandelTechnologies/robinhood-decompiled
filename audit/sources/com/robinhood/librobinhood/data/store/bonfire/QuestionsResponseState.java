package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.shareholderx.models.p401db.ShareholderQuestionsResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShareholderExperienceStore.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/QuestionsResponseState;", "", "Loading", "Success", "Error", "Lcom/robinhood/librobinhood/data/store/bonfire/QuestionsResponseState$Error;", "Lcom/robinhood/librobinhood/data/store/bonfire/QuestionsResponseState$Loading;", "Lcom/robinhood/librobinhood/data/store/bonfire/QuestionsResponseState$Success;", "lib-store-shareholderx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public interface QuestionsResponseState {

    /* compiled from: ShareholderExperienceStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/QuestionsResponseState$Loading;", "Lcom/robinhood/librobinhood/data/store/bonfire/QuestionsResponseState;", "<init>", "()V", "lib-store-shareholderx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading implements QuestionsResponseState {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    /* compiled from: ShareholderExperienceStore.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/QuestionsResponseState$Success;", "Lcom/robinhood/librobinhood/data/store/bonfire/QuestionsResponseState;", "response", "Lcom/robinhood/shareholderx/models/db/ShareholderQuestionsResponse;", "<init>", "(Lcom/robinhood/shareholderx/models/db/ShareholderQuestionsResponse;)V", "getResponse", "()Lcom/robinhood/shareholderx/models/db/ShareholderQuestionsResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-shareholderx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success implements QuestionsResponseState {
        private final ShareholderQuestionsResponse response;

        public static /* synthetic */ Success copy$default(Success success, ShareholderQuestionsResponse shareholderQuestionsResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                shareholderQuestionsResponse = success.response;
            }
            return success.copy(shareholderQuestionsResponse);
        }

        /* renamed from: component1, reason: from getter */
        public final ShareholderQuestionsResponse getResponse() {
            return this.response;
        }

        public final Success copy(ShareholderQuestionsResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return new Success(response);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.response, ((Success) other).response);
        }

        public int hashCode() {
            return this.response.hashCode();
        }

        public String toString() {
            return "Success(response=" + this.response + ")";
        }

        public Success(ShareholderQuestionsResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.response = response;
        }

        public final ShareholderQuestionsResponse getResponse() {
            return this.response;
        }
    }

    /* compiled from: ShareholderExperienceStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/QuestionsResponseState$Error;", "Lcom/robinhood/librobinhood/data/store/bonfire/QuestionsResponseState;", "<init>", "()V", "lib-store-shareholderx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Error implements QuestionsResponseState {
        public static final Error INSTANCE = new Error();

        private Error() {
        }
    }
}
