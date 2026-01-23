package androidx.compose.animation.core;

import androidx.collection.IntObjectMap2;
import androidx.collection.IntObjectMap3;
import androidx.compose.animation.core.KeyframeBaseEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AnimationSpec.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u0000H ¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\r\u001a\u00028\u0001*\u00028\u00002\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0096\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0011\u001a\u00028\u0001*\u00028\u00002\b\b\u0001\u0010\u0010\u001a\u00020\u000fH\u0096\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0015\u001a\u00028\u0001*\u00028\u00012\u0006\u0010\u0014\u001a\u00020\u0013H\u0086\u0004¢\u0006\u0004\b\u0015\u0010\u0016R,\u0010\u0018\u001a\u00020\u000b2\b\b\u0001\u0010\u0017\u001a\u00020\u000b8G@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR,\u0010\u001e\u001a\u00020\u000b2\b\b\u0001\u0010\u0017\u001a\u00020\u000b8G@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR \u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\u0082\u0001\u0002&'¨\u0006("}, m3636d2 = {"Landroidx/compose/animation/core/KeyframesSpecBaseConfig;", "T", "Landroidx/compose/animation/core/KeyframeBaseEntity;", "E", "", "<init>", "()V", "value", "createEntityFor$animation_core_release", "(Ljava/lang/Object;)Landroidx/compose/animation/core/KeyframeBaseEntity;", "createEntityFor", "", "timeStamp", "at", "(Ljava/lang/Object;I)Landroidx/compose/animation/core/KeyframeBaseEntity;", "", "fraction", "atFraction", "(Ljava/lang/Object;F)Landroidx/compose/animation/core/KeyframeBaseEntity;", "Landroidx/compose/animation/core/Easing;", "easing", "using", "(Landroidx/compose/animation/core/KeyframeBaseEntity;Landroidx/compose/animation/core/Easing;)Landroidx/compose/animation/core/KeyframeBaseEntity;", "<set-?>", "durationMillis", "I", "getDurationMillis", "()I", "setDurationMillis", "(I)V", "delayMillis", "getDelayMillis", "setDelayMillis", "Landroidx/collection/MutableIntObjectMap;", "keyframes", "Landroidx/collection/MutableIntObjectMap;", "getKeyframes$animation_core_release", "()Landroidx/collection/MutableIntObjectMap;", "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;", "animation-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class KeyframesSpecBaseConfig<T, E extends KeyframeBaseEntity<T>> {
    private int delayMillis;
    private int durationMillis;
    private final IntObjectMap3<E> keyframes;

    public /* synthetic */ KeyframesSpecBaseConfig(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract E createEntityFor$animation_core_release(T value);

    private KeyframesSpecBaseConfig() {
        this.durationMillis = 300;
        this.keyframes = IntObjectMap2.mutableIntObjectMapOf();
    }

    public final int getDurationMillis() {
        return this.durationMillis;
    }

    public final void setDurationMillis(int i) {
        this.durationMillis = i;
    }

    public final int getDelayMillis() {
        return this.delayMillis;
    }

    public final IntObjectMap3<E> getKeyframes$animation_core_release() {
        return this.keyframes;
    }

    /* renamed from: at */
    public E mo91at(T t, int i) {
        E e = (E) createEntityFor$animation_core_release(t);
        this.keyframes.set(i, e);
        return e;
    }

    public E atFraction(T t, float f) {
        return (E) mo91at(t, Math.round(this.durationMillis * f));
    }

    public final E using(E e, Easing easing) {
        e.setEasing$animation_core_release(easing);
        return e;
    }
}
