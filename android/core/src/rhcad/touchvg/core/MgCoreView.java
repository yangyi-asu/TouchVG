/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class MgCoreView {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected MgCoreView(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MgCoreView obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_MgCoreView(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static MgCoreView fromHandle(int h) {
    long cPtr = touchvgJNI.MgCoreView_fromHandle(h);
    return (cPtr == 0) ? null : new MgCoreView(cPtr, false);
  }

  public int toHandle() {
    return touchvgJNI.MgCoreView_toHandle(swigCPtr, this);
  }

  public int viewAdapterHandle() {
    return touchvgJNI.MgCoreView_viewAdapterHandle(swigCPtr, this);
  }

  public int backDoc() {
    return touchvgJNI.MgCoreView_backDoc(swigCPtr, this);
  }

  public int backShapes() {
    return touchvgJNI.MgCoreView_backShapes(swigCPtr, this);
  }

  public int acquireFrontDoc() {
    return touchvgJNI.MgCoreView_acquireFrontDoc(swigCPtr, this);
  }

  public static void releaseDoc(int doc) {
    touchvgJNI.MgCoreView_releaseDoc(doc);
  }

  public int acquireDynamicShapes() {
    return touchvgJNI.MgCoreView_acquireDynamicShapes(swigCPtr, this);
  }

  public static void releaseShapes(int shapes) {
    touchvgJNI.MgCoreView_releaseShapes(shapes);
  }

  public boolean isDrawing() {
    return touchvgJNI.MgCoreView_isDrawing(swigCPtr, this);
  }

  public boolean isStopping() {
    return touchvgJNI.MgCoreView_isStopping(swigCPtr, this);
  }

  public int stopDrawing(boolean stop) {
    return touchvgJNI.MgCoreView_stopDrawing__SWIG_0(swigCPtr, this, stop);
  }

  public int stopDrawing() {
    return touchvgJNI.MgCoreView_stopDrawing__SWIG_1(swigCPtr, this);
  }

  public boolean isUndoRecording() {
    return touchvgJNI.MgCoreView_isUndoRecording(swigCPtr, this);
  }

  public boolean isRecording() {
    return touchvgJNI.MgCoreView_isRecording(swigCPtr, this);
  }

  public boolean isPlaying() {
    return touchvgJNI.MgCoreView_isPlaying(swigCPtr, this);
  }

  public boolean isPaused() {
    return touchvgJNI.MgCoreView_isPaused(swigCPtr, this);
  }

  public int getRecordTick(boolean forUndo, int curTick) {
    return touchvgJNI.MgCoreView_getRecordTick(swigCPtr, this, forUndo, curTick);
  }

  public boolean isUndoLoading() {
    return touchvgJNI.MgCoreView_isUndoLoading(swigCPtr, this);
  }

  public boolean canUndo() {
    return touchvgJNI.MgCoreView_canUndo(swigCPtr, this);
  }

  public boolean canRedo() {
    return touchvgJNI.MgCoreView_canRedo(swigCPtr, this);
  }

  public int getRedoIndex() {
    return touchvgJNI.MgCoreView_getRedoIndex(swigCPtr, this);
  }

  public int getRedoCount() {
    return touchvgJNI.MgCoreView_getRedoCount(swigCPtr, this);
  }

  public int getPlayingTick(int curTick) {
    return touchvgJNI.MgCoreView_getPlayingTick(swigCPtr, this, curTick);
  }

  public int getFrameTick() {
    return touchvgJNI.MgCoreView_getFrameTick(swigCPtr, this);
  }

  public int getFrameFlags() {
    return touchvgJNI.MgCoreView_getFrameFlags(swigCPtr, this);
  }

  public int getFrameIndex() {
    return touchvgJNI.MgCoreView_getFrameIndex(swigCPtr, this);
  }

  public boolean isPressDragging() {
    return touchvgJNI.MgCoreView_isPressDragging(swigCPtr, this);
  }

  public boolean isDrawingCommand() {
    return touchvgJNI.MgCoreView_isDrawingCommand(swigCPtr, this);
  }

  public boolean isCommand(String name) {
    return touchvgJNI.MgCoreView_isCommand(swigCPtr, this, name);
  }

  public void getCommand(MgStringCallback c) {
    touchvgJNI.MgCoreView_getCommand(swigCPtr, this, MgStringCallback.getCPtr(c), c);
  }

  public boolean setCommand(String name, String params) {
    return touchvgJNI.MgCoreView_setCommand__SWIG_0(swigCPtr, this, name, params);
  }

  public boolean setCommand(String name) {
    return touchvgJNI.MgCoreView_setCommand__SWIG_1(swigCPtr, this, name);
  }

  public boolean switchCommand() {
    return touchvgJNI.MgCoreView_switchCommand(swigCPtr, this);
  }

  public boolean doContextAction(int action) {
    return touchvgJNI.MgCoreView_doContextAction(swigCPtr, this, action);
  }

  public void clearCachedData() {
    touchvgJNI.MgCoreView_clearCachedData(swigCPtr, this);
  }

  public int addShapesForTest() {
    return touchvgJNI.MgCoreView_addShapesForTest(swigCPtr, this);
  }

  public int getShapeCount() {
    return touchvgJNI.MgCoreView_getShapeCount__SWIG_0(swigCPtr, this);
  }

  public int getShapeCount(int doc) {
    return touchvgJNI.MgCoreView_getShapeCount__SWIG_1(swigCPtr, this, doc);
  }

  public int getChangeCount() {
    return touchvgJNI.MgCoreView_getChangeCount(swigCPtr, this);
  }

  public int getDrawCount() {
    return touchvgJNI.MgCoreView_getDrawCount(swigCPtr, this);
  }

  public int getSelectedShapeCount() {
    return touchvgJNI.MgCoreView_getSelectedShapeCount(swigCPtr, this);
  }

  public int getSelectedShapeType() {
    return touchvgJNI.MgCoreView_getSelectedShapeType(swigCPtr, this);
  }

  public int getSelectedShapeID() {
    return touchvgJNI.MgCoreView_getSelectedShapeID(swigCPtr, this);
  }

  public void clear() {
    touchvgJNI.MgCoreView_clear(swigCPtr, this);
  }

  public boolean loadFromFile(String vgfile, boolean readOnly) {
    return touchvgJNI.MgCoreView_loadFromFile__SWIG_0(swigCPtr, this, vgfile, readOnly);
  }

  public boolean loadFromFile(String vgfile) {
    return touchvgJNI.MgCoreView_loadFromFile__SWIG_1(swigCPtr, this, vgfile);
  }

  public boolean saveToFile(int doc, String vgfile, boolean pretty) {
    return touchvgJNI.MgCoreView_saveToFile__SWIG_0(swigCPtr, this, doc, vgfile, pretty);
  }

  public boolean saveToFile(int doc, String vgfile) {
    return touchvgJNI.MgCoreView_saveToFile__SWIG_1(swigCPtr, this, doc, vgfile);
  }

  public boolean saveToFile(String vgfile, boolean pretty) {
    return touchvgJNI.MgCoreView_saveToFile__SWIG_2(swigCPtr, this, vgfile, pretty);
  }

  public boolean saveToFile(String vgfile) {
    return touchvgJNI.MgCoreView_saveToFile__SWIG_3(swigCPtr, this, vgfile);
  }

  public boolean loadShapes(MgStorage s, boolean readOnly) {
    return touchvgJNI.MgCoreView_loadShapes__SWIG_0(swigCPtr, this, MgStorage.getCPtr(s), s, readOnly);
  }

  public boolean loadShapes(MgStorage s) {
    return touchvgJNI.MgCoreView_loadShapes__SWIG_1(swigCPtr, this, MgStorage.getCPtr(s), s);
  }

  public boolean saveShapes(int doc, MgStorage s) {
    return touchvgJNI.MgCoreView_saveShapes__SWIG_0(swigCPtr, this, doc, MgStorage.getCPtr(s), s);
  }

  public boolean saveShapes(MgStorage s) {
    return touchvgJNI.MgCoreView_saveShapes__SWIG_1(swigCPtr, this, MgStorage.getCPtr(s), s);
  }

  public void getContent(int doc, MgStringCallback c) {
    touchvgJNI.MgCoreView_getContent__SWIG_0(swigCPtr, this, doc, MgStringCallback.getCPtr(c), c);
  }

  public void getContent(MgStringCallback c) {
    touchvgJNI.MgCoreView_getContent__SWIG_1(swigCPtr, this, MgStringCallback.getCPtr(c), c);
  }

  public void freeContent() {
    touchvgJNI.MgCoreView_freeContent(swigCPtr, this);
  }

  public boolean setContent(String content) {
    return touchvgJNI.MgCoreView_setContent(swigCPtr, this, content);
  }

  public boolean zoomToExtent() {
    return touchvgJNI.MgCoreView_zoomToExtent(swigCPtr, this);
  }

  public boolean zoomToModel(float x, float y, float w, float h) {
    return touchvgJNI.MgCoreView_zoomToModel(swigCPtr, this, x, y, w, h);
  }

  public GiContext getContext(boolean forChange) {
    return new GiContext(touchvgJNI.MgCoreView_getContext(swigCPtr, this, forChange), false);
  }

  public void setContext(int mask) {
    touchvgJNI.MgCoreView_setContext__SWIG_0(swigCPtr, this, mask);
  }

  public void setContext(GiContext ctx, int mask, int apply) {
    touchvgJNI.MgCoreView_setContext__SWIG_1(swigCPtr, this, GiContext.getCPtr(ctx), ctx, mask, apply);
  }

  public void setContextEditing(boolean editing) {
    touchvgJNI.MgCoreView_setContextEditing(swigCPtr, this, editing);
  }

  public int addImageShape(String name, float width, float height) {
    return touchvgJNI.MgCoreView_addImageShape__SWIG_0(swigCPtr, this, name, width, height);
  }

  public int addImageShape(String name, float xc, float yc, float w, float h) {
    return touchvgJNI.MgCoreView_addImageShape__SWIG_1(swigCPtr, this, name, xc, yc, w, h);
  }

  public boolean hasImageShape(int doc) {
    return touchvgJNI.MgCoreView_hasImageShape(swigCPtr, this, doc);
  }

  public int findShapeByImageID(int doc, String name) {
    return touchvgJNI.MgCoreView_findShapeByImageID(swigCPtr, this, doc, name);
  }

  public int traverseImageShapes(int doc, MgFindImageCallback c) {
    return touchvgJNI.MgCoreView_traverseImageShapes(swigCPtr, this, doc, MgFindImageCallback.getCPtr(c), c);
  }

  public boolean getDisplayExtent(Floats box) {
    return touchvgJNI.MgCoreView_getDisplayExtent__SWIG_0(swigCPtr, this, Floats.getCPtr(box), box);
  }

  public boolean getDisplayExtent(int doc, int gs, Floats box) {
    return touchvgJNI.MgCoreView_getDisplayExtent__SWIG_1(swigCPtr, this, doc, gs, Floats.getCPtr(box), box);
  }

  public boolean getBoundingBox(Floats box) {
    return touchvgJNI.MgCoreView_getBoundingBox__SWIG_0(swigCPtr, this, Floats.getCPtr(box), box);
  }

  public boolean getBoundingBox(Floats box, int shapeId) {
    return touchvgJNI.MgCoreView_getBoundingBox__SWIG_1(swigCPtr, this, Floats.getCPtr(box), box, shapeId);
  }

  public boolean getBoundingBox(int doc, int gs, Floats box, int shapeId) {
    return touchvgJNI.MgCoreView_getBoundingBox__SWIG_2(swigCPtr, this, doc, gs, Floats.getCPtr(box), box, shapeId);
  }

  public boolean displayToModel(Floats d) {
    return touchvgJNI.MgCoreView_displayToModel(swigCPtr, this, Floats.getCPtr(d), d);
  }

}
