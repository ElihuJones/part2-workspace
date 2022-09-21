package com.entertainment;

import static org.junit.Assert.*;

import org.junit.Test;

public class TelevisionTest {

  Television tv1 = new Television("Vizio", 43, DisplayType.LED);

  @Test
  public void testSetVolume() {
    tv1.setVolume(55);
    assertEquals(55, tv1.getVolume());
  }

  @Test
  public void testSetVolumeIllegalArgumentException() throws IllegalArgumentException {
    tv1.setVolume(-1);
  }

  @Test
  public void testChangeChannel() throws InvalidChannelException {
    tv1.changeChannel(19);
    assertEquals(19, tv1.getCurrentChannel());
  }

  @Test
  public void testChangeChannelInvalidChallengeException() throws InvalidChannelException {
    tv1.changeChannel(-32);
  }

  @Test
  public void TestCompareTo() {
  }

  @Test
  public void testHashCode() {
  }

  @Test
  public void testEquals() {
  }
}