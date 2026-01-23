package bonfire.proto.idl.advisor_marketplace.p029v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: GetScheduleMeetingFlowResponse.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016JH\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/GetScheduleMeetingFlowResponse;", "Lcom/squareup/wire/Message;", "", "advisor_id", "", "flow_title", "availability_view_model", "Lbonfire/proto/idl/advisor_marketplace/v1/AvailabilityViewModel;", "discussion_topics_view_model", "Lbonfire/proto/idl/advisor_marketplace/v1/DiscussionTopicsViewModel;", "review_view_model", "Lbonfire/proto/idl/advisor_marketplace/v1/ReviewScheduledMeetingViewModel;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/advisor_marketplace/v1/AvailabilityViewModel;Lbonfire/proto/idl/advisor_marketplace/v1/DiscussionTopicsViewModel;Lbonfire/proto/idl/advisor_marketplace/v1/ReviewScheduledMeetingViewModel;Lokio/ByteString;)V", "getAdvisor_id", "()Ljava/lang/String;", "getFlow_title", "getAvailability_view_model", "()Lbonfire/proto/idl/advisor_marketplace/v1/AvailabilityViewModel;", "getDiscussion_topics_view_model", "()Lbonfire/proto/idl/advisor_marketplace/v1/DiscussionTopicsViewModel;", "getReview_view_model", "()Lbonfire/proto/idl/advisor_marketplace/v1/ReviewScheduledMeetingViewModel;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetScheduleMeetingFlowResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetScheduleMeetingFlowResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "advisorId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String advisor_id;

    @WireField(adapter = "bonfire.proto.idl.advisor_marketplace.v1.AvailabilityViewModel#ADAPTER", jsonName = "availabilityViewModel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final AvailabilityViewModel availability_view_model;

    @WireField(adapter = "bonfire.proto.idl.advisor_marketplace.v1.DiscussionTopicsViewModel#ADAPTER", jsonName = "discussionTopicsViewModel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final DiscussionTopicsViewModel discussion_topics_view_model;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "flowTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String flow_title;

    @WireField(adapter = "bonfire.proto.idl.advisor_marketplace.v1.ReviewScheduledMeetingViewModel#ADAPTER", jsonName = "reviewViewModel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final ReviewScheduledMeetingViewModel review_view_model;

    public GetScheduleMeetingFlowResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ GetScheduleMeetingFlowResponse(String str, String str2, AvailabilityViewModel availabilityViewModel, DiscussionTopicsViewModel discussionTopicsViewModel, ReviewScheduledMeetingViewModel reviewScheduledMeetingViewModel, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : availabilityViewModel, (i & 8) != 0 ? null : discussionTopicsViewModel, (i & 16) != 0 ? null : reviewScheduledMeetingViewModel, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8788newBuilder();
    }

    public final String getAdvisor_id() {
        return this.advisor_id;
    }

    public final String getFlow_title() {
        return this.flow_title;
    }

    public final AvailabilityViewModel getAvailability_view_model() {
        return this.availability_view_model;
    }

    public final DiscussionTopicsViewModel getDiscussion_topics_view_model() {
        return this.discussion_topics_view_model;
    }

    public final ReviewScheduledMeetingViewModel getReview_view_model() {
        return this.review_view_model;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetScheduleMeetingFlowResponse(String advisor_id, String flow_title, AvailabilityViewModel availabilityViewModel, DiscussionTopicsViewModel discussionTopicsViewModel, ReviewScheduledMeetingViewModel reviewScheduledMeetingViewModel, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(advisor_id, "advisor_id");
        Intrinsics.checkNotNullParameter(flow_title, "flow_title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.advisor_id = advisor_id;
        this.flow_title = flow_title;
        this.availability_view_model = availabilityViewModel;
        this.discussion_topics_view_model = discussionTopicsViewModel;
        this.review_view_model = reviewScheduledMeetingViewModel;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8788newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetScheduleMeetingFlowResponse)) {
            return false;
        }
        GetScheduleMeetingFlowResponse getScheduleMeetingFlowResponse = (GetScheduleMeetingFlowResponse) other;
        return Intrinsics.areEqual(unknownFields(), getScheduleMeetingFlowResponse.unknownFields()) && Intrinsics.areEqual(this.advisor_id, getScheduleMeetingFlowResponse.advisor_id) && Intrinsics.areEqual(this.flow_title, getScheduleMeetingFlowResponse.flow_title) && Intrinsics.areEqual(this.availability_view_model, getScheduleMeetingFlowResponse.availability_view_model) && Intrinsics.areEqual(this.discussion_topics_view_model, getScheduleMeetingFlowResponse.discussion_topics_view_model) && Intrinsics.areEqual(this.review_view_model, getScheduleMeetingFlowResponse.review_view_model);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.advisor_id.hashCode()) * 37) + this.flow_title.hashCode()) * 37;
        AvailabilityViewModel availabilityViewModel = this.availability_view_model;
        int iHashCode2 = (iHashCode + (availabilityViewModel != null ? availabilityViewModel.hashCode() : 0)) * 37;
        DiscussionTopicsViewModel discussionTopicsViewModel = this.discussion_topics_view_model;
        int iHashCode3 = (iHashCode2 + (discussionTopicsViewModel != null ? discussionTopicsViewModel.hashCode() : 0)) * 37;
        ReviewScheduledMeetingViewModel reviewScheduledMeetingViewModel = this.review_view_model;
        int iHashCode4 = iHashCode3 + (reviewScheduledMeetingViewModel != null ? reviewScheduledMeetingViewModel.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("advisor_id=" + Internal.sanitize(this.advisor_id));
        arrayList.add("flow_title=" + Internal.sanitize(this.flow_title));
        AvailabilityViewModel availabilityViewModel = this.availability_view_model;
        if (availabilityViewModel != null) {
            arrayList.add("availability_view_model=" + availabilityViewModel);
        }
        DiscussionTopicsViewModel discussionTopicsViewModel = this.discussion_topics_view_model;
        if (discussionTopicsViewModel != null) {
            arrayList.add("discussion_topics_view_model=" + discussionTopicsViewModel);
        }
        ReviewScheduledMeetingViewModel reviewScheduledMeetingViewModel = this.review_view_model;
        if (reviewScheduledMeetingViewModel != null) {
            arrayList.add("review_view_model=" + reviewScheduledMeetingViewModel);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetScheduleMeetingFlowResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetScheduleMeetingFlowResponse copy$default(GetScheduleMeetingFlowResponse getScheduleMeetingFlowResponse, String str, String str2, AvailabilityViewModel availabilityViewModel, DiscussionTopicsViewModel discussionTopicsViewModel, ReviewScheduledMeetingViewModel reviewScheduledMeetingViewModel, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getScheduleMeetingFlowResponse.advisor_id;
        }
        if ((i & 2) != 0) {
            str2 = getScheduleMeetingFlowResponse.flow_title;
        }
        if ((i & 4) != 0) {
            availabilityViewModel = getScheduleMeetingFlowResponse.availability_view_model;
        }
        if ((i & 8) != 0) {
            discussionTopicsViewModel = getScheduleMeetingFlowResponse.discussion_topics_view_model;
        }
        if ((i & 16) != 0) {
            reviewScheduledMeetingViewModel = getScheduleMeetingFlowResponse.review_view_model;
        }
        if ((i & 32) != 0) {
            byteString = getScheduleMeetingFlowResponse.unknownFields();
        }
        ReviewScheduledMeetingViewModel reviewScheduledMeetingViewModel2 = reviewScheduledMeetingViewModel;
        ByteString byteString2 = byteString;
        return getScheduleMeetingFlowResponse.copy(str, str2, availabilityViewModel, discussionTopicsViewModel, reviewScheduledMeetingViewModel2, byteString2);
    }

    public final GetScheduleMeetingFlowResponse copy(String advisor_id, String flow_title, AvailabilityViewModel availability_view_model, DiscussionTopicsViewModel discussion_topics_view_model, ReviewScheduledMeetingViewModel review_view_model, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(advisor_id, "advisor_id");
        Intrinsics.checkNotNullParameter(flow_title, "flow_title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetScheduleMeetingFlowResponse(advisor_id, flow_title, availability_view_model, discussion_topics_view_model, review_view_model, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetScheduleMeetingFlowResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetScheduleMeetingFlowResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.advisor_marketplace.v1.GetScheduleMeetingFlowResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetScheduleMeetingFlowResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAdvisor_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAdvisor_id());
                }
                if (!Intrinsics.areEqual(value.getFlow_title(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getFlow_title());
                }
                if (value.getAvailability_view_model() != null) {
                    size += AvailabilityViewModel.ADAPTER.encodedSizeWithTag(3, value.getAvailability_view_model());
                }
                if (value.getDiscussion_topics_view_model() != null) {
                    size += DiscussionTopicsViewModel.ADAPTER.encodedSizeWithTag(4, value.getDiscussion_topics_view_model());
                }
                return value.getReview_view_model() != null ? size + ReviewScheduledMeetingViewModel.ADAPTER.encodedSizeWithTag(5, value.getReview_view_model()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetScheduleMeetingFlowResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAdvisor_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAdvisor_id());
                }
                if (!Intrinsics.areEqual(value.getFlow_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFlow_title());
                }
                if (value.getAvailability_view_model() != null) {
                    AvailabilityViewModel.ADAPTER.encodeWithTag(writer, 3, (int) value.getAvailability_view_model());
                }
                if (value.getDiscussion_topics_view_model() != null) {
                    DiscussionTopicsViewModel.ADAPTER.encodeWithTag(writer, 4, (int) value.getDiscussion_topics_view_model());
                }
                if (value.getReview_view_model() != null) {
                    ReviewScheduledMeetingViewModel.ADAPTER.encodeWithTag(writer, 5, (int) value.getReview_view_model());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetScheduleMeetingFlowResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getReview_view_model() != null) {
                    ReviewScheduledMeetingViewModel.ADAPTER.encodeWithTag(writer, 5, (int) value.getReview_view_model());
                }
                if (value.getDiscussion_topics_view_model() != null) {
                    DiscussionTopicsViewModel.ADAPTER.encodeWithTag(writer, 4, (int) value.getDiscussion_topics_view_model());
                }
                if (value.getAvailability_view_model() != null) {
                    AvailabilityViewModel.ADAPTER.encodeWithTag(writer, 3, (int) value.getAvailability_view_model());
                }
                if (!Intrinsics.areEqual(value.getFlow_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFlow_title());
                }
                if (Intrinsics.areEqual(value.getAdvisor_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAdvisor_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetScheduleMeetingFlowResponse redact(GetScheduleMeetingFlowResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AvailabilityViewModel availability_view_model = value.getAvailability_view_model();
                AvailabilityViewModel availabilityViewModelRedact = availability_view_model != null ? AvailabilityViewModel.ADAPTER.redact(availability_view_model) : null;
                DiscussionTopicsViewModel discussion_topics_view_model = value.getDiscussion_topics_view_model();
                DiscussionTopicsViewModel discussionTopicsViewModelRedact = discussion_topics_view_model != null ? DiscussionTopicsViewModel.ADAPTER.redact(discussion_topics_view_model) : null;
                ReviewScheduledMeetingViewModel review_view_model = value.getReview_view_model();
                return GetScheduleMeetingFlowResponse.copy$default(value, null, null, availabilityViewModelRedact, discussionTopicsViewModelRedact, review_view_model != null ? ReviewScheduledMeetingViewModel.ADAPTER.redact(review_view_model) : null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetScheduleMeetingFlowResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                AvailabilityViewModel availabilityViewModelDecode = null;
                DiscussionTopicsViewModel discussionTopicsViewModelDecode = null;
                ReviewScheduledMeetingViewModel reviewScheduledMeetingViewModelDecode = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetScheduleMeetingFlowResponse(strDecode, strDecode2, availabilityViewModelDecode, discussionTopicsViewModelDecode, reviewScheduledMeetingViewModelDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        availabilityViewModelDecode = AvailabilityViewModel.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        discussionTopicsViewModelDecode = DiscussionTopicsViewModel.ADAPTER.decode(reader);
                    } else if (iNextTag == 5) {
                        reviewScheduledMeetingViewModelDecode = ReviewScheduledMeetingViewModel.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
