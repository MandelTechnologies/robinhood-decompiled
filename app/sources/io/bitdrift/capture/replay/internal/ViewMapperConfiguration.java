package io.bitdrift.capture.replay.internal;

import io.bitdrift.capture.replay.ReplayType;
import io.bitdrift.capture.replay.SessionReplayConfiguration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewMapperConfiguration.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0005¢\u0006\u0002\u0010\tR \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m3636d2 = {"Lio/bitdrift/capture/replay/internal/ViewMapperConfiguration;", "", "sessionReplayConfiguration", "Lio/bitdrift/capture/replay/SessionReplayConfiguration;", "externalMapper", "", "Lio/bitdrift/capture/replay/ReplayType;", "", "", "(Lio/bitdrift/capture/replay/SessionReplayConfiguration;Ljava/util/Map;)V", "defaultMapper", "mapper", "getMapper", "()Ljava/util/Map;", "mapper$delegate", "Lkotlin/Lazy;", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class ViewMapperConfiguration {
    private final Map<ReplayType, List<String>> defaultMapper;
    private final Map<ReplayType, List<String>> externalMapper;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final Lazy mapper;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewMapperConfiguration(SessionReplayConfiguration sessionReplayConfiguration, Map<ReplayType, ? extends List<String>> map) {
        Intrinsics.checkNotNullParameter(sessionReplayConfiguration, "sessionReplayConfiguration");
        this.externalMapper = map;
        this.mapper = LazyKt.lazy(new Function0<Map<String, ? extends ReplayType>>() { // from class: io.bitdrift.capture.replay.internal.ViewMapperConfiguration$mapper$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Map<String, ? extends ReplayType> invoke() {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : this.this$0.defaultMapper.entrySet()) {
                    ReplayType replayType = (ReplayType) entry.getKey();
                    Iterator it = ((List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        linkedHashMap.put((String) it.next(), replayType);
                    }
                }
                Map map2 = this.this$0.externalMapper;
                if (map2 != null) {
                    for (Map.Entry entry2 : map2.entrySet()) {
                        ReplayType replayType2 = (ReplayType) entry2.getKey();
                        Iterator it2 = ((List) entry2.getValue()).iterator();
                        while (it2.hasNext()) {
                            linkedHashMap.put((String) it2.next(), replayType2);
                        }
                    }
                }
                return MapsKt.toMap(linkedHashMap);
            }
        });
        this.defaultMapper = MapsKt.mapOf(Tuples4.m3642to(ReplayType.View.INSTANCE, CollectionsKt.listOf((Object[]) new String[]{"View", "DecorView", "ViewStub", "ComposeView", "CircleView", "FloatingBarView", "MaterialCardView", "AndroidView", "Box", "Surface", "Row", "Column"})), Tuples4.m3642to(ReplayType.BackgroundImage.INSTANCE, CollectionsKt.emptyList()), Tuples4.m3642to(ReplayType.Chevron.INSTANCE, CollectionsKt.emptyList()), Tuples4.m3642to(ReplayType.Ignore.INSTANCE, CollectionsKt.listOf((Object[]) new String[]{"ContentFrameLayout", "FitWindowsLinearLayout"})), Tuples4.m3642to(ReplayType.Image.INSTANCE, CollectionsKt.listOf((Object[]) new String[]{"ImageView", "AppCompatImageView", "AsyncImage", "Image", "Icon"})), Tuples4.m3642to(ReplayType.Label.INSTANCE, CollectionsKt.listOf((Object[]) new String[]{"BasicText", "Text"})), Tuples4.m3642to(ReplayType.Button.INSTANCE, CollectionsKt.listOf((Object[]) new String[]{"ClickableText", "Button", "IconButton", "TextButton"})), Tuples4.m3642to(ReplayType.SwitchOff.INSTANCE, CollectionsKt.listOf("Checkbox")), Tuples4.m3642to(ReplayType.Keyboard.INSTANCE, CollectionsKt.emptyList()), Tuples4.m3642to(ReplayType.Map.INSTANCE, CollectionsKt.listOf("MapView")), Tuples4.m3642to(ReplayType.TextInput.INSTANCE, CollectionsKt.listOf((Object[]) new String[]{"TextInputEditText", "TextField"})), Tuples4.m3642to(ReplayType.TransparentView.INSTANCE, CollectionsKt.emptyList()), Tuples4.m3642to(ReplayType.WebView.INSTANCE, CollectionsKt.emptyList()));
    }

    public /* synthetic */ ViewMapperConfiguration(SessionReplayConfiguration sessionReplayConfiguration, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sessionReplayConfiguration, (i & 2) != 0 ? sessionReplayConfiguration.getCategorizers() : map);
    }

    public final Map<String, ReplayType> getMapper() {
        return (Map) this.mapper.getValue();
    }
}
