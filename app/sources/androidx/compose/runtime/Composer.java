package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: Composer.kt */
@Metadata(m3635d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u0088\u00012\u00020\u0001:\u0002\u0088\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H'¢\u0006\u0004\b\n\u0010\bJ!\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H'¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0004H'¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0004H'¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H'¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0019\u001a\u00020\u00042\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H'¢\u0006\u0004\b\u001b\u0010\bJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH'¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H'¢\u0006\u0004\b \u0010\bJ\u000f\u0010!\u001a\u00020\u0004H'¢\u0006\u0004\b!\u0010\bJ#\u0010%\u001a\u00020\u0004\"\u0004\b\u0000\u0010\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H'¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0004H'¢\u0006\u0004\b'\u0010\bJ\u000f\u0010(\u001a\u00020\u0004H'¢\u0006\u0004\b(\u0010\bJ!\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b)\u0010\rJ\u000f\u0010*\u001a\u00020\u0004H'¢\u0006\u0004\b*\u0010\bJ\u0017\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0002H'¢\u0006\u0004\b,\u0010\u0006JB\u00101\u001a\u00020\u0004\"\u0004\b\u0000\u0010-\"\u0004\b\u0001\u0010\"2\u0006\u0010\u0017\u001a\u00028\u00002\u001d\u00100\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040.¢\u0006\u0002\b/H'¢\u0006\u0004\b1\u00102J#\u00105\u001a\u00020\u00012\b\u00103\u001a\u0004\u0018\u00010\u00012\b\u00104\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b5\u00106J\u0011\u00107\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b7\u00108J\u0019\u00109\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b9\u0010:J\u0019\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\u001d\u0010;J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001d\u0010<J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020=H\u0017¢\u0006\u0004\b\u001d\u0010>J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001d\u0010?J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020@H\u0017¢\u0006\u0004\b\u001d\u0010AJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020BH\u0017¢\u0006\u0004\b\u001d\u0010CJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020DH\u0017¢\u0006\u0004\b\u001d\u0010EJ\u0019\u0010F\u001a\u00020\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0017¢\u0006\u0004\bF\u0010;J\u0017\u0010I\u001a\u00020\u00042\u0006\u0010H\u001a\u00020GH'¢\u0006\u0004\bI\u0010JJ\u001f\u0010M\u001a\u00020\u001c2\u0006\u0010K\u001a\u00020\u001c2\u0006\u0010L\u001a\u00020\u0002H'¢\u0006\u0004\bM\u0010NJ\u001d\u0010P\u001a\u00020\u00042\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00040#H'¢\u0006\u0004\bP\u0010&J#\u0010R\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000QH'¢\u0006\u0004\bR\u0010SJ#\u0010W\u001a\u00020\u00042\u0012\u0010V\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030U0TH'¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u0004H'¢\u0006\u0004\bY\u0010\bJ\u001b\u0010Z\u001a\u00020\u00042\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030UH'¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\u0004H'¢\u0006\u0004\b\\\u0010\bJ\u000f\u0010]\u001a\u00020\u0004H&¢\u0006\u0004\b]\u0010\bJ\u000f\u0010_\u001a\u00020^H'¢\u0006\u0004\b_\u0010`R\u001e\u0010e\u001a\u0006\u0012\u0002\b\u00030a8&X§\u0004¢\u0006\f\u0012\u0004\bd\u0010\b\u001a\u0004\bb\u0010cR\u001a\u0010i\u001a\u00020\u001c8&X§\u0004¢\u0006\f\u0012\u0004\bh\u0010\b\u001a\u0004\bf\u0010gR\u001a\u0010l\u001a\u00020\u001c8&X§\u0004¢\u0006\f\u0012\u0004\bk\u0010\b\u001a\u0004\bj\u0010gR\u001a\u0010o\u001a\u00020\u001c8&X§\u0004¢\u0006\f\u0012\u0004\bn\u0010\b\u001a\u0004\bm\u0010gR\u001c\u0010s\u001a\u0004\u0018\u00010G8&X§\u0004¢\u0006\f\u0012\u0004\br\u0010\b\u001a\u0004\bp\u0010qR\u001a\u0010w\u001a\u00020\u00028&X§\u0004¢\u0006\f\u0012\u0004\bv\u0010\b\u001a\u0004\bt\u0010uR\u001a\u0010z\u001a\u00020\u00028&X§\u0004¢\u0006\f\u0012\u0004\by\u0010\b\u001a\u0004\bx\u0010uR\u0014\u0010~\u001a\u00020{8&X¦\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0017\u0010\u0082\u0001\u001a\u00020\u007f8&X¦\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001f\u0010\u0087\u0001\u001a\u00030\u0083\u00018gX§\u0004¢\u0006\u000f\u0012\u0005\b\u0086\u0001\u0010\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\u0082\u0001\u0002\u0089\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u008a\u0001À\u0006\u0001"}, m3636d2 = {"Landroidx/compose/runtime/Composer;", "", "", "key", "", "startReplaceableGroup", "(I)V", "endReplaceableGroup", "()V", "startReplaceGroup", "endReplaceGroup", "dataKey", "startMovableGroup", "(ILjava/lang/Object;)V", "endMovableGroup", "startDefaults", "endDefaults", "startRestartGroup", "(I)Landroidx/compose/runtime/Composer;", "Landroidx/compose/runtime/ScopeUpdateScope;", "endRestartGroup", "()Landroidx/compose/runtime/ScopeUpdateScope;", "Landroidx/compose/runtime/MovableContent;", "value", "parameter", "insertMovableContent", "(Landroidx/compose/runtime/MovableContent;Ljava/lang/Object;)V", "skipToGroupEnd", "", UpdatePortfolioResultsScreenKt.ChangeLoggingIdentifier, "deactivateToEndGroup", "(Z)V", "startNode", "startReusableNode", "T", "Lkotlin/Function0;", "factory", "createNode", "(Lkotlin/jvm/functions/Function0;)V", "useNode", "endNode", "startReusableGroup", "endReusableGroup", "marker", "endToMarker", "V", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", "apply", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "left", "right", "joinKey", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "rememberedValue", "()Ljava/lang/Object;", "updateRememberedValue", "(Ljava/lang/Object;)V", "(Ljava/lang/Object;)Z", "(Z)Z", "", "(C)Z", "(I)Z", "", "(F)Z", "", "(J)Z", "", "(D)Z", "changedInstance", "Landroidx/compose/runtime/RecomposeScope;", "scope", "recordUsed", "(Landroidx/compose/runtime/RecomposeScope;)V", "parametersChanged", "flags", "shouldExecute", "(ZI)Z", "effect", "recordSideEffect", "Landroidx/compose/runtime/CompositionLocal;", "consume", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "", "Landroidx/compose/runtime/ProvidedValue;", "values", "startProviders", "([Landroidx/compose/runtime/ProvidedValue;)V", "endProviders", "startProvider", "(Landroidx/compose/runtime/ProvidedValue;)V", "endProvider", "collectParameterInformation", "Landroidx/compose/runtime/CompositionContext;", "buildContext", "()Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/Applier;", "getApplier", "()Landroidx/compose/runtime/Applier;", "getApplier$annotations", "applier", "getInserting", "()Z", "getInserting$annotations", "inserting", "getSkipping", "getSkipping$annotations", "skipping", "getDefaultsInvalid", "getDefaultsInvalid$annotations", "defaultsInvalid", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "getRecomposeScope$annotations", "recomposeScope", "getCompoundKeyHash", "()I", "getCompoundKeyHash$annotations", "compoundKeyHash", "getCurrentMarker", "getCurrentMarker$annotations", "currentMarker", "Landroidx/compose/runtime/CompositionLocalMap;", "getCurrentCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "currentCompositionLocalMap", "Landroidx/compose/runtime/tooling/CompositionData;", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "compositionData", "Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext$annotations", "applyCoroutineContext", "Companion", "Landroidx/compose/runtime/ComposerImpl;", "runtime_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public interface Composer {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    <V, T> void apply(V value, Function2<? super T, ? super V, Unit> block);

    CompositionContext buildContext();

    boolean changed(Object value);

    void collectParameterInformation();

    <T> T consume(CompositionLocal<T> key);

    <T> void createNode(Function0<? extends T> factory);

    void deactivateToEndGroup(boolean changed);

    void endDefaults();

    void endMovableGroup();

    void endNode();

    void endProvider();

    void endProviders();

    void endReplaceGroup();

    void endReplaceableGroup();

    ScopeUpdateScope endRestartGroup();

    void endReusableGroup();

    void endToMarker(int marker);

    Applier<?> getApplier();

    CoroutineContext getApplyCoroutineContext();

    CompositionData getCompositionData();

    int getCompoundKeyHash();

    CompositionLocalMap getCurrentCompositionLocalMap();

    int getCurrentMarker();

    boolean getDefaultsInvalid();

    boolean getInserting();

    RecomposeScopeImpl2 getRecomposeScope();

    boolean getSkipping();

    void insertMovableContent(MovableContent<?> value, Object parameter);

    Object joinKey(Object left, Object right);

    void recordSideEffect(Function0<Unit> effect);

    void recordUsed(RecomposeScopeImpl2 scope);

    Object rememberedValue();

    boolean shouldExecute(boolean parametersChanged, int flags);

    void skipToGroupEnd();

    void startDefaults();

    void startMovableGroup(int key, Object dataKey);

    void startNode();

    void startProvider(ProvidedValue<?> value);

    void startProviders(ProvidedValue<?>[] values);

    void startReplaceGroup(int key);

    void startReplaceableGroup(int key);

    Composer startRestartGroup(int key);

    void startReusableGroup(int key, Object dataKey);

    void startReusableNode();

    void updateRememberedValue(Object value);

    void useNode();

    default boolean changed(boolean value) {
        return changed(value);
    }

    default boolean changed(char value) {
        return changed(value);
    }

    default boolean changed(int value) {
        return changed(value);
    }

    default boolean changed(float value) {
        return changed(value);
    }

    default boolean changed(long value) {
        return changed(value);
    }

    default boolean changed(double value) {
        return changed(value);
    }

    default boolean changedInstance(Object value) {
        return changed(value);
    }

    /* compiled from: Composer.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Landroidx/compose/runtime/Composer$Companion;", "", "<init>", "()V", "Empty", "Ljava/lang/Object;", "getEmpty", "()Ljava/lang/Object;", "runtime_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Object Empty = new Object() { // from class: androidx.compose.runtime.Composer$Companion$Empty$1
            public String toString() {
                return "Empty";
            }
        };

        private Companion() {
        }

        public final Object getEmpty() {
            return Empty;
        }
    }
}
