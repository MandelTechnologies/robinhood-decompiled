package com.robinhood.android.shareholderexperience;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.LogOnceEventLogger;
import com.robinhood.rosetta.converters.platform.Booleans2;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.ShareholderQAContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shareholderx.models.p401db.QaEventMetadata;
import com.robinhood.shareholderx.models.p401db.QaEventState;
import com.robinhood.shareholderx.models.p401db.ShareholderQuestion;
import com.robinhood.utils.extensions.Uuids;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: ShareholderLogger.kt */
@Metadata(m3635d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u0007*\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b*\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ=\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\"\u0010!J7\u0010*\u001a\u00020\u00182\n\u0010%\u001a\u00060#j\u0002`$2\u0006\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020\u00142\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0018¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0018¢\u0006\u0004\b.\u0010-J-\u00101\u001a\u00020\u00182\n\u0010%\u001a\u00060#j\u0002`$2\u0006\u0010'\u001a\u00020&2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001e\u0010;\u001a\n\u0018\u000109j\u0004\u0018\u0001`:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010=R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010>R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010?R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020F8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006N"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/ShareholderLogger;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "<init>", "(Lcom/robinhood/analytics/EventLogger;)V", "Lcom/robinhood/shareholderx/models/db/ShareholderQuestion$VoteButton;", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$VoteButtonState;", "toVoteButtonState", "(Lcom/robinhood/shareholderx/models/db/ShareholderQuestion$VoteButton;)Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$VoteButtonState;", "Lcom/robinhood/shareholderx/models/db/QaEventState;", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EventState;", "toProtobuf", "(Lcom/robinhood/shareholderx/models/db/QaEventState;)Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EventState;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "loggingScreenName", "Ljava/util/UUID;", "instrumentId", "", "eventSlug", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EntryPoint;", "entryPoint", "", "initialize", "(Landroidx/lifecycle/Lifecycle;Lcom/robinhood/rosetta/eventlogging/Screen$Name;Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EntryPoint;)V", "Lcom/robinhood/shareholderx/models/db/QaEventMetadata;", "metadata", "(Landroidx/lifecycle/Lifecycle;Lcom/robinhood/rosetta/eventlogging/Screen$Name;Lcom/robinhood/shareholderx/models/db/QaEventMetadata;Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EntryPoint;)V", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onStart", "(Landroidx/lifecycle/LifecycleOwner;)V", "onStop", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "Lcom/robinhood/rosetta/eventlogging/ComponentType;", "componentType", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "action", "buttonText", "voteButton", "logTap", "(Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;Ljava/lang/String;Lcom/robinhood/shareholderx/models/db/ShareholderQuestion$VoteButton;)V", "logScreenAppearance", "()V", "logScreenDisappearance", "Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;", "question", "logAppearance", "(Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;)V", "setMetadata", "(Lcom/robinhood/shareholderx/models/db/QaEventMetadata;)V", "Lcom/robinhood/analytics/EventLogger;", "Lcom/robinhood/analytics/LogOnceEventLogger;", "logOnceEventLogger", "Lcom/robinhood/analytics/LogOnceEventLogger;", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "appearanceTime", "Lj$/time/Instant;", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "Ljava/util/UUID;", "Ljava/lang/String;", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EntryPoint;", "eventState", "Lcom/robinhood/shareholderx/models/db/QaEventState;", "", "isShareholder", "Ljava/lang/Boolean;", "Lcom/robinhood/rosetta/eventlogging/Asset;", "getAsset", "()Lcom/robinhood/rosetta/eventlogging/Asset;", "asset", "Lcom/robinhood/rosetta/eventlogging/Context;", "getDefaultContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "defaultContext", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class ShareholderLogger implements DefaultLifecycleObserver {
    public static final int $stable = 8;
    private Instant appearanceTime;
    private ShareholderQAContext.EntryPoint entryPoint;
    private final EventLogger eventLogger;
    private String eventSlug;
    private QaEventState eventState;
    private UUID instrumentId;
    private Boolean isShareholder;
    private final LogOnceEventLogger logOnceEventLogger;
    private Screen.Name loggingScreenName;

    /* compiled from: ShareholderLogger.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QaEventState.values().length];
            try {
                iArr[QaEventState.EARLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QaEventState.QA_EVENT_OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QaEventState.QA_EVENT_CLOSED_CALL_COUNTDOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[QaEventState.QA_EVENT_CLOSED_DAY_OF_COUNTDOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[QaEventState.EARNINGS_LIVE_CALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[QaEventState.EARNINGS_CALL_ENDED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[QaEventState.ANSWERS_POSTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[QaEventState.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ShareholderLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.eventLogger = eventLogger;
        this.logOnceEventLogger = new LogOnceEventLogger(eventLogger);
        this.loggingScreenName = Screen.Name.NAME_UNSPECIFIED;
        this.eventSlug = "";
        this.entryPoint = ShareholderQAContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
        this.eventState = QaEventState.UNKNOWN;
    }

    private final Asset getAsset() {
        String string2;
        Asset asset = new Asset(null, Asset.AssetType.INSTRUMENT, null, null, 13, null);
        UUID uuid = this.instrumentId;
        return (uuid == null || (string2 = uuid.toString()) == null) ? asset : Asset.copy$default(asset, string2, null, null, null, 14, null);
    }

    private final Context getDefaultContext() {
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, getAsset(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, -1, -1, -1, -1, -1, 16383, null);
    }

    public static /* synthetic */ void initialize$default(ShareholderLogger shareholderLogger, Lifecycle lifecycle, Screen.Name name, UUID uuid, String str, ShareholderQAContext.EntryPoint entryPoint, int i, Object obj) {
        if ((i & 1) != 0) {
            lifecycle = null;
        }
        if ((i & 16) != 0) {
            entryPoint = ShareholderQAContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
        }
        shareholderLogger.initialize(lifecycle, name, uuid, str, entryPoint);
    }

    public final void initialize(Lifecycle lifecycle, Screen.Name loggingScreenName, UUID instrumentId, String eventSlug, ShareholderQAContext.EntryPoint entryPoint) {
        Intrinsics.checkNotNullParameter(loggingScreenName, "loggingScreenName");
        Intrinsics.checkNotNullParameter(eventSlug, "eventSlug");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.loggingScreenName = loggingScreenName;
        this.instrumentId = instrumentId;
        this.eventSlug = eventSlug;
        this.entryPoint = entryPoint;
        if (lifecycle != null) {
            lifecycle.addObserver(this);
        }
    }

    public static /* synthetic */ void initialize$default(ShareholderLogger shareholderLogger, Lifecycle lifecycle, Screen.Name name, QaEventMetadata qaEventMetadata, ShareholderQAContext.EntryPoint entryPoint, int i, Object obj) {
        if ((i & 1) != 0) {
            lifecycle = null;
        }
        if ((i & 8) != 0) {
            entryPoint = ShareholderQAContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
        }
        shareholderLogger.initialize(lifecycle, name, qaEventMetadata, entryPoint);
    }

    public final void initialize(Lifecycle lifecycle, Screen.Name loggingScreenName, QaEventMetadata metadata, ShareholderQAContext.EntryPoint entryPoint) {
        Intrinsics.checkNotNullParameter(loggingScreenName, "loggingScreenName");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        initialize(lifecycle, loggingScreenName, metadata.getInstrumentId(), metadata.getEventSlug(), entryPoint);
        setMetadata(metadata);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStart(owner);
        logScreenAppearance();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStop(owner);
        logScreenDisappearance();
    }

    public static /* synthetic */ void logTap$default(ShareholderLogger shareholderLogger, Component.ComponentType componentType, UserInteractionEventData.Action action, String str, ShareholderQuestion.VoteButton voteButton, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        if ((i & 8) != 0) {
            voteButton = null;
        }
        shareholderLogger.logTap(componentType, action, str, voteButton);
    }

    public final void logTap(Component.ComponentType componentType, UserInteractionEventData.Action action, String buttonText, ShareholderQuestion.VoteButton voteButton) {
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, action, new Screen(this.loggingScreenName, null, null, null, 14, null), new Component(componentType, null, null, 6, null), null, Context.copy$default(getDefaultContext(), 0, 0, 0, buttonText, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ShareholderQAContext(this.eventSlug, this.entryPoint, toProtobuf(this.eventState), Booleans2.toProtobuf(this.isShareholder), toVoteButtonState(voteButton), ShareholderQAContext.EventSection.EVENT_SECTION_UNSPECIFIED, null, 64, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -1, -1025, -1, -1, -1, 16383, null), false, 40, null);
    }

    public final void logScreenAppearance() {
        this.appearanceTime = Instant.now();
        EventLogger.DefaultImpls.logScreenAppear$default(this.eventLogger, null, new Screen(this.loggingScreenName, null, null, null, 14, null), null, null, Context.copy$default(getDefaultContext(), 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ShareholderQAContext(this.eventSlug, this.entryPoint, toProtobuf(this.eventState), Booleans2.toProtobuf(this.isShareholder), ShareholderQAContext.VoteButtonState.VOTE_BUTTON_STATE_UNSPECIFIED, ShareholderQAContext.EventSection.EVENT_SECTION_UNSPECIFIED, null, 64, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1025, -1, -1, -1, 16383, null), 13, null);
    }

    public final void logScreenDisappearance() {
        Instant instantNow = this.appearanceTime;
        if (instantNow == null) {
            instantNow = Instant.now();
        }
        EventLogger.DefaultImpls.logScreenDisappear$default(this.eventLogger, null, new Screen(this.loggingScreenName, null, null, null, 14, null), null, null, Context.copy$default(getDefaultContext(), 0, 0, 0, null, null, null, null, null, (int) (Instant.now().toEpochMilli() - instantNow.toEpochMilli()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ShareholderQAContext(this.eventSlug, this.entryPoint, toProtobuf(this.eventState), Booleans2.toProtobuf(this.isShareholder), ShareholderQAContext.VoteButtonState.VOTE_BUTTON_STATE_UNSPECIFIED, ShareholderQAContext.EventSection.EVENT_SECTION_UNSPECIFIED, null, 64, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -257, -1, -1025, -1, -1, -1, 16383, null), 13, null);
    }

    public static /* synthetic */ void logAppearance$default(ShareholderLogger shareholderLogger, Component.ComponentType componentType, UserInteractionEventData.Action action, ShareholderQuestion shareholderQuestion, int i, Object obj) {
        if ((i & 4) != 0) {
            shareholderQuestion = null;
        }
        shareholderLogger.logAppearance(componentType, action, shareholderQuestion);
    }

    public final void logAppearance(Component.ComponentType componentType, UserInteractionEventData.Action action, ShareholderQuestion question) {
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        Intrinsics.checkNotNullParameter(action, "action");
        this.logOnceEventLogger.logAppear(Uuids.toStringOrEmpty(question != null ? question.getId() : null), action, new Screen(this.loggingScreenName, null, null, null, 14, null), new Component(componentType, null, null, 6, null), Context.copy$default(getDefaultContext(), 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ShareholderQAContext(this.eventSlug, this.entryPoint, toProtobuf(this.eventState), Booleans2.toProtobuf(this.isShareholder), toVoteButtonState(question != null ? question.getVoteButton() : null), ShareholderQAContext.EventSection.EVENT_SECTION_UNSPECIFIED, null, 64, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1025, -1, -1, -1, 16383, null));
    }

    public final void setMetadata(QaEventMetadata metadata) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.eventState = metadata.getEventState();
        this.isShareholder = Boolean.valueOf(metadata.isShareholder());
    }

    private final ShareholderQAContext.VoteButtonState toVoteButtonState(ShareholderQuestion.VoteButton voteButton) {
        if (voteButton == null) {
            return ShareholderQAContext.VoteButtonState.VOTE_BUTTON_STATE_UNSPECIFIED;
        }
        return voteButton.getDisabled() ? ShareholderQAContext.VoteButtonState.DISABLED : voteButton.getUpvoted() ? ShareholderQAContext.VoteButtonState.UPVOTED : ShareholderQAContext.VoteButtonState.DEFAULT;
    }

    private final ShareholderQAContext.EventState toProtobuf(QaEventState qaEventState) {
        switch (qaEventState == null ? -1 : WhenMappings.$EnumSwitchMapping$0[qaEventState.ordinal()]) {
            case -1:
            case 8:
                return ShareholderQAContext.EventState.EVENT_STATE_UNSPECIFIED;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return ShareholderQAContext.EventState.EARLY;
            case 2:
                return ShareholderQAContext.EventState.QA_EVENT_OPEN;
            case 3:
                return ShareholderQAContext.EventState.QA_EVENT_CLOSED_CALL_COUNTDOWN;
            case 4:
                return ShareholderQAContext.EventState.QA_EVENT_CLOSED_DAY_OF_COUNTDOWN;
            case 5:
                return ShareholderQAContext.EventState.EARNINGS_CALL_LIVE;
            case 6:
                return ShareholderQAContext.EventState.EARNINGS_CALL_ENDED;
            case 7:
                return ShareholderQAContext.EventState.ANSWERS_POSTED;
        }
    }
}
